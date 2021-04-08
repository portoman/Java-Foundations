package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
           Scanner data=new Scanner(System.in);
           System.out.println("Introduzca número: ");
           int number = data.nextInt();
           int i=0;
           int suma=0;
           while(i<11){
               
               suma=suma+number;
           i++;
           System.out.println("Introduzca número: ");
           number = data.nextInt();
           if (number==0){
               break;
           }
           }
        System.out.println("La suma total es: "+suma);

    }
}
