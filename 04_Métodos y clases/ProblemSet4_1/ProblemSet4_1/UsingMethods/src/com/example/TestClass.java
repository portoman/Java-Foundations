/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.ComputeMethods;
/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods n= new ComputeMethods();
        
        //invoke the 3 methods and dispay their results
        double Temp=n.fToC(1500);
        System.out.println("La Temperatura en Celsius es: "+Temp);
        
        double Hip = n.hipotenusa(8, 9);
        System.out.println("La hipotenusa es: "+Hip);
                
        int dado=n.roll();
        System.out.println("La suma de los valores de los dados es: "+dado);
        
    }
}
