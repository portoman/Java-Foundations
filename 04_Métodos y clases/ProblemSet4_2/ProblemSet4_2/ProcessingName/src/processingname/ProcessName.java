/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nombre=console.next();
        String apellido=console.next();
        // your code goes here
        System.out.println(nombre.length());
        System.out.println("Your name is: "+apellido+","+nombre.charAt(0)+".");
        console.close();
    }
}