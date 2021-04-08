/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        
        ArrayList<Integer> numeros=new ArrayList();
        
        numeros.add(2);
        numeros.add(8);
        numeros.add(7);
        numeros.add(6);
        numeros.add(4);
        
        System.out.println(numeros.toString());
        int i=0;
        
        Iterator<Integer> iter= numeros.iterator();
        while(iter.hasNext()){
            System.out.println("Number is: "+iter.next());
              if (iter.next()%2==0) {
                  numeros.remove(i);
              }
           i++;
            
            }
            
       /* for (Integer pares:numeros){
         if (pares%2==0){
             numeros.remove();
        }
        }
        System.out.println(numeros.toString());
         
    }*/
}
}