package prisontest;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    /*public Prisoner(String m, double c){
        
        return Prisoner("m",5,4);
        
        
    }*/
            
            
            
    public Prisoner(){
        name=null;
        height=0.0;   
        sentence=0;
        
    }
    public void print(){
        
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentence);
    
    }
    public void print(boolean x){
        if (x==true){
            think();
        }
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
    
    
}
