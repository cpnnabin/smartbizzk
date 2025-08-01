package SmartBizzk.SmartBizzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expenses")
public class ExpensesController {

    @GetMapping
    public String expensesPage(Model model) {
        // You can add expense logic here if needed
        return "Expenses";
    }
}