package com.internousdevwork.loginTest.dto;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class LoginDTO {
   private String id;
   private int password;

   public LoginDTO(){
       this.id = null;
       this.password = 0;
   }
   public LoginDTO(String id,int password){
       this.id = id;
       this.password = password;
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
