//package SmartBizzk.SmartBizzk.controller;
//
//import SmartBizzk.SmartBizzk.service.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/reports")
//public class ReportsController {
//
//    @Autowired
//    private RecordService RecordService;
//
//    @Autowired
//    private PaymentInService paymentInService;
//
//    @Autowired
//    private PaymentOutService paymentOutService;
//
//    @Autowired
//    private SalesInvoiceService salesInvoiceService;
//
//    @Autowired
//    private PurchaseService purchaseService;
//
//    @GetMapping
//    public String reportsPage(Model model) {
//        // Add summary data for reports
//        RecordService recordService = null;
//        model.addAttribute("records", recordService.getAllRecords());
//        model.addAttribute("paymentsIn", paymentInService.getAll());
//        model.addAttribute("paymentsOut", paymentOutService.getAll());
//        model.addAttribute("invoices", salesInvoiceService.getAllInvoices());
//        model.addAttribute("purchases", purchaseService.getAllPurchases());
//
//        return "Reports";
//    }
//}