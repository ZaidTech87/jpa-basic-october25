package com.example.jpa_basic_october;

import jakarta.persistence.*;

@Entity
@Table(name = "user_data") // keep table names lowercase for convention
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- Auto-generate ID in MySQL
    private int id;
@Column(name = "first")
    private String name;
@Column(name = "second")
    private String mobile_no;
@Column(name = "third")
    private int age;

    // --- Constructors ---
    public User() {}

    public User(String name, String mobile_no, int age) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.age = age;
    }

    // --- Getters and Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
