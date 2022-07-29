/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ5_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número a calcular: ");
        int num1 = leer.nextInt();
        System.out.println("El doble de su número es: " + (num1*2));
        System.out.println("El doble de su número es: " + (num1*3));
        System.out.println("La raiz de su número es: " + sqrt(num1));
    }
    
}
