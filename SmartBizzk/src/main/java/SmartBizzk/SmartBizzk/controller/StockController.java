package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.Stock;
import SmartBizzk.SmartBizzk.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public String listStocks(Model model) {
        model.addAttribute("stocks", stockService.getAllStocks());
        return "stock/list"; // e.g., templates/stock/list.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("stock", new Stock());
        return "stock/add"; // e.g., templates/stock/add.html
    }

    @PostMapping("/save")
    public String saveStock(@ModelAttribute("stock") Stock stock) {
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Stock stock = stockService.getStockById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid ID: " + id));
        model.addAttribute("stock", stock);
        return "stock/edit";
    }

    @PostMapping("/update/{id}")
    public String updateStock(@PathVariable("id") Long id, @ModelAttribute("stock") Stock stock) {
        stock.setId(id);
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/delete/{id}")
    public String deleteStock(@PathVariable("id") Long id) {
        stockService.deleteStock(id);
        return "redirect:/stocks";
    }
    @GetMapping("/reports/stock-summary")
    public String stockSummaryReport(Model model) {
        model.addAttribute("stocks", stockService.getAllStocks());
        return "reports/stock-summary";
    }

}
