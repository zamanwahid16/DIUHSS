
package diuhssmain;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jaman
 */
public class Member extends Information {
    
   private String userName,password,email,id,phone;
   
   public void setInformation(String name, String id, String username, String password, String email,String phone,String dept,String faculty) throws IOException{
       setInfo(name,dept,faculty);
       this.id = id;
       this.userName = username;
       this.email = email;
       this.phone = phone;
       this.password = password;
       FileWriter fw = new FileWriter("Member Registration\\Application\\"+this.id+".txt",true);
        PrintWriter saveInfo = new PrintWriter(fw);
        saveInfo.println(this.password);
        saveInfo.println(getName());
        saveInfo.println(this.id);
        saveInfo.println(this.userName);
        saveInfo.println(this.password);
        saveInfo.println(this.email);
        saveInfo.println(this.phone);
        saveInfo.println(getDept());
        saveInfo.println(getFaculty());
        saveInfo.close();
        
        
        setRegistration(name,dept,faculty);
   }
   public int login(String id, String password) throws FileNotFoundException{
       int idFound =0;
        
            try{
            File file = new File("Member Registration\\Application\\"+id+".txt");
       
           Scanner sc = new Scanner(file);
           String cpass=sc.nextLine();
           if(cpass.compareTo(password)==0)
               idFound = 1;
           else
               idFound = 0;
            }catch(Exception ex){
                
            }
       
    return idFound;   
   }
   public void changePassword(String id, String cPass, String nPass){
       File file = new File("Member Registration\\Application\\"+id+".txt");
       
   }
   public void withdrawMembership(String id, String password){
       
       try{
       
           PrintWriter pw = new PrintWriter("Member Registration\\Application\\"+id+".txt");
           pw.close();
           
           
       }
       catch(Exception ex){
           
       }
   }
    
}
