package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.PaymentIn;
import SmartBizzk.SmartBizzk.entity.Party;
import SmartBizzk.SmartBizzk.service.PaymentInService;
import SmartBizzk.SmartBizzk.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payments/in")
public class PaymentInController {

    @Autowired
    private PaymentInService paymentInService;

    @Autowired
    private PartyService partyService;

    @GetMapping("/new")
    public String showPaymentForm(Model model) {
        model.addAttribute("paymentIn", new PaymentIn());
        model.addAttribute("parties", partyService.getAllParties());
        return "PaymentIn";
    }

    @PostMapping("/save")
    public String savePayment(@ModelAttribute PaymentIn paymentIn) {
        paymentInService.save(paymentIn);
        return "redirect:/payments/in/list";
    }

    @GetMapping("/list")
    public String listPayments(Model model) {
        model.addAttribute("payments", paymentInService.getAll());
        return "PaymentInList";
    }

    // Add edit and delete methods if needed
}
