/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
         Scanner dato= new Scanner(System.in);    
         System.out.println("Introduzca el peso en libras: ");
         double peso = dato.nextDouble();
         System.out.println("Introduzca la altura en pulgadas: ");
         double altura=dato.nextDouble();
         
         double IMC=peso/(Math.pow(altura,2))*703;
         double IMCredondeado=Math.ceil(IMC);
         
         System.out.println("El índice de masa corporal es: "+IMCredondeado);
         
         
         
            
        }
}
