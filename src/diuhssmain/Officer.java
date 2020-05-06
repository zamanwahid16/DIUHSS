
package diuhssmain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Officer extends Information{
    private String employeeID,password;
    public int login(String eid, String password) throws FileNotFoundException{
       int idFound =0;
        
            try{
            File file = new File("Officers\\"+eid+"\\login.txt");
       
           Scanner sc = new Scanner(file);
           String cpass=sc.nextLine();
           sc.close();
           if(cpass.compareTo(password)==0)
               idFound = 1;
           else
               idFound = 0;
            }catch(Exception ex){
                
            }
       
    return idFound;   
   }
    public String showName(String eid){
        String name =null;
        try{
            File file = new File("Officers\\"+eid+"\\name.txt");
            Scanner sc = new Scanner(file);
            name =sc.nextLine();
            sc.close();
        }catch(Exception ex){
            
        }
        return name;
    }
    public String showDesignation(String eid){
        String designation =null;
        try{
            File file = new File("Officers\\"+eid+"\\designation.txt");
            Scanner sc = new Scanner(file);
            designation =sc.nextLine();
            sc.close();
        }catch(Exception ex){
            
        }
        return designation;
    }
}
