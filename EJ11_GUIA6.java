/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ej1guia;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EJ11_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el primer numero");
         int num1 = leer.nextInt();
         System.out.println("Ingrese el segundo numero");
         int num2 = leer.nextInt();
         int menu = 0;
         
         do {            
            
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         menu = leer.nextInt();
         switch (menu) {
             case 1:
                 int suma= num1+num2;
                 System.out.println("El resutlado de la suma es: " +suma);
                 break;
             case 2:
                 int resta= num1-num2;
                 System.out.println("El resutlado de la suma es: " +resta);
                 break;
             case 3:
                 int multi= num1*num2;
                 System.out.println("El resutlado de la suma es: " +multi);
                 break;
            case 4:
                 double div= num1/num2;
                 System.out.println("El resutlado de la suma es: " +div);
                 break;
         }
         } while (menu != 5);
         System.out.println("Finalizo el programa");
    }
    
}
