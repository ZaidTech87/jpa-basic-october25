package com.example.jpa_basic_october;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Card {
    @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
    int card_no;
    Date expiry;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToOne
    @JoinColumn
    User user;
}
