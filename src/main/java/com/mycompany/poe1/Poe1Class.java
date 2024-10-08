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
       if(checkusername(username)){
        this.username = username;
           System.out.println("username successfully captured");
    }else{
           System.out.println("username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");
       }
   }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(checkpasswordcomplexity(password)){
        this.password = password;
            System.out.println("password successfully captured");
    }else{
            System.out.println("password is not correctly formatted,please ensure that the password contains atleast 8 characters,a letter,a number and a special character");
        }
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
    public boolean checkusername(String username) {
        return username.length() >= 5 && username.contains("_");
    }
    public boolean checkpasswordcomplexity(String userpassword) {
        boolean lengthcheck = userpassword.length() >= 8;
        boolean capitalCheck = false;
        boolean numberCheck = false;
        boolean specialCheck = false;
        
        for (char c : userpassword.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCheck = true;
            } else if (Character.isDigit(c)) {
                numberCheck = true;
            } else if (!Character.isLetterOrDigit(c)) {
                specialCheck = true;
            }
        }
        return lengthcheck && capitalCheck && numberCheck && specialCheck;
    }
public void authenticate(String inputUsername,String inputPassword){
    if(inputUsername.equals(this.username) && inputPassword.equals(this.password)){
        System.out.println("welcome" + firstname + "" + lastname + "it is great to see you again");
    }else{
        System.out.println("usrname or password is incorrect,please try again.");
    }
}
}

