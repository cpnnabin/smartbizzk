package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.entity.Party;
import SmartBizzk.SmartBizzk.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    @GetMapping
    public String listParties(Model model) {
        model.addAttribute("parties", partyService.getAllParties());
        model.addAttribute("party", new Party());
        return "Parties";
    }

    @PostMapping("/save")
    public String saveParty(@ModelAttribute Party party) {
        partyService.saveParty(party);
        return "redirect:/parties";
    }

    @GetMapping("/edit/{id}")
    public String editParty(@PathVariable Long id, Model model) {
        Party party = partyService.getPartyById(id);
        model.addAttribute("party", party);
        model.addAttribute("parties", partyService.getAllParties());
        return "Parties";
    }

    @GetMapping("/delete/{id}")
    public String deleteParty(@PathVariable Long id) {
        partyService.deleteParty(id);
        return "redirect:/parties";
    }
}