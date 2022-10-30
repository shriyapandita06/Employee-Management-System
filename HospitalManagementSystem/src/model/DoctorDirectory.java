/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shriyapandita
 */
public class DoctorDirectory {
    
    private Set<Doctor> doctors = new HashSet<>();

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addNewDoctor(Person doctor)
    {
       doctors.add((Doctor) doctor);
    }  
    
}

