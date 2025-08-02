//import SmartBizzk.SmartBizzk.entity.PartyLedger;
//import SmartBizzk.SmartBizzk.exporter.ExcelExporter;
//import SmartBizzk.SmartBizzk.exporter.PdfExporter;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//import java.util.List;
//
//@RestController
//public class ExportController {
//
//    // Assume you have a service to fetch ledgers
//    private final LedgerService ledgerService;
//
//    public ExportController(LedgerService ledgerService) {
//        this.ledgerService = ledgerService;
//    }
//
//    @GetMapping("/export")
//    public void export(@RequestParam String type, HttpServletResponse response) throws IOException {
//        List<PartyLedger> ledgers = ledgerService.getAllLedgers();
//
//        if ("pdf".equalsIgnoreCase(type)) {
//            response.setContentType("application/pdf");
//            response.setHeader("Content-Disposition", "attachment; filename=party_ledger.pdf");
//            PdfExporter.exportLedgerToPdf(ledgers, response);
//        } else if ("excel".equalsIgnoreCase(type)) {
//            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//            response.setHeader("Content-Disposition", "attachment; filename=party_ledger.xlsx");
//            ExcelExporter.exportLedgerToExcel(ledgers, response);
//        } else {
//            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid export type");
//        }
//    }
//}
