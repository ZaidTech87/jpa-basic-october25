package com.example.jpa_basic_october;

import org.springframework.beans.factory.annotation.Autowired;

public class CardServise {
    @Autowired
    CardReposatory cardRepo;
    public String addCard(Card card) {
        cardRepo.save(card);
        return "card is added";
    }
}
