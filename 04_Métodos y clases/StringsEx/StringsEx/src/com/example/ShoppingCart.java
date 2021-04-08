/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class ShoppingCart {

    
    public static void main (String[] args){
        String custName = "Steve Smith";
        
        
        
        // Get the index of the space character (" ") in custName. 
        int spaceIdx = custName.indexOf(" ");
        
        // Use the substring method parse out the first name and print it.

        String firstName = custName.substring(0,spaceIdx);
        
        System.out.println(firstName);
        
        String s1 = "Alfonso";
        String s2 = "Porto";
        s1=s1+s2;
        System.out.println(s1);
        s1=s1+4;
        System.out.println(s1);
                
    }

    
}
