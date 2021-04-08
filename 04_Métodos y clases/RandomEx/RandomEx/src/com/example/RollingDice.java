/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;
import java.lang.Math;

public class RollingDice {

    public static void main(String[] args) {
        Random rand=new Random(3);
        System.out.println("Random Number 1: "+ rand.nextInt(100));
        System.out.println("Random Number 2: "+ rand.nextInt(100));
        System.out.println("Random Number 3: "+ rand.nextInt(100));
        System.out.println("Random Number 4: "+ rand.nextInt(100));
        
        System.out.println(Math.PI);
    }

}
