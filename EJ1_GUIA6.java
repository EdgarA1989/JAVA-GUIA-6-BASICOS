/*
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ej1guia;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ1_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1,num2,suma;
       System.out.println("Ingresa el primer numero");
       num1=leer.nextInt();
       System.out.println("Ingresa el segundo numero");
       num2=leer.nextInt();
       suma= num1+num2;
       System.out.println("La suma es: " + suma);
                   
    }
    
}
