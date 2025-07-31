package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.PaymentOut;
import SmartBizzk.SmartBizzk.service.PaymentOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payment-out")
public class PaymentOutController {

    @Autowired
    private PaymentOutService service;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("payments", service.getAll());
        return "paymentout/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("paymentOut", new PaymentOut());
        return "paymentout/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute PaymentOut paymentOut) {
        service.save(paymentOut);
        return "redirect:/payment-out/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/payment-out/list";
    }
}
