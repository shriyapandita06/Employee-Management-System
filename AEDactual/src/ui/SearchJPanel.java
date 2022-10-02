/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import employeedetails.Employeehistory;
import employeedetails.Employeeinfo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shriyapandita
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     * 
     * 
     */
    
    Employeehistory history;
    public SearchJPanel(Employeehistory history) {
        initComponents();
        
        
        this.history = history;
        populateEmployeeTable();
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
        lblLevel = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeList = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        BtnbyID = new javax.swing.JButton();
        BtnbyLevel = new javax.swing.JButton();
        BtnbyTeam = new javax.swing.JButton();
        BtnbyPos = new javax.swing.JButton();
        BtnViewdetails = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Employee");

        lblLevel.setText("Employee Level");

        lblTeam.setText("Team Info");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblID.setText("Employee ID");

        lblName.setText("Employee Name");

        lblPosition.setText("Position Title");

        tblEmployeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone Number", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeList);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        BtnbyID.setText("Search by ID");
        BtnbyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbyIDActionPerformed(evt);
            }
        });

        BtnbyLevel.setText("Search by Level");
        BtnbyLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbyLevelActionPerformed(evt);
            }
        });

        BtnbyTeam.setText("Search by Team");
        BtnbyTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbyTeamActionPerformed(evt);
            }
        });

        BtnbyPos.setText("Search by Position");
        BtnbyPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbyPosActionPerformed(evt);
            }
        });

        BtnViewdetails.setText("View Data");
        BtnViewdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewdetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtPosition))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BtnbyID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnbyLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnbyTeam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnbyPos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(BtnViewdetails)))
                        .addGap(0, 313, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnbyID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLevel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnbyLevel)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeam)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnbyTeam)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPosition)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnbyPos)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnViewdetails)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:

        //first extract information:

        //
        // use this to create new data and add to the history
        // not manually add to array list. add new method to the emp history
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
            String empname = txtName.getText();
            
            // creating new array list 
            ArrayList<Employeeinfo> filterbyname = new ArrayList<Employeeinfo>();
            
            for(Employeeinfo emp : history.getHistory()){
                System.out.println(emp);
                if(emp.getName().contains(empname))
                {
                    filterbyname.add(emp);
                }
            }
            
            populateEmployeebyFilters(filterbyname);
            txtName.setText("");
//            String Employeeid = txtId.getText();
//            String Level = txtLevel.getText();
//            String Teaminfo = txtTeam.getText();
//            String Positiontitle = txtPosition.getText();
            
           //employeeinfo search_obj = new Employeeinfo(); 
          
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void BtnbyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbyIDActionPerformed
        // TODO add your handling code here:
        
        String id =txtId.getText(); 
//        String teamname = txtTeam.getText();
            
            // creating new array list 
            ArrayList<Employeeinfo> searchResults = new ArrayList<Employeeinfo>();
            
            for(Employeeinfo emp : history.getHistory()){
                if(Integer.toString(emp.getEmployeeid()).contains(id))
                {
                    searchResults.add(emp);
                }
            }
            
            populateEmployeebyFilters(searchResults);
            txtId.setText("");
//        ArrayList<employeeinfo> searchResults = new ArrayList<employeeinfo>();
//        
      //  for (Employeeinfo e: history.getHistory()){
        //    if(e.id equals(String.valueOf(id())){
         //      searchResults.add(e); 
               
    }//GEN-LAST:event_BtnbyIDActionPerformed

    private void BtnbyTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbyTeamActionPerformed
        // TODO add your handling code here:
                                                
        // TODO add your handling code here:
        
            String teamname = txtTeam.getText();
            
            // creating new array list 
            ArrayList<Employeeinfo> searchResults = new ArrayList<Employeeinfo>();
            
            for(Employeeinfo emp : history.getHistory()){
                if(emp.getTeaminfo().contains(teamname))
                {
                    searchResults.add(emp);
                }
            }
            
            populateEmployeebyFilters(searchResults);
            txtTeam.setText("");
    }//GEN-LAST:event_BtnbyTeamActionPerformed

    private void BtnViewdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewdetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployeeList.getSelectedRow();
        if (selectedRowIndex <0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
        
        //DefaultTableModel model = (DefaultTableModel) tblEmployeeList.getModel();
//        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0 );
//        
//        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
//        txtGender.setText(selectedEmployee.getGender());
//        txtTeamInfo.setText(selectedEmployee.getTeamInfo());
//        txtCellPhoneNumber.setText(String.valueOf(selectedEmployee.getCellPhoneNumber()));
//        txtEmailAddress.setText(selectedEmployee.getEmailAddress());
//        lblDisplayPhoto.setIcon(selectedEmployee.getPhoto());
//             
//        DefaultTableModel model = (DefaultTableModel) tblEmployeeList.getModel();
//        Employeeinfo selectedEmployee = (Employeeinfo) model.getValueAt(selectedRowIndex,0);
//       

        //txtTeamInfo.setText(selectedEmployee.getTeamInfo());
        //txtCellPhoneNumber.setText(String.valueOf(selectedEmployee.getCellPhoneNumber()));
        //txtEmailAddress.setText(selectedEmployee.getEmailAddress());
        //lblDisplayPhoto.setIcon(selectedEmployee.getPhoto());
    }//GEN-LAST:event_BtnViewdetailsActionPerformed

    private void BtnbyLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbyLevelActionPerformed
        // TODO add your handling code here:
        String teamlevel = txtLevel.getText();
            
            // creating new array list 
            ArrayList<Employeeinfo> searchResults = new ArrayList<Employeeinfo>();
            
            for(Employeeinfo emp : history.getHistory()){
                if(emp.getLevel().contains(teamlevel))
                {
                    searchResults.add(emp);
                }
            }
            
            populateEmployeebyFilters(searchResults);
            txtLevel.setText("");
        
    }//GEN-LAST:event_BtnbyLevelActionPerformed

    private void BtnbyPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbyPosActionPerformed
        // TODO add your handling code here:
        String Position = txtPosition.getText();
            
            // creating new array list 
            ArrayList<Employeeinfo> searchResults = new ArrayList<Employeeinfo>();
            
            for(Employeeinfo emp : history.getHistory()){
                if(emp.getPositiontitle().contains(Position))
                {
                    searchResults.add(emp);
                }
            }
            
            populateEmployeebyFilters(searchResults);
            txtPosition.setText("");
    }//GEN-LAST:event_BtnbyPosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewdetails;
    private javax.swing.JButton BtnbyID;
    private javax.swing.JButton BtnbyLevel;
    private javax.swing.JButton BtnbyPos;
    private javax.swing.JButton BtnbyTeam;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JTable tblEmployeeList;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables

    
    // Creating new array to populate values on searching 
    private void populateEmployeebyFilters(ArrayList<Employeeinfo> filterbyname) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        DefaultTableModel model = (DefaultTableModel) tblEmployeeList.getModel();
        model.setRowCount(0);
        
        for (Employeeinfo ei : filterbyname){
            
            Object [] row =new Object[10];
            //row[0]=ei.getName();
            row[0]=ei;
            row[1]=ei.getEmployeeid();
            row[2]=ei.getAge();
            row[3]=ei.getGender();
            row[4]=ei.getStartdate();
            row[5]=ei.getLevel();
            row[6]=ei.getTeaminfo();
            row[7]=ei.getPositiontitle();
            row[8]=ei.getContactnumber();
            row[9]=ei.getEmail();
                   
            model.addRow(row);
        }
    
   
   
    }

    private void populateEmployeeTable() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
