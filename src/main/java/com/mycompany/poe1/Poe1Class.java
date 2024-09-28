/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

/**
 *
 * @author RC_Student_lab
 */
public class Poe1Class {
      //declaration
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    
//the getter and setter methods
    public String getUsername() {
        return username;
    }

   public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //constructors to activate username and password
    
    public boolean checkusername(String username){
        //check if username is more than 5 characters long and contains an underscore
        return username.length()>=5&& username.contains("_");
    }
    public boolean checkpasswordcomplexity(String userpassword, boolean specialcheck){
        
        //checks if password is at least 8 characters long
        
        boolean lengthcheck = userpassword.length()>=8;
    


//check if password contains a capital letter,number and a special character

boolean capitalCheck = false;
boolean numberCheck = false;
boolean specialCheck = false;
boolean check= false;

for(char c:
        userpassword.toCharArray()){
    if(Character.isUpperCase(c)){
       boolean capitalcheck = true;
       
    }else if(Character.isDigit(c)){
        boolean numbercheck = true;
        
    }else if(Character.isLetterorDigit(c)){
       boolean specialcheck = true;
    }
    
