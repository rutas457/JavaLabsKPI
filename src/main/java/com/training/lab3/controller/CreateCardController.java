package com.training.lab3.controller;

import com.training.lab3.model.SkiPass;
import com.training.lab3.model.enumeration.PassTime;
import com.training.lab3.model.enumeration.SkiType;
import com.training.lab3.service.SkiPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateCardController {
    final SkiPassService service;

    @Autowired
    public CreateCardController(SkiPassService service) {
        this.service = service;
    }

    @GetMapping("/create-card")
    public String getCreateCardPage(Model model) {
        return "select-type.html";
    }


    @GetMapping("/create-card/unlimited")
    public String getUnlimitedCardPage(Model model) {
        return "limited-pass.html";
    }

    @PostMapping("/create-card/unlimited")
    public String getUnlimitedCardPage(@RequestParam("numberOfPasses") String passes, @RequestParam("type") String type, Model model) {
        SkiPass skiPass = SkiPass.builder()
                .numberOfPasses(Integer.parseInt(passes))
                .skiType(SkiType.valueOf(type))
                .cardNumber(service.generateCardNumber())
                .blocked(false)
                .passTime(PassTime.LIMITED)
                .build();

        service.createNewPass(skiPass);
        model.addAttribute("cardNumber", skiPass.getCardNumber());
        return "successfully-activated.html";
    }

    @GetMapping("/create-card/limited")
    public String getLimitedCardPage(Model model, SkiPass skiPass) {
        return "create-card.html";
    }
}
