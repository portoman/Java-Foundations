/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduzca código del color: ");
        int color=dato.nextInt();
        String colorS;
        
        if (color==1){
            colorS="El siguiente color es verde";
        }
        else if (color==2){
            colorS="El siguiente color es amarillo";
        }
        else if (color==3){
            colorS="El siguiente color esrojo";
    }
        else{
            colorS="Color invalido";
                    }
        System.out.println(colorS);
    }
}
