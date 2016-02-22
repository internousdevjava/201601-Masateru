package com.internousdevwork.loginTest.action;

import java.util.Map;
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
   private String password;
   private int password1;
   public String loginError;
   private Map<String,Object>session;
   public String myId = null;
   public int myPass = 0 ;
   public String numberError;
   
   
   
   LoginDAO dao = new LoginDAO();


   public String execute(){
       
       if(!password.matches("[0-9]{1,}")){
           numberError = "数字を入力してください。";
           return ERROR;
       }
       password1 = Integer.parseInt(password);
       
       LoginDAO dao = new LoginDAO(); //LoginDAOクラスを作成すると波線が消える
       boolean res = dao.select(id,password1);
      
       if(!res){
           loginError = "ログインできませんでした。";
           return ERROR;
       }
       LoginDTO dto = new LoginDTO(id,password1);
      
       session.put("myId", dto.getId());
       session.put("myPass", dto.getPassword());
       myId = dto.getId();
       
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
public String getPassword() {
    return password;
}



/**
 * @param password セットする password
 */
public void setPassword(String password) {
    this.password = password;
}



/**
 * @return password1
 */
public int getPassword1() {
    return password1;
}



/**
 * @param password1 セットする password1
 */
public void setPassword1(int password1) {
    this.password1 = password1;
}



/**
 * @return myId
 */
public String getMyId() {
    return myId;
}



/**
 * @param myId セットする myId
 */
public void setMyId(String myId) {
    this.myId = myId;
}



/**
 * @return myPass
 */
public int getMyPass() {
    return myPass;
}



/**
 * @param myPass セットする myPass
 */
public void setMyPass(int myPass) {
    this.myPass = myPass;
}



/**
 * @return numberError
 */
public String getNumberError() {
    return numberError;
}



/**
 * @param numberError セットする numberError
 */
public void setNumberError(String numberError) {
    this.numberError = numberError;
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