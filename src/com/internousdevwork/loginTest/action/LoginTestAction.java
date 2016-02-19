package com.internousdevwork.loginTest.action;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;


import org.apache.struts2.interceptor.SessionAware;
import com.internousdevwork.loginTest.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdevwork.loginTest.dto.LoginDTO;

/**
* @author internous
*
*/

public class LoginTestAction extends ActionSupport implements SessionAware{
   
   private String id;
   private int password;
   public String loginError;
   private Map<String,Object>session;
   public String myId = null;
   public int myPass=0;
   
   
   
   LoginDAO dao = new LoginDAO();
   LoginDTO dto = new LoginDTO();

   public String execute(){
       LoginDAO dao = new LoginDAO(); //LoginDAOクラスを作成すると波線が消える
       boolean res = dao.select(id,password);
      
       if(!res){
           loginError = "ログインできませんでした。";
           return ERROR;
       }
       dto.setId(id);
       dto.setPassword(password);
       
       myId = id;
       myPass = password;
       
     

       return SUCCESS;
   }

/**
 * @return id
 */
public String getId() {
    return id;
}

/**
 * @param id セットする id
 */
public void setId(String id) {
    this.id = id;
}

/**
 * @return password
 */
public int getPassword() {
    return password;
}

/**
 * @param password セットする password
 */
public void setPassword(int password) {
    this.password = password;
}

/**
 * @return loginError
 */
public String getLoginError() {
    return loginError;
}

/**
 * @param loginError セットする loginError
 */
public void setLoginError(String loginError) {
    this.loginError = loginError;
}

/**
 * @return session
 */
public Map<String, Object> getSession() {
    return session;
}

/**
 * @param session セットする session
 */
public void setSession(Map<String, Object> session) {
    this.session = session;
}



}