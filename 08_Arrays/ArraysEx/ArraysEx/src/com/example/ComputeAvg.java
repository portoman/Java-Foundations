/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
      
        Scanner nota=new Scanner(System.in);
        
        double[]valores=new double[5];
        
        for (int i=0; i<5;i++){
        System.out.println("Introduzca valor: ");
        double valor=nota.nextDouble();
        valores[i]=valor;
        }
        double total=0;
        double promedio=0;
        for(double ind: valores){
            total=total+ind;
        }
        System.out.println("El total es: "+total);
        
        promedio=total/valores.length;
        System.out.println("El promedio es: "+promedio);
}
}
