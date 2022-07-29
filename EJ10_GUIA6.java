/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ej1guia;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ10_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el numero limite");
         int num1 = leer.nextInt();
         int suma = 0;
         do {            
             System.out.println("Ingrese el numero a sumar");
           int num2 = leer.nextInt();
           suma=suma+num2;
        } while (suma<num1);
         System.out.println("Supero el numero el limite");
    }
    
}
