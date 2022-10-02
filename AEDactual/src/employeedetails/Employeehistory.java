/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedetails;

import java.util.ArrayList;

/**
 *
 * @author shriyapandita
 */
public class Employeehistory {
    
    private ArrayList<employeeinfo> history;
    
    public Employeehistory(){
        
        this.history = new ArrayList<>();
                                            
    }

    public ArrayList<employeeinfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<employeeinfo> history) {
        this.history = history;
    }
    
    // creating new method within employee history, creates new emp records and adds the empty emp to the new history and then returns through reference to allow to put the data. 
    
    public employeeinfo addNewEmployee(){
        
        employeeinfo newEmp = new employeeinfo();
        history.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmployee(employeeinfo ei)
    {
        history.remove(ei);
    }
    
    public void updateEmployee(int id, employeeinfo emp){
        for (int i = 0; i < history.size(); i++){
            if (history.get(i).getEmployeeid() == id){
                history.set(i, emp);
            }
        }
        for ( employeeinfo e : history){
            if (e.getEmployeeid() == id){
                history.set(history.indexOf(e), emp);
            }
        }
    }
   // public void updateEmployee(employeeinfo ue)
   // {
       // history.add();
  //  }
    //public employeeinfo SearchEmployee(int id){
        
       // for ( employeeinfo e : history){
         //   if (e.getEmployeeid() == id)
          //  
            
        
        
            
        }
    //public void updateEmployee() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   //}
   
