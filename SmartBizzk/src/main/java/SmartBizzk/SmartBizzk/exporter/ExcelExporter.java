//package SmartBizzk.SmartBizzk.exporter;
//
//import SmartBizzk.SmartBizzk.entity.PartyLedger;
//import jakarta.servlet.http.HttpServletResponse;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.IOException;
//import java.util.List;
//
//public class ExcelExporter {
//
//    public static void exportLedgerToExcel(List<PartyLedger> ledgers, HttpServletResponse response) throws IOException {
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Party Ledger");
//
//        // Header style
//        CellStyle headerStyle = workbook.createCellStyle();
//        Font font = workbook.createFont();
//        font.setBold(true);
//        headerStyle.setFont(font);
//
//        // Create header row with style
//        Row header = sheet.createRow(0);
//        String[] columns = {"Date", "Party Name", "Description", "Credit", "Debit"};
//        for (int i = 0; i < columns.length; i++) {
//            Cell cell = header.createCell(i);
//            cell.setCellValue(columns[i]);
//            cell.setCellStyle(headerStyle);
//        }
//
//        int rowIdx = 1;
//        for (PartyLedger ledger : ledgers) {
//            Row row = sheet.createRow(rowIdx++);
//            row.createCell(0).setCellValue(ledger.getDate().toString());
//            row.createCell(1).setCellValue(ledger.getPartyName());
//            row.createCell(2).setCellValue(ledger.getDescription());
//            row.createCell(3).setCellValue(ledger.getCredit());
//            row.createCell(4).setCellValue(ledger.getDebit());
//        }
//
//        // Autosize all columns
//        for (int i = 0; i < columns.length; i++) {
//            sheet.autoSizeColumn(i);
//        }
//
//        workbook.write(response.getOutputStream());
//        workbook.close();
//    }
//}
