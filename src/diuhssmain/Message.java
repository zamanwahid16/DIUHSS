
package diuhssmain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Message extends Information{
   private String message;
   
   public void message(String name,String dept, String faculty,String message ){
       this.message = message;
       setInfo(name,dept,faculty);
       
       try {
           FileWriter fw = new FileWriter("Officers\\151-35-953\\message.txt",true);
           PrintWriter pw = new PrintWriter(fw);
           pw.println(name+":  "+this.message);
           pw.println();
           pw.close();
       } catch (IOException ex) {
           Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
}
