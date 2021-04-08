package prisontest;

import java.util.HashSet;
import java.util.Set;

public class PrisonTest {
    public static void main(String[] args){
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        
        bubba.display(false);
        
        
        Cell celda1=new Cell("208",true);
        
        Prisoner piter=new Prisoner("Puto Piter",2.01,10);
        piter.display(true);
       celda1.openDoorCode(1234);
      celda1.openDoorCode(1234);
      celda1.openDoorCode(1234);
      celda1.openDoorCode(1234);
      
      piter.getHeight();
        System.out.println( piter.getHeight()); 
        piter.setHeight(1.5);
        System.out.println( piter.getHeight()); 
        
        
    }
}
