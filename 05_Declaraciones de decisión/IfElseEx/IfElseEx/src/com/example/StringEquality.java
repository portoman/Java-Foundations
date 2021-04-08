/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
   public static void main(String[]args){
       String name;
       Scanner valor=new Scanner(System.in);
       System.out.println("Introduzca nombre: ");
       String nombre=valor.next();
       if(nombre.equals("Moe")){
           System.out.println("You are the king of the rock and roll");}
           else{
                   System.out.println("You are not the king");
                   }
       }
   }
    


