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
public class EJ4_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        double temp = leer.nextDouble();
        System.out.println("Su temperatura en F es: " + (32 + (9 * temp / 5)));
    }
    
}
