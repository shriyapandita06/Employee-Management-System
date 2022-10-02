/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedetails;

/**
 *
 * @author shriyapandita
 */
public class employeeinfo {
    
    private String name;
    private int employeeid;
    private int age;
    private String gender;
    private String startdate;
    private String level;
    private String Teaminfo;
    private String Positiontitle;
    private int contactnumber;
    private String email;

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
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
   
}