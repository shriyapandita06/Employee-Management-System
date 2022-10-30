/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.UserLogin;

import userinterface.CommunityWorkArea.CommunityJFrame;
import userinterface.HospitalWorkArea.HospitalJFrame;
import userinterface.PatientWorkArea.PatientJFrame;
import userinterface.DoctorWorkArea.DoctorJFrame;
import userinterface.SystemWorkArea.SystemJFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.*;

/** 
 *
 * @author shriyapandita
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    HospitalDirectory hospitalDirectory;

    public LoginJPanel() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.hospitalDirectory = new HospitalDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");

        lblRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Role :");

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System_Admin", "Hospital_Admin", "Community_Admin", "Doctor", "Patient" }));
        comboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoleActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username :");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password :");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin)
                            .addComponent(comboBoxRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, 222, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRoleActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        UserRoles userRole = UserRoles.valueOf( comboBoxRole.getSelectedItem().toString());
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        Boolean loginStatus = false;
        
        try{
            
            if((username != null && !username.trim().isEmpty()) && (password != null && !password.trim().isEmpty())){

                if(userRole.equals(UserRoles.System_Admin)){        
                    if(username.equals("s") && password.equals("s")){              
                        reset();
                        loginStatus = true;
                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                        mainFrame.dispose();
                        SystemJFrame systemFrame = new SystemJFrame(username,personDirectory,doctorDirectory,patientDirectory,hospitalDirectory);             
                        systemFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    } 
                }

                if(userRole.equals(UserRoles.Community_Admin)){        
                    if(username.equals("c") && password.equals("c")){              
                        reset();
                        loginStatus = true;
                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                        mainFrame.dispose();
                        CommunityJFrame communityFrame = new CommunityJFrame(username);             
                        communityFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    } 
                }

                if(userRole.equals(UserRoles.Hospital_Admin)){        
                    if(username.equals("h") && password.equals("h")){              
                        reset();
                        loginStatus = true;
                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                        mainFrame.dispose();
                        HospitalJFrame hospitalFrame = new HospitalJFrame(username);             
                        hospitalFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    } 
                }

                if(userRole.equals(UserRoles.Doctor)){
                    if(! username.equals("") && password.equals("")){
                        if(username.equals("d") && password.equals("d")){              
                            reset();
                            loginStatus = true;
                            JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                            mainFrame.dispose();
                            DoctorJFrame doctorFrame = new DoctorJFrame(username);             
                            doctorFrame.main(null);
                        }
                        else{
                             loginStatus = false;
                        }
                    }
                }

                if(userRole.equals(UserRoles.Patient)){
                    if(! username.equals("") && password.equals("")){
                        if(username.equals("p") && password.equals("p")){              
                            reset();
                            loginStatus = true;
                            JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                            mainFrame.dispose();
                            PatientJFrame patientFrame = new PatientJFrame(username);             
                            patientFrame.main(null);
                        }
                        else{
                             loginStatus = false;
                        }
                    }
                }
            }

            if(loginStatus == false){
                JOptionPane.showMessageDialog(this, "Please enter correct credentials!");
                reset();
            }

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please try Again");
            reset();
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        txtUsername.setText(null);
        txtPassword.setText(null);          
    }
}