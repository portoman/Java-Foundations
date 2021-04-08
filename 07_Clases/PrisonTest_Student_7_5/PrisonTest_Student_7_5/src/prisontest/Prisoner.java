package prisontest;

public class Prisoner {

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    //Fields 
    private String name;
    private double height;
    private int sentence;
    
    public String getName(){
        return name;
       }
    public void setName(String name){
        this.name=name;
    }
     public double getHeight(){
        return height;
       }
    public void setHeight(Double height){
        this.setHeight((double) height);
    }
    
    
    
    
    
    
    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    Cell celda= new Cell("Uno",true);
            
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        /*System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);*/
        System.out.println("Cell name: "+celda.name);
    }
   /* public void openDoor(){
    
        if(celda.isOpen){
            celda.isOpen=false;
        }
        else
            celda.isOpen=true;
        System.out.println("The door is open: "+celda.isOpen);
    }*/
}
