package SmartBizzk.SmartBizzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {

    @GetMapping("/purchase")
    public String purchasePage() {
        return "Purchase";
    }
}