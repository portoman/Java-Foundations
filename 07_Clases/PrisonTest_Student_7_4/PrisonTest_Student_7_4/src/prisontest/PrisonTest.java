package prisontest;

public class PrisonTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p02=new Prisoner();
        
        System.out.println(p02.name+" "+p02.height+" "+p02.sentence);
        System.out.println(p01.name+" "+p01.height+" "+p01.sentence);
        
        p01.print();
        p02.print();
        p02.print(true);
        p02.print(false); 
    }
}
