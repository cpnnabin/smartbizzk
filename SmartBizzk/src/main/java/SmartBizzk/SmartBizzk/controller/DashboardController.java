//package SmartBizzk.SmartBizzk.controller;
//
//import com.meta.smartbizmanager.service.StockService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class DashboardController {
//
//    @Autowired
//    private StockService stockService;
//
//    @GetMapping("/dashboard")
//    public String dashboard(Model model) {
//        model.addAttribute("stockIn", stockService.getTotalIn());
//        model.addAttribute("stockOut", stockService.getTotalOut());
//        model.addAttribute("stockTotal", stockService.getCurrentStock());
//        return "dashboard";
//    }
//}
