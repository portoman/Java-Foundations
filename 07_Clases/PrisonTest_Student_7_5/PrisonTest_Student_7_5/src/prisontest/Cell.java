/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisontest;

/**
 *
 * @author Alfonso
 */
public class Cell {
    //Fields
    public String name;
    public boolean isOpen;
    
        //Methods
    
    public String getName(){
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    
    private int securityCode=1234;
    
    public Cell(String name, boolean isOpen){
        this.name=name;
        this.isOpen=isOpen;
        //int securityCode=1234;
               
    } 
    
  
    
    public void openDoorCode(int code){
        if (securityCode==code){
            System.out.println("The code is correct");
            if(isOpen==true){
                isOpen=false;}
        
            else {isOpen=true;}}
            
            else{
            System.out.println("The code is incorrect");}
            
             
    
        System.out.println("The door is open: "+isOpen);
}
}