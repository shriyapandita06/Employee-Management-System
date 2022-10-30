/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Hospitals;

import userinterface.SystemWorkArea.Hospital.*;
import userinterface.SystemWorkArea.Encounters.*;
import userinterface.SystemWorkArea.Doctor.*;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.PersonDirectory;


/**
 *
 * @author shriyapandita
 */
public class HospitalHospitalWorkPanel extends javax.swing.JPanel {

//    PatientDirectory patientDirectory;
//    EncounterHistory encounterHistory;
//    DoctorDirectory doctorDirectory;
        
      HospitalDirectory hosptialDirectory;  
    
    /**
     * Creates new form SystemPatient
     */
    public HospitalHospitalWorkPanel(HospitalDirectory hosptialDirectory) {
        initComponents();
//        patientDirectory = new PatientDirectory();
//        encounterHistory = new EncounterHistory();
//        doctorDirectory = new DoctorDirectory();
        this.hosptialDirectory = hosptialDirectory;
              
        SystemViewHospital systemViewHospital = new SystemViewHospital(hosptialDirectory);
        splitPane.setRightComponent(systemViewHospital );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnViewHospital = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        btnUpdateHospital = new javax.swing.JButton();
        patientWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(160, 132, 202));

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(255, 204, 204));
        controlPanel.setPreferredSize(new java.awt.Dimension(150, 609));
        controlPanel.setVerifyInputWhenFocusTarget(false);

        btnViewHospital.setBackground(new java.awt.Color(102, 0, 51));
        btnViewHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnViewHospital.setText("View Hospital");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        btnCreateHospital.setBackground(new java.awt.Color(102, 0, 51));
        btnCreateHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnUpdateHospital.setBackground(new java.awt.Color(102, 0, 51));
        btnUpdateHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateHospital.setText("Update Hospital");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnUpdateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateHospital, btnUpdateHospital, btnViewHospital});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateHospital, btnViewHospital});

        splitPane.setLeftComponent(controlPanel);

        patientWorkArea.setBackground(new java.awt.Color(102, 0, 51));
        patientWorkArea.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout patientWorkAreaLayout = new javax.swing.GroupLayout(patientWorkArea);
        patientWorkArea.setLayout(patientWorkAreaLayout);
        patientWorkAreaLayout.setHorizontalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        patientWorkAreaLayout.setVerticalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(patientWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        SystemCreateHospital systemCreateHospital = new SystemCreateHospital(hosptialDirectory);
        splitPane.setRightComponent(systemCreateHospital);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        SystemViewHospital systemViewHospital = new SystemViewHospital(hosptialDirectory);
        splitPane.setRightComponent(systemViewHospital );
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        // TODO add your handling code here:
        SystemUpdateHospital systemUpdateHospital = new SystemUpdateHospital(hosptialDirectory);
        splitPane.setRightComponent(systemUpdateHospital);
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel patientWorkArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
