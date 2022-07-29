/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ6_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el numero deseado");
         int num1 = leer.nextInt();
         
         if (num1 % 2 ==0 ){
         System.out.println("El numero es par");
    }
         else{ 
         System.out.println("El numero es impar");
    }
    }
    
}
