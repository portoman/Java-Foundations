/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.ShoppingCart;
import javax.swing.JOptionPane;
        
public class NameMaker {
    
    public static void main(String args[])
    {
     String firstName;
     String middleName;
     String lastName;
     String fullName;
     
     firstName=JOptionPane.showInputDialog("Escribe tu primer nombre");
     middleName=JOptionPane.showInputDialog("Escribe tu primer apellido");
     lastName=JOptionPane.showInputDialog("Escribe tu segundo apellido");
     
     fullName=firstName+" "+middleName+" "+lastName;
     
     JOptionPane.showMessageDialog(null,fullName);
     
     
     
     
    }
    
}
