package com.example.jpa_basic_october;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Card {
    @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
  private   int card_no;
  private   Date expiry;
    @Enumerated(EnumType.STRING)
  private   Status status;
    @OneToOne
    @JoinColumn
  private   User user;

    public Card() {}
    public Card(int card_no, Date expiry, Status status, User user) {
        this.card_no = card_no;
        this.expiry = expiry;
        this.status = status;
        this.user = user;
    }
    public int getCard_no() {
        return card_no;
    }
    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }
    public Date getExpiry() {
        return expiry;
    }
    public void setExpiry(Date expiry) {
        this.expiry = expiry;

    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
