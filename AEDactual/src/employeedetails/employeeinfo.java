/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedetails;

import javax.swing.ImageIcon;
import java.util.Date;
/**
 *
 * @author shriyapandita
 */
public class Employeeinfo {
    
    private String name;
    private int employeeid;
    private int age;
    private String gender;
    private Date startdate;
    private String level;
    private String Teaminfo;
    private String Positiontitle;
    private long contactnumber;
    private String email;
    private ImageIcon photo;

    public long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
            return name;
        }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return Teaminfo;
    }

    public void setTeaminfo(String Teaminfo) {
        this.Teaminfo = Teaminfo;
    }

    public String getPositiontitle() {
        return Positiontitle;
    }

    public void setPositiontitle(String Positiontitle) {
        this.Positiontitle = Positiontitle;
        
        
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
   
    public static boolean isNumeric(String str) { 
    try {  
        Integer.valueOf(str);  
        return true;
    } catch(NumberFormatException e){  
        return false;  
    }  
    }
}