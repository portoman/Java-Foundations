/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        int ticket=data.nextInt();
        System.out.print("Enter the movie clasification \n");
        int clas=data.nextInt();
        
        if(ticket<=12 && clas==5){
            
            System.out.println("Me interesa ver la película");
        }
        else System.out.println("No me interesa ver la película");
        

    }
}
