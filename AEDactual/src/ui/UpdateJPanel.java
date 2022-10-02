/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import employeedetails.Employeehistory;
import employeedetails.Employeeinfo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author shriyapandita
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    
    Employeehistory history;
    
    public UpdateJPanel(Employeehistory history) {
        initComponents();
        
        this.history = history;
        lblPhotoUrl.setVisible(false);
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLevel = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblPhotoDisplay = new javax.swing.JLabel();
        lblPhotoUrl = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();
        lblFileName = new javax.swing.JLabel();
        comboBoxGender = new javax.swing.JComboBox<>();
        comboBoxLevel = new javax.swing.JComboBox<>();

        lblLevel.setText("Employee Level");

        lblTeam.setText("Team Info");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblID.setText("Enter Employee ID to update ");

        btnView.setText("Fetch data to update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblName.setText("Employee Name");

        lblPhone.setText("Contact number");

        lblAge.setText("Age");

        lblEmail.setText("Email ID");

        lblDate.setText("Employee Start Date");

        lblGender.setText("Gender");

        lblPosition.setText("Position Title");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Employee Information");

        lblPhoto.setText("Photo");

        btnPhoto.setText("Choose Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));

        comboBoxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Associate Software Engineer", "Software Engineer", "Senior Software Engineer", "Associate Manager", "Senior Manager " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTeam)
                                .addComponent(comboBoxLevel, 0, 268, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPhoto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblFileName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(btnUpdate)
                                                    .addGap(21, 21, 21))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPhoto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblPhotoUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnView)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(comboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhoto)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(50, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPhoto)
                                    .addComponent(lblPhotoUrl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFileName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:

        //first extract information:

        //
        // use this to create new data and add to the history
        // not manually add to array list. add new method to the emp history
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        
        int employeeId = Integer.parseInt( txtId.getText());
        
        for (Employeeinfo ei: history.getHistory()){
            
            if(employeeId == ei.getEmployeeid ()){
                txtName.setText(ei.getName());
                txtAge.setText(String.valueOf(ei.getAge()));
                comboBoxGender.setSelectedItem(ei.getGender());
                
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                    String startDate = simpleDateFormat.format(ei.getStartdate());                    
                    txtStartDate.setText(startDate);
                } catch (Exception ex) {
                    System.out.println("Date error occured");
                }
                
                comboBoxLevel.setSelectedItem(ei.getLevel());
                txtTeam.setText(ei.getTeaminfo());
                txtPosition.setText(ei.getPositiontitle());
                txtPhone.setText(String.valueOf(ei.getContactnumber()));
                txtEmail.setText(ei.getEmail());
                lblPhotoDisplay.setIcon(ei.getPhoto());
                lblPhotoUrl.setText(ei.getPhoto().toString());
                
                return;
            }            
        }
//        int selectedRowIndex = tblEmployee.getSelectedRow();
//        if (selectedRowIndex <0)
//        {
//            JOptionPane.showMessageDialog(this, "Please select a row to view");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
//
//        Employeeinfo selectedEmployee = (Employeeinfo) model.getValueAt(selectedRowIndex,0);
//
//        txtName.setText(String.valueOf(selectedEmployee.getName()));
//        txtId.setText(String.valueOf(selectedEmployee.getEmployeeid()));
//        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
//        //comboBoxGender.setgetSelectedItem().toString();
//       //comboBoxGender.setText(String.valueOf(selectedEmployee.getGender()));
//        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
//        txtStartDate.setText(String.valueOf(selectedEmployee.getStartdate()));
//       // txtLevel.setText(String.valueOf(selectedEmployee.getLevel()));
//        txtTeam.setText(String.valueOf(selectedEmployee.getTeaminfo()));
//        txtPhone.setText(String.valueOf(selectedEmployee.getContactnumber()));
//        txtEmail.setText(String.valueOf(selectedEmployee.getEmail()));
//        txtPosition.setText(String.valueOf(selectedEmployee.getPositiontitle()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        //int selectedRowIndex = tblEmployee.getSelectedRow();
        //if (selectedRowIndex <0)
       // {
       //     JOptionPane.showMessageDialog(this, "Please select a row to update");
       //     return;
      //  }
        Boolean saveStatus = false;
        
        String employeeId = txtId.getText();        
        String employeeName = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = comboBoxGender.getSelectedItem().toString();
        String startDate = txtStartDate.getText();
        
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher((CharSequence)startDate);
            
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(this, "Enter Start Date as paer Pattern (MM/dd/yyy)");
            return;  
        }
        
        String level = comboBoxLevel.getSelectedItem().toString();
        String teamInfo = txtTeam.getText();
        String positionTitle = txtPosition.getText();
        
        String cellPhoneNumberRegex = "\\d{10}";  
        long cellPhoneNumber = Long.parseLong(txtPhone.getText());
            

        if(!txtPhone.getText().matches(cellPhoneNumberRegex)){
            JOptionPane.showMessageDialog(this, "Enter Valid Cell Phone Number!");
            return;
        }
        
        String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String emailAddress = txtEmail.getText();

        if(!emailAddress.matches(emailRegex)){
            JOptionPane.showMessageDialog(this, "Enter Valid Email Address!");
            return;
        }  
            
        ImageIcon photo = new ImageIcon(lblPhotoUrl.getText());

       
        
        for (Employeeinfo ei: history.getHistory()){
            
            if(Integer.parseInt(employeeId)== ei.getEmployeeid())
                    {
                ei.setName(employeeName); 
                ei.setAge(age);
                ei.setGender(gender);
                 Date date1;  
                try {
                    date1 = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
                    ei.setStartdate(date1); 
                } catch (ParseException ex) {
                    Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                ei.setLevel(level);
                ei.setTeaminfo(teamInfo);
                ei.setPositiontitle(positionTitle);
                ei.setContactnumber(cellPhoneNumber);
                ei.setEmail(emailAddress);
                ei.setPhoto(photo);
                JOptionPane.showMessageDialog(this, "Employee Details Saved Sucessfully!");
                return;
            }
        }
        
        JOptionPane.showMessageDialog(this, "Employee Id does not exist!");
        
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        comboBoxGender.setSelectedIndex(0);
        txtStartDate.setText("");
        comboBoxLevel.setSelectedIndex(0);
        txtTeam.setText("");
        txtPosition.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        lblPhotoUrl.setText("");
        lblFileName.setText("");
        lblPhotoDisplay.setIcon(null);
        
        
      
//        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
//       // Employeeinfo selectedEmployee = (Employeeinfo) model.getValueAt(selectedRowIndex,0);
//        
//        if(tblEmployee.getSelectedRowCount() == 1 ) {
//            
//            String Name = txtName.getText();
//            String Employeeid = txtId.getText();
//            String Age = txtAge.getText();
//            String Gender = comboBoxGender.getSelectedItem().toString();
//            String Startdate = txtStartDate.getText();
//            String Level = comboBoxLevel.getSelectedItem().toString();
//            String Teaminfo = txtTeam.getText();
//            String contactnumber = txtPhone.getText();
//            String Positiontitle = txtPhone.getText();
//            String Email = txtEmail.getText();
//            
//            // set updated values in the tabvle rows
//            
//            tblEmployee.setValueAt(Name,tblEmployee.getSelectedRow(), 0);
//            tblEmployee.setValueAt(Employeeid,tblEmployee.getSelectedRow(), 1);
//            tblEmployee.setValueAt(Age,tblEmployee.getSelectedRow(), 2);
//            tblEmployee.setValueAt(Gender,tblEmployee.getSelectedRow(), 3);
//            tblEmployee.setValueAt(Startdate,tblEmployee.getSelectedRow(), 4);
//            tblEmployee.setValueAt(Level,tblEmployee.getSelectedRow(), 5);
//            tblEmployee.setValueAt(Teaminfo,tblEmployee.getSelectedRow(), 6);
//            tblEmployee.setValueAt(contactnumber,tblEmployee.getSelectedRow(), 7);
//            tblEmployee.setValueAt(Positiontitle,tblEmployee.getSelectedRow(), 8);
//            tblEmployee.setValueAt(Email,tblEmployee.getSelectedRow(), 9);
//            //tblEmployee.setValueAt(Photo)
//            
//        
//       Employeeinfo updated_obj = new Employeeinfo();
//       updated_obj.setAge(Integer.parseInt(Age));
//       updated_obj.setName(Name);
//       updated_obj.setEmail(Email);
//       updated_obj.setPositiontitle(Positiontitle);
//       updated_obj.setTeaminfo(Teaminfo);
//       updated_obj.setEmployeeid(Integer.parseInt(Employeeid));
       //ImageIcon photo = new ImageIcon(lblPhotoUrl.getText());
       //e.setPhoto(photo);
       
       
        
       
//     employeeinfo selectedEmployee = (Employeeinfo) model.getValueAt(selectedRowIndex,0);
//
//        //history.deleteEmployee(selectedEmployee);
//        history.updateEmployee(Integer.parseInt(Employeeid),updated_obj);
//        JOptionPane.showMessageDialog(this, "Employee record updated");
//
//        //populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed
//        else {
//            if(tblEmployee.getRowCount() == 0)
//            {
//                JOptionPane.showMessageDialog(this, "Table is empty");
//            }
//            
//            else{
//                JOptionPane.showMessageDialog(this, "Please select single row");
//            }
//        }
    
    
    
        
    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setAcceptAllFileFilterUsed(false);
        j.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png"));
        int r = j.showOpenDialog(null);

        if (r == JFileChooser.APPROVE_OPTION){
            lblPhotoUrl.setText(j.getSelectedFile().getAbsolutePath());
            lblFileName.setText(j.getSelectedFile().getName());

        }
        else{
            lblPhotoUrl.setText("Image Not Added");
        }
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JComboBox<String> comboBoxLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFileName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoDisplay;
    private javax.swing.JLabel lblPhotoUrl;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
        
private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for (Employeeinfo ei : history.getHistory()){
            
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
}

    
    



