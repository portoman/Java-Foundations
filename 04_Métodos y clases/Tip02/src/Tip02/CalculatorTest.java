
package Tip02;

import Tip02.Calculator;

public class CalculatorTest {
    public static void main(String[] array) { 
        //Instantiate a Calculator object
        Calculator calcula = new Calculator();
        calcula.originalPrice=10;
        calcula.findTotal();
        
        calcula.originalPrice=12;
        calcula.findTotal();
       
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party

        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
    }
}
