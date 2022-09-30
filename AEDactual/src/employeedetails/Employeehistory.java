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
        
        this.history = new ArrayList<employeeinfo>();
        
    }

    public ArrayList<employeeinfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<employeeinfo> history) {
        this.history = history;
    }
    
    
}
