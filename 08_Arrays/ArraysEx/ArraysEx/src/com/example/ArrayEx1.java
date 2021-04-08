/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ArrayEx1 {

    public static void main(String args[]) {
        
       int[] primeNum = new int[20];
        int [] even = new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        
        int[] score=new int[9];
        byte[] values={1,1,1,1,1,1,1,1,1,1};
        System.out.println(values.length);
        
        String []names={"Fon","Lurdes", "Pa", "Ma", "Maria"};
        
        for (int ind=0; ind <names.length; ind++ ){
            System.out.println(names[ind]);
            
        }
        for (String nombre: names){
            System.out.println(nombre);
        }
        
        Scanner dato=new Scanner(System.in);
        
        double[]notas= new double [10];
        
        int ind=0;
        
        while(ind<notas.length){
            System.out.println("Introduzca nota: ");
        double nota= dato.nextDouble();
        notas[ind]=nota;
        ind++;
                }
        ind=0;
        for(ind=0; ind<notas.length;ind++){
            
        System.out.println("La nota nº"+(ind+1)+" es: "+notas[ind]);
        }
        double total=0;
        ind=0;
        for(ind=0; ind<notas.length;ind++){
        total=total+notas[ind];
        
    }
        
        double promedio=total/notas.length;
        System.out.println("El promedio es: "+promedio);
        
        }
        

}
