/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ej1guia;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ8_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 caracteres");
        String palabra = leer.nextLine();
        if (palabra.length()== 8) {
           System.out.println("CORRECO");
        } else {
           System.out.println("INCORRECO");
        }
    }
    
}
