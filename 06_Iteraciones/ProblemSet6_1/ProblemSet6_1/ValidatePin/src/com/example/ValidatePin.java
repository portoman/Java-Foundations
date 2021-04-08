/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {
    
    public static void main(String[] args) {
        
        Scanner data=new Scanner(System.in);
        System.out.println("Introduzca PIN: "); 
        int pin=data.nextInt();
        int correctPin= 1234;
         
        while(pin!=correctPin){
            System.out.println("Pin incorrecto");
            System.out.println("Introduzca PIN: ");  
            pin=data.nextInt();
        }
        System.out.println("Pin correcto");
        
    }
}
