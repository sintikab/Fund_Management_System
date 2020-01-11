/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Message {
    
    public static void showError(String message, String title){
    JOptionPane.showMessageDialog(null, message,
      title, JOptionPane.ERROR_MESSAGE);
}
    
     public static void showInfoMessage(String message, String title){
    JOptionPane.showMessageDialog(null, message,
      title, JOptionPane.INFORMATION_MESSAGE);
}
}
