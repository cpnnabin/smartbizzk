package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.Item;
import SmartBizzk.SmartBizzk.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // Show all items - mapped to items.html
    @GetMapping
    public String itemsPage(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "items";  // templates/items.html
    }

    // Show list page (alternative) - mapped to list.html
    @GetMapping("/list")
    public String listPage(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "list";  // templates/list.html
    }

    // Show form to add new item - mapped to create.html or AddItem.html
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("item", new Item());
        return "create";  // templates/create.html
    }

    // Alternative create form page
    @GetMapping("/add")
    public String showAddItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "AddItem"; // templates/AddItem.html
    }

    // Save new item (used by both forms)
    @PostMapping
    public String saveItem(@ModelAttribute Item item) {
        itemService.saveItem(item);
        return "redirect:/items";
    }

    // Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Item item = itemService.getItemById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid item ID: " + id));
        model.addAttribute("item", item);
        return "edit";  // templates/edit.html
    }

    // Update existing item
    @PostMapping("/update/{id}")
    public String updateItem(@PathVariable Long id, @ModelAttribute Item item) {
        item.setId(id);
        itemService.saveItem(item);
        return "redirect:/items";
    }

    // Delete item
    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "redirect:/items";
    }
}
