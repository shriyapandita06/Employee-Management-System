/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shriyapandita
 */
public class Person {
    
   private static int personId; 
   private String name;
   private long cellPhoneNumber;
   private String emailId;
   private int age;
   private String gender;
   private House house;

    public Person(String name, long cellPhoneNumber, String emailId, int age, String gender, House house) {
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.emailId = emailId;
        this.age = age;
        this.gender = gender;
        this.house = house;
    }
   
   static {
       personId = 1;
   }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
  
}
