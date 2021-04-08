/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class CountChar {


    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;

        for (count =0; count<max+1;count++){

            if (str.charAt(count) != 'w'){
               continue;}
      
        
        System.out.println("Counting w : " + count );
    }
}
}
    

