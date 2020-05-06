/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diuhssmain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Zaman
 */
public class CourseInstructor extends Information{
    private String employeeID,designation, greScore,ieltsToeflScore,reference;
    
    public void setInformation(String name, String employeeID,String designation, String dept, String faculty,String reference, String greScore, String ieltsToeflScore) throws IOException{
        setInfo(name,dept,faculty);
        this.employeeID = employeeID;
        this.designation = designation;
        this.greScore = greScore;
        this.ieltsToeflScore = ieltsToeflScore;
        this.reference = reference;
        FileWriter fw = new FileWriter("Instructor Application\\Application\\"+this.employeeID+".txt",true);
        PrintWriter saveInfo = new PrintWriter(fw);
         saveInfo.println("Applicant's Name: "+getName());
         saveInfo.println("Employee ID: "+this.employeeID);
         saveInfo.println("Designation: "+this.designation);
         saveInfo.println("Department: "+getDept());
         saveInfo.println("Faculty: "+getFaculty());
         saveInfo.println("Reference: "+this.reference);
         saveInfo.println("GRE Score: "+this.greScore);
         saveInfo.println("IELTS/TOEFL Score: "+this.ieltsToeflScore);
         saveInfo.close();
         setRegistration(employeeID,name,dept,faculty);
        
    }
}
