package com.training.lab3.controller;

import com.training.lab3.model.SkiPass;
import com.training.lab3.model.enumeration.PassTime;
import com.training.lab3.service.SkiPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CardController {

    final SkiPassService service;

    @Autowired
    public CardController(SkiPassService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("error", false);
        return "index.html";
    }

    @PostMapping("/")
    public String getByCardNumber(@RequestParam("number") String cardNumber, Model model) {
        Optional<SkiPass> skiPass = service.findPassByNumber(cardNumber);
        if (skiPass.isPresent()) {
            if (skiPass.get().getPassTime().equals(PassTime.LIMITED)) {
                skiPass.get().setNumberOfPasses(skiPass.get().getNumberOfPasses() - 1);
                service.createNewPass(skiPass.get());
            }
            model.addAttribute("skiPass", skiPass.get());
            return "card-info.html";
        }
        model.addAttribute("error", true);
        return "index.html";
    }

    @GetMapping("/block-card")
    public String getBlockCardPage() {
        return "block-card.html";
    }

    @PostMapping("block-card")
    public String blockCard(@RequestParam("number") String cardNumber, Model model) {
        Optional<SkiPass> skiPass = service.findPassByNumber(cardNumber);
        if (skiPass.isPresent()) {
            skiPass.get().setBlocked(true);
            service.createNewPass(skiPass.get());
            return "redirect:/";
        }
        model.addAttribute("errorBlock");
        return "block-card.html";
    }
}
