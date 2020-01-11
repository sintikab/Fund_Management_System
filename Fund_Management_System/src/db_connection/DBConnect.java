/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnect {
        Connection connection = null;
        
        //Create connection
        public static Connection connectDB(){
            try{
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:fund_management_system_db.db");
                
                return conn;
            }catch(Exception e){
                e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Connection Fail");
            }
            return null;
        }
        
        public static void insertDB(String qry){
            Connection connection = DBConnect.connectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(qry);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        public static ResultSet selectDB(String qry){
            Connection connection = DBConnect.connectDB();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            preparedStatement = connection.prepareStatement(qry);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
     
}
