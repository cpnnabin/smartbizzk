package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.LedgerEntry;
import SmartBizzk.SmartBizzk.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/ledger")
public class LedgerController {

    @Autowired
    private LedgerService ledgerService;

    @GetMapping("/all")
    public String viewAllLedger(@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
                                Model model) {

        List<LedgerEntry> ledgerEntries;

        if (startDate != null && endDate != null) {
            ledgerEntries = ledgerService.getLedgerByDateRange(startDate, endDate);
        } else {
            ledgerEntries = ledgerService.getAllLedgerEntries();
        }

        model.addAttribute("entries", ledgerEntries);
        return "ledger/all";
    }
}
