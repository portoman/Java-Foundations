/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListEx1 {

   
    public static void main(String[] args) {
        
        ArrayList <String> estudiantes= new ArrayList();
        
        estudiantes.add("Amy");
        estudiantes.add("Bob");
        estudiantes.add("Cindy");
        estudiantes.add("David");
        
        System.out.println(estudiantes.toString());
        System.out.println(estudiantes.size());
        
        estudiantes.add(0, "Nick");
        System.out.println(estudiantes.toString());
        estudiantes.add(1, "Mike");
        System.out.println(estudiantes.toString());
        estudiantes.remove(3);
        System.out.println(estudiantes.toString());
        
        Iterator<String> iterator=estudiantes.iterator();
        while(iterator.hasNext()){
            System.out.println("El nombre es: "+iterator.next());
        }
        System.out.println("---------------------------");
             
        ListIterator<String> listit=estudiantes.listIterator();
        while (listit.hasNext()){
            System.out.println("El nombre es: "+listit.next());
            
        }
                
        
        
    }
    
}
