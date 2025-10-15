package com.example.jpa_basic_october;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
CardServise cardServise;
    @GetMapping("/addCard")
    public String addCard(Card card) {
        return cardServise.addCard(card);

    }

}
