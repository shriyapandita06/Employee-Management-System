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
    
    private ArrayList<Employeeinfo> history;
    
    public Employeehistory(){
        
        this.history = new ArrayList<>();
                                            
    }

    public ArrayList<Employeeinfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employeeinfo> history) {
        this.history = history;
    }
    
    // creating new method within employee history, creates new emp records and adds the empty emp to the new history and then returns through reference to allow to put the data. 
    
    public Employeeinfo addNewEmployee(){
        
        Employeeinfo newEmp = new Employeeinfo();
        history.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmployee(Employeeinfo ei)
    {
        history.remove(ei);
    }
    
    public void updateEmployee(int id, Employeeinfo emp){
        for (int i = 0; i < history.size(); i++){
            if (history.get(i).getEmployeeid() == id){
                history.set(i, emp);
            }
        }
        for ( Employeeinfo e : history){
            if (e.getEmployeeid() == id){
                history.set(history.indexOf(e), emp);
            }
        }
    }
   // public void updateEmployee(Employeeinfo ue)
   // {
       // history.add();
  //  }
    //public Employeeinfo SearchEmployee(int id){
        
       // for ( Employeeinfo e : history){
         //   if (e.getEmployeeid() == id)
          //  
            
        
        
            
        }
    //public void updateEmployee() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   //}
   
