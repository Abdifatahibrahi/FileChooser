/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelfatah Ibrahim
 */
public class FileChooser {

   
    public static void main(String[] args) {
        
        kudiin obj = new kudiin();
        obj.OpenFile();
        obj.ReadFile();
        obj.closeFile();
//       File x = new File("C://Windows");
//       if(x.exists()){
//           System.out.println(x.getName() + "It Exists");
//       }
//       else{
//                      System.out.println("It Doesnt Exists");
//
//       }

  
}
}
//class addFile{
//    Formatter x;
//    public void createFil(){
//        
//          
// 
//     try{
//         x = new Formatter("Manka");
//         System.out.println("You created the file");
//     }
//     catch(Exception e){
//         System.out.println("An Error has Occurred");
//     }   
//     
//    }
//    
//      public void addContent(){
//          
//          x.format("%s%s%s", "10","Ikran","Abdullah");
//          
//      }
//      
//       public void closeFile(){
//          
//         x.close();
//          
//      }
//    
//    }
        
    

class kudiin{
    private Scanner x;
    
    public void OpenFile() {
        
        
        try {
            x = new Scanner(new File("Manka"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(kudiin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
     
        
        
    }
       public void ReadFile(){
        
           while(x.hasNext()){
               String a = x.next();
               String b = x.next();
               String c = x.next();
               
               System.out.printf("%s %s %s", a,b,c);
                 
               
           }
    }
       public void closeFile(){
           x.close();
       }
}
    
