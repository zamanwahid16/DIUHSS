
package diuhssmain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Information{
    private String name,department,faculty;;
    
    public void setRegistration(String employeeId, String name, String dept, String faculty) throws IOException{
        
        FileWriter fw = new FileWriter("Instructor Application\\Applicant\\applicant.txt",true);
        PrintWriter saveInfo = new PrintWriter(fw);
        saveInfo.print(this.name);
        saveInfo.print("  "+this.department);
        saveInfo.println("  "+this.faculty);
        saveInfo.close();
    }
    public void setRegistration(String memberName, String dept, String faculty) throws IOException{
        
        FileWriter fw = new FileWriter("Member Registration\\Member\\member.txt",true);
        PrintWriter saveInfo = new PrintWriter(fw);
        saveInfo.print(this.name);
        saveInfo.print("  "+this.department);
        saveInfo.println("  "+this.faculty);
        saveInfo.close();
    }
    
    public void setInfo(String name, String dept, String faculty){
        this.name = name; 
        this.department = dept; 
        this.faculty = faculty;
    }
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.department;
    }
    public String getFaculty(){
        return this.faculty;
    }
    
   
}
