/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;
/**
 *
 * @author Alfonso
 */
public class Ejemplo {
    
    public static void main (String[]args){
        
        Random number = new Random();
        //int randomNumber=rdmNumber.nextInt(10);
        System.out.println(number.nextBoolean());
        System.out.println(number.nextInt());
        System.out.println(number.nextInt(10));
        System.out.println(number.nextInt(10)+4);
        
        System.out.println(number.nextDouble());
        System.out.println(number.nextLong());
        
    }
}
