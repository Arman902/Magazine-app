/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author Armand Nziza (217035019)
 */
public class MagazineApp {
   public static void main(String[] args){
      
       Magazine class1= new Magazine();
       String magazines[]= new String[5];
       magazines[0]= "Sports";
       magazines[1]= "Cars";
       magazines[2]= "Technology";
       magazines[3]= "Gadgets";
       magazines[4]= "Clothing";
      
       class1.getObject("\n."+magazines[0]+"\n."+magazines[1]+"\n."+magazines[2]+"\n."+magazines[3]+"\n."+magazines[4]);
       
       System.out.println(class1);
   } 
}
