/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import javax.swing.JOptionPane;

import java.util.Random;       

public class RockPaperScissor {

    public static void main(String[] args) {
        
        Random numeroAleatorio= new Random();
        int numeroObtenido=numeroAleatorio.nextInt(3);
        JOptionPane.showMessageDialog(null,numeroObtenido);
        
        
                

    }
}
