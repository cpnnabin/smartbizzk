//package SmartBizzk.SmartBizzk.controller;
//import SmartBizzk.SmartBizzk.exporter.ExcelExporter;
//import SmartBizzk.SmartBizzk.exporter.PdfExporter;
//
//import SmartBizzk.SmartBizzk.entity.PartyLedger;
//import SmartBizzk.SmartBizzk.exporter.PdfExporter;
//import SmartBizzk.SmartBizzk.service.PartyLedgerService;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.List;
//
//@Controller
//@RequestMapping("/ledger")
//public class PartyLedgerController {
//
//    @Autowired
//    private PartyLedgerService ledgerService;
//    private Object ExcelExporter;
//
//    @GetMapping("/all")
//    public String getAllLedgers(Model model) {
//        List<PartyLedger> ledgers = ledgerService.getAllLedgers();
//        model.addAttribute("ledgers", ledgers);
//        return "ledger/all-ledgers";
//    }
//
//    @GetMapping("/party")
//    public String getPartyLedger(@RequestParam("name") String name, Model model) {
//        List<PartyLedger> ledgers = ledgerService.getLedgerByParty(name);
//        model.addAttribute("ledgers", ledgers);
//        model.addAttribute("partyName", name);
//        return "ledger/party-ledger";
//    }
//    @GetMapping("/party")
//    public String getPartyLedger(
//            @RequestParam("name") String name,
//            @RequestParam(value = "startDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
//            @RequestParam(value = "endDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
//            Model model) {
//
//        List<PartyLedger> ledgers = ledgerService.getLedgerByPartyAndDateRange(name, startDate, endDate);
//        model.addAttribute("ledgers", ledgers);
//        model.addAttribute("partyName", name);
//        model.addAttribute("startDate", startDate);
//        model.addAttribute("endDate", endDate);
//        return "ledger/party-ledger";
//    }
//    @GetMapping("/party/export/excel")
//    public void exportPartyLedgerToExcel(@RequestParam("name") String name, HttpServletResponse response) throws IOException {
//        response.setContentType("application/octet-stream");
//        String headerKey = "Content-Disposition";
//        String headerValue = "attachment; filename=ledger_" + name + ".xlsx";
//        response.setHeader(headerKey, headerValue);
//
//        List<PartyLedger> ledgers = ledgerService.getLedgerByParty(name);
//
//       // ExcelExporter.exportLedgerToExcel(ledgers, response);
//    }
//
//    @GetMapping("/party/export/pdf")
//    public void exportPartyLedgerToPdf(@RequestParam("name") String name, HttpServletResponse response) throws IOException {
//        response.setContentType("application/pdf");
//        String headerKey = "Content-Disposition";
//        String headerValue = "attachment; filename=ledger_" + name + ".pdf";
//        response.setHeader(headerKey, headerValue);
//
//        List<PartyLedger> ledgers = ledgerService.getLedgerByParty(name);
//
//        PdfExporter.exportLedgerToPdf(ledgers, response);
//    }
//
//
//}
