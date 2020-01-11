/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import common.AppStrings;
import components.Components;
import components.Message;
import db_connection.DBConnect;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Sponsor {
   private String id;
   private String name;
   private String contact;
   private String email;
   private Date dob;
   private String address;
   
   public Sponsor(String name, String contact, String email, Date dob, String address){
       this.id = Components.generateUUID("Sponsor");
       this.name = name;
       this.contact = contact;
       this.email = email;
       this.dob = dob;
       this.address = address;
   }
   
    public Sponsor(){
       this.id = Components.generateUUID("Sponsor");
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
   public boolean validateValues(){
       if (this.name != null && !this.name.equals("") && this.contact != null && !this.contact.equals("") && this.email != null && !this.email.equals("")){
           return true;
       }
       return false;
   }
   
   public void insertSponsor(){
       try {
//           DBConnect.insertDB("INSERT INTO sponsor (id,name,contact,email,dob,address) VALUES ('"+this.id+"','"+this.name+"','"+this.contact+"','"+this.email+"','"+this.dob+"','"+this.address+"')");
       DBConnect.insertDB("INSERT INTO sponsor (id,name,contact,email,dob,address) VALUES ('45v0','Shahani','0763452267','shahanifar@gmail.com','','Badulla')");
Message.showInfoMessage(AppStrings.SUCCESS_INSERT, AppStrings.SUCCESS);
       } catch (Exception ex) {
           Logger.getLogger(Sponsor.class.getName()).log(Level.SEVERE, null, ex);
           Message.showError(AppStrings.SOMETHING_WRONG, AppStrings.ERROR);
       }
       
   }
   
}
