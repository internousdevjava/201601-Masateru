package com.internousdevwork.loginTest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.internousdevwork.loginTest.util.DBConnector2;
import com.internousdevwork.loginTest.dto.LoginDTO;

public class LoginDAO {
    
    private boolean res;
    private Connection con;
    private String sql;
    private ResultSet rs;



    public boolean select(String id, int password){ //DAOのselectの戻りはboolean
        res = false;
        LoginDTO dto = new LoginDTO();
        try{
            con = (Connection)DBConnector2.getConnection("struts2");//Mysqlへ接続
            Statement stm = con.createStatement();
            sql = "SELECT * FROM login_table WHERE id = '"+id+"' and password = '"+password+"'";  //login_tableがテーブル名
            rs = stm.executeQuery(sql);
        
            if(rs.next()){
                res = true;
                return res;
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return res;
    }

    
}

