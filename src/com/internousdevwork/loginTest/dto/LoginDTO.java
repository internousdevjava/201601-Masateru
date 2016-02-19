package com.internousdevwork.loginTest.dto;


public class LoginDTO {
   private String id;
   private int password;

   public LoginDTO(){
       this.id = null;
       this.password = 0;
   }

   public String getId() {
       return id;
   }

   public void setId(String id) {
       this.id = id;
   }

   public int getPassword() {
       return password;
   }

   public void setPassword(int password) {
       this.password = password;
   }

   
   
}
