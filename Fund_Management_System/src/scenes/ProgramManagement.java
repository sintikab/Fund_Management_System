/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import common.AppStrings;
import components.Message;
import db_connection.DBConnect;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Program;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class ProgramManagement extends javax.swing.JFrame {
Program program = null;
boolean is_row_selected = false;
    /**
     * Creates new form SponsorManagement
     */
    public ProgramManagement() {
        initComponents();
        init();
        tableload();
    }
    
    public void init(){
        program = new Program();
        program_id.setText(program.getId());
        program_id.setEditable(false);
    }
    
    private void clearFields(){
        program = new Program();
        program_id.setText(program.getId());
        program_venue.setText("");
        program_phone.setText("");
        program_time.setText("");
        program_budget.setText("");
        program_date.setDate(null);
    }
    
    private void tableload(){
        String qry = "SELECT venue, contact, date from program where status = 'ACTIVE'";
        ResultSet resultSet = DBConnect.selectDB(qry);
        programtable.setModel(DbUtils.resultSetToTableModel(resultSet));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        program_id = new javax.swing.JTextField();
        program_venue = new javax.swing.JTextField();
        program_phone = new javax.swing.JTextField();
        program_time = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        programtable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        program_date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        program_budget = new javax.swing.JTextField();

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

        jLabel1.setText("ProgramId :");

        jLabel2.setText("Venue:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Program Details");

        jLabel4.setText("Contact:");

        jLabel6.setText("Time");

        jLabel7.setText("Date: ");

        program_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_idActionPerformed(evt);
            }
        });

        program_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_venueActionPerformed(evt);
            }
        });

        program_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_phoneActionPerformed(evt);
            }
        });

        program_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_timeActionPerformed(evt);
            }
        });

        programtable.setModel(new javax.swing.table.DefaultTableModel(
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
        programtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(programtable);

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

        jLabel11.setText("Budget:");

        program_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_budgetActionPerformed(evt);
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
                                        .addComponent(program_venue, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(program_id)
                                        .addComponent(program_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(program_time, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(program_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(program_budget, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))))
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
                            .addComponent(program_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(program_venue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(program_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(program_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6))
                            .addComponent(program_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(program_budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        program.setVenue(program_venue.getText());
        program.setContact(program_phone.getText());
        program.setTime(program_time.getText());
        program.setDate(program_date.getDate());
        program.setBudget(Double.parseDouble(program_budget.getText().equals("")?"0":program_budget.getText()));
        
        if (program.validateValues()){
             program.insertProgram();
             clearFields();
             tableload();
        }else{
            Message.showError(AppStrings.EMPTY_MANDATORY_FIELDS, AppStrings.ERROR);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        program = new Program(
                    program_id.getText(),
                    program_venue.getText(),
                    program_phone.getText(),
                    program_time.getText(),
                    program_date.getDate(),
                    Double.parseDouble(program_budget.getText()));
        
        if (program.validateValues()){
        int user_response = Message.showUpdateMessage(AppStrings.SPONSOR);
       
        if (user_response == 0){
                program.updateProgram();
                tableload();
        }
        }else{
                Message.showError(AppStrings.EMPTY_MANDATORY_FIELDS, AppStrings.ERROR);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int user_response = Message.showDeleteMessage(AppStrings.SPONSOR);
        
        if (user_response == 0){
            program = new Program();
            program.setId(program_id.getText());
            
                program.deleteProgram();
                tableload(); 
                clearFields();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void program_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_program_idActionPerformed

    private void program_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_venueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_program_venueActionPerformed

    private void program_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_program_phoneActionPerformed

    private void program_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_program_timeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManagemetSelection managemetSelection = new ManagemetSelection();
        managemetSelection.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void programtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programtableMouseClicked
       
        //Set row values to fields
        int row = programtable.getSelectedRow();
        
       try{
        Date date = new SimpleDateFormat(common.Common.DATE_FORMAT).parse(programtable.getValueAt(row, 2).toString());
        Program program = new Program(programtable.getValueAt(row, 0).toString(), programtable.getValueAt(row, 1).toString(), date);
        program.findProgramIdFromVenueContactTime();
        program.findProgramDetailsFromId();
        
        program_id.setText(program.getId());
        program_venue.setText(program.getVenue());
        program_phone.setText(program.getContact());
        program_time.setText(program.getTime());
        program_date.setDate(program.getDate());
        program_budget.setText(Double.toString(program.getBudget()));
        addButton.setVisible(false);
       }catch(Exception e){
           e.printStackTrace();
       }
        
        
    }//GEN-LAST:event_programtableMouseClicked

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        clearFields();
        addButton.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void program_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_budgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_program_budgetActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField program_budget;
    private com.toedter.calendar.JDateChooser program_date;
    private javax.swing.JTextField program_id;
    private javax.swing.JTextField program_phone;
    private javax.swing.JTextField program_time;
    private javax.swing.JTextField program_venue;
    private javax.swing.JTable programtable;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
