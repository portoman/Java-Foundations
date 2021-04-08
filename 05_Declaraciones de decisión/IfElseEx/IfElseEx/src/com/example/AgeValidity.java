/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {

       Scanner dato= new Scanner(System.in);
       System.out.print("Introduzca la edad: ");
       int edad=dato.nextInt();
       
       boolean drivingUnderAge;
       drivingUnderAge=false;
       
       if (edad<=18){
        drivingUnderAge=true;   
       }
       
        System.out.println(drivingUnderAge);
       }
       
    }

