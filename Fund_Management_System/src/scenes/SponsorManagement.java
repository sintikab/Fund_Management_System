/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import common.AppStrings;
import components.Message;
import db_connection.DBConnect;
import java.sql.Date;
import java.sql.ResultSet;
import models.Sponsor;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class SponsorManagement extends javax.swing.JFrame {
Sponsor sponsor = null;
boolean is_row_selected = false;
    /**
     * Creates new form SponsorManagement
     */
    public SponsorManagement() {
        initComponents();
        init();
        tableload();
    }
    
    public void init(){
        sponsor = new Sponsor();
        sponsor_id.setText(sponsor.getId());
        sponsor_id.setEditable(false);
    }
    
    private void clearFields(){
        sponsor = new Sponsor();
        sponsor_id.setText(sponsor.getId());
        sponsor_name.setText("");
        sponsor_phone.setText("");
        sponsor_email.setText("");
        sponsor_address.setText("");
        sponsor_dob.setDate(null);
    }
    
    private void tableload(){
        String qry = "SELECT name, contact, email from sponsor where status = 'ACTIVE'";
        ResultSet resultSet = DBConnect.selectDB(qry);
        sponsortable.setModel(DbUtils.resultSetToTableModel(resultSet));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sponsor_id = new javax.swing.JTextField();
        sponsor_name = new javax.swing.JTextField();
        sponsor_phone = new javax.swing.JTextField();
        sponsor_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sponsor_address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sponsortable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        sponsor_dob = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButton.setText("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("SponsorID : ");

        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Sponsor Details");

        jLabel4.setText("Contact:");

        jLabel5.setText("Address:");

        jLabel6.setText("Email:");

        jLabel7.setText("Date of birth:");

        sponsor_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsor_idActionPerformed(evt);
            }
        });

        sponsor_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsor_nameActionPerformed(evt);
            }
        });
        sponsor_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sponsor_nameKeyTyped(evt);
            }
        });

        sponsor_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsor_phoneActionPerformed(evt);
            }
        });
        sponsor_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sponsor_phoneKeyTyped(evt);
            }
        });

        sponsor_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsor_emailActionPerformed(evt);
            }
        });

        sponsor_address.setColumns(20);
        sponsor_address.setRows(5);
        jScrollPane1.setViewportView(sponsor_address);

        sponsortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sponsortable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sponsortableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sponsortable);

        jButton4.setText("< Management Selection");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel10))
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9)))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sponsor_name, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(sponsor_id)
                                        .addComponent(sponsor_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(sponsor_email, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(sponsor_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(sponsor_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sponsor_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sponsor_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sponsor_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6))
                            .addComponent(sponsor_dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(addButton)
                    .addComponent(returnButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        sponsor.setName(sponsor_name.getText());
        sponsor.setContact(sponsor_phone.getText());
        sponsor.setEmail(sponsor_email.getText());
        sponsor.setDob(sponsor_dob.getDate());
        sponsor.setAddress(sponsor_address.getText());
        
        if (sponsor.validateValues()){
             sponsor.insertSponsor();
             clearFields();
             tableload();
        }else{
            Message.showError(AppStrings.EMPTY_MANDATORY_FIELDS, AppStrings.ERROR);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        sponsor = new Sponsor(
                    sponsor_id.getText(),
                    sponsor_name.getText(),
                    sponsor_phone.getText(),
                    sponsor_email.getText(),
                    sponsor_dob.getDate(),
                    sponsor_address.getText());
        
        if (sponsor.validateValues()){
        int user_response = Message.showUpdateMessage(AppStrings.SPONSOR);
       
        if (user_response == 0){
                sponsor.updateSponsor();
                tableload();
        }
        }else{
                Message.showError(AppStrings.EMPTY_MANDATORY_FIELDS, AppStrings.ERROR);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int user_response = Message.showDeleteMessage(AppStrings.SPONSOR);
        
        if (user_response == 0){
            sponsor = new Sponsor();
            sponsor.setId(sponsor_id.getText());
            
                sponsor.deleteSponsor();
                tableload(); 
                clearFields();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sponsor_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsor_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sponsor_idActionPerformed

    private void sponsor_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsor_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sponsor_nameActionPerformed

    private void sponsor_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsor_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sponsor_phoneActionPerformed

    private void sponsor_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsor_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sponsor_emailActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManagemetSelection managemetSelection = new ManagemetSelection();
        managemetSelection.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void sponsortableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sponsortableMouseClicked
       
        //Set row values to fields
        int row = sponsortable.getSelectedRow();
        
        Sponsor sponsor = new Sponsor(sponsortable.getValueAt(row, 0).toString(), sponsortable.getValueAt(row, 1).toString(), sponsortable.getValueAt(row, 2).toString());
        sponsor.findUserIdFromNameEmailContact();
        sponsor.findSponsorDetailsFromId();
        
        sponsor_id.setText(sponsor.getId());
        sponsor_name.setText(sponsor.getName());
        sponsor_phone.setText(sponsor.getContact());
        sponsor_email.setText(sponsor.getEmail());
        sponsor_dob.setDate(sponsor.getDob());
        sponsor_address.setText(sponsor.getAddress());
        
        addButton.setVisible(false);
    }//GEN-LAST:event_sponsortableMouseClicked

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        clearFields();
        addButton.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void sponsor_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sponsor_nameKeyTyped
        // TODO add your handling code here:
         if(!(Character.isLetter(evt.getKeyChar()))){
                evt.consume();
            }
    }//GEN-LAST:event_sponsor_nameKeyTyped

    private void sponsor_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sponsor_phoneKeyTyped
        
           if(!(Character.isDigit(evt.getKeyChar()))){
                evt.consume();
            }
    }//GEN-LAST:event_sponsor_phoneKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SponsorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SponsorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SponsorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SponsorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SponsorManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextArea sponsor_address;
    private com.toedter.calendar.JDateChooser sponsor_dob;
    private javax.swing.JTextField sponsor_email;
    private javax.swing.JTextField sponsor_id;
    private javax.swing.JTextField sponsor_name;
    private javax.swing.JTextField sponsor_phone;
    private javax.swing.JTable sponsortable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
