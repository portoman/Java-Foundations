
package com.example;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduzca código del color: ");
        int color=dato.nextInt();
        String colorS;
        
        switch (color){
            case 1:
                colorS="El siguiente color es verde";
            break;
            case 2:
                colorS="El siguiente color es amarillo";
            break;
            case 3:
                colorS="El siguiente color esrojo";
            break;
            default:
            colorS="Color invalido";
                    }
        System.out.println(colorS);
        
         String name = "Java";
   String language = "Programming";
   String fullName = name + language;
   boolean test = fullName.equals(name + language);
   System.out.println(test);
        
        }
        
        
        
       
    }

