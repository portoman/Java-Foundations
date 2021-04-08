/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduzca dato: ");
        double color=dato.nextDouble();
        
        String colorFinal=" ";
       if (color>380 && color<450){
           colorFinal="El color es violeta";
       } 
       else if (color>450 && color<495){
           colorFinal="El color es azul";
       }
       else if (color>495 && color<570){
           colorFinal="El color es verde";
       }
       else if (color>570 && color<590){
           colorFinal="El color es amarillo";
       }
       else if (color>590 && color<620){
           colorFinal="El color es naranja";
       }
       else if (color>620 && color<750){
           colorFinal="El color es rojo";
       }
       else 
           colorFinal="El número está fuera de rango";
       
       System.out.println(colorFinal);
       }
        
        }
    
