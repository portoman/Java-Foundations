package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        int i=0;
        for(i=0;i<=width;i++){
            System.out.print("#");
                    }
        System.out.println("\r");
                for(i=0;i<=height-3;i++){
            System.out.print("#");
            
                    for(int n=0;n<width-1;n++){
                        System.out.print(" ");
            
            }
                    System.out.println("#");
            }
                for(i=0;i<=width;i++){
            System.out.print("#");}
                
    }
            
        
    
    
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        System.out.println("\r");
        System.out.println("\r");
        System.out.println("\r");
        
        int i=0;
        int j=0;
        int n=0;
        for (i=0;i<leg;i++){
            System.out.print("#");
                       
            for(n=0;n<j;n++){
                System.out.print(" ");
            }
            j++;
            System.out.println("#");}
        i=0;
        for(i=0;i<leg;i++){
            System.out.print("#");
            
            
        }
        
        
    }
}
