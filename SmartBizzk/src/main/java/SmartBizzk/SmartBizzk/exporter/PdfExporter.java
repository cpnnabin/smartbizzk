//package SmartBizzk.SmartBizzk.exporter;
//
//import SmartBizzk.SmartBizzk.entity.PartyLedger;
//import jakarta.servlet.http.HttpServletResponse;
//import com.lowagie.text.*;
//import com.lowagie.text.pdf.*;
//
//import java.awt.*;
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class PdfExporter {
//
//    public static void exportLedgerToPdf(List<PartyLedger> ledgers, HttpServletResponse response) throws IOException {
//        Document document = new Document(PageSize.A4);
//        PdfWriter.getInstance(document, response.getOutputStream());
//
//        document.open();
//
//        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
//        Paragraph title = new Paragraph("Party Ledger", font);
//        title.setAlignment(Element.ALIGN_CENTER);
//        document.add(title);
//
//        PdfPTable table = new PdfPTable(5);
//        table.setSpacingBefore(10);
//
//        Stream.of("Date", "Party Name", "Description", "Credit", "Debit").forEach(col -> {
//            PdfPCell cell = new PdfPCell(new Phrase(col));
//            cell.setBackgroundColor(Color.LIGHT_GRAY);
//            cell.setPadding(5);
//            table.addCell(cell);
//        });
//
//        for (PartyLedger ledger : ledgers) {
//            table.addCell(ledger.getDate().toString());
//            table.addCell(ledger.getPartyName());
//            table.addCell(ledger.getDescription());
//            table.addCell(String.valueOf(ledger.getCredit()));
//            table.addCell(String.valueOf(ledger.getDebit()));
//        }
//
//        document.add(table);
//        document.close();
//    }
//}
