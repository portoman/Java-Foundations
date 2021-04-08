/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;
import javax.swing.JLabel;

public class AddImport {

    public static void main(String args[]) {
        JLabel label = new JLabel("hello");
        String nombre= "Alfonso";
        String apellido1= "Porto";
        String apellido2= "Bujía";
        System.out.println(nombre.length());
        System.out.println(apellido1.length());
        System.out.println(apellido2.length());
        
        System.out.println(nombre.indexOf("o", 4));
        System.out.println(nombre.indexOf("o"));
        System.out.println(nombre.charAt(2));
        System.out.println(nombre.substring(2));
        System.out.println(nombre.substring(2,5));
        System.out.println(nombre.replace("o","i"));
        System.out.println(nombre.replaceFirst("o","i"));
        
        //Concatenar
        String nombreComp= nombre.concat(" Porto");
        System.out.println(nombreComp);
        
        
    }

}
