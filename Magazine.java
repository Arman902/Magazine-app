/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;



/**
 *
 * @author Armand Nziza  (217035019)
 */
public class Magazine {
    private String name1="Daniel",editor1="Keenan Sobek",email1="dpengmarais99@gmail.com",object1;
    private double price1=20.99;
    
    
    
    Magazine()
    {
      System.out.println("----------Magazine Report----------");
    }
    Magazine(String name, double price, String editor,String email)
    {
        this.name1=name;
        this.price1= price; 
        this.editor1=editor;
        this.email1=email;
    } 
    public void setName(String name){
        this.name1=name;
    }
    public String getName(String name){
        name1=name;
        return name1;
    }
    public void setPrice(double price){
        this.price1=price;
    }
    public double getPrice(double price){
        price1=price;
        return price;
    }
    public void setEditor(String editor){
        this.editor1=editor;
    }
    public String getEditor(String editor){
        editor1=editor;
        return editor;
    }
    public void setEmail(String email){
        this.email1=email;
    }
    public String getEmail(String email){
        email1=email;
        return this.email1;
    }
    public void setObject1(String object){
        this.object1=object;
    }
    public String getObject(String object){
       object1=object;
       return this.object1;
    }
    public String toString(){
        
        String str= String.format("Magazine Contents: %s\nName:\t %s\nPrice:\t %s\nEditor:\t %s\nEmail:\t %s\n----------Report Complete----------",this.object1,this.name1,"R"+this.price1,this.editor1,this.email1);
        return str;
    }
}
