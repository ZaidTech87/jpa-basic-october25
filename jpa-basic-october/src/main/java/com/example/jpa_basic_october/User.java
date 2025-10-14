package com.example.jpa_basic_october;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table( name= "user_Data")
public class User {

   private int id;
    @Id
  private   String name;
   private String mobile_no;
   private int age;
    public User(){}
    public User(int id, String name, String mobile_no, int age) {
        this.id = id;
        this.name = name;
        this.mobile_no = mobile_no;
        this.age = age;
    }
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
