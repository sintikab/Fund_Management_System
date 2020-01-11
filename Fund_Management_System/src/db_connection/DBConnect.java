/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnect {
        Connection connection = null;
        
        //Create connection
        public static Connection DonnectDB(){
            try{
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:fund_management_system_db.db");
                JOptionPane.showMessageDialog(null, "Connection Success");
                
                return conn;
            }catch(Exception e){
                e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Connection Fail");
            }
            return null;
        }
     
}
