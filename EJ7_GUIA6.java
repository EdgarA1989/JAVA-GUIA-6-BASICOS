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
public class EJ7_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String codigo="eureka";
         System.out.println("Ingrese la palabra magica");
         String palabra= leer.nextLine();
         if (palabra.equals(codigo)) {
            System.out.println("Ingreso la palabra correcta");
        } else {
             System.out.println("Ingreso la palabra incorrecta");
        }
    }
    
}
