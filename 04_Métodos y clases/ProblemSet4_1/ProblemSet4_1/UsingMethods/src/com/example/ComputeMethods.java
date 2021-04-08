/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;


public class ComputeMethods {
    
public double fToC(double degreesF){

double C=(5/9)*(degreesF-32);
return C;
}

public double hipotenusa(int a, int b){
    
    double c=Math.sqrt(Math.pow(a,2)*Math.pow(b,2));
    return c;
}
public int roll(){
    Random dado= new Random();
    int dado1=dado.nextInt(7);
    int dado2=dado.nextInt(7);
    int dadoTotal=dado1+dado2;
    return dadoTotal;
}
    
}

