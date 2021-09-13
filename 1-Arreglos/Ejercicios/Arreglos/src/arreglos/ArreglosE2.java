/*
 Vectores - Ejercicio 2:

    Realizar un programa que permita la carga de 10 números en un vector. 
    Una vez cargados, se necesita que el programa determine cual es el mayor y cuál es el menor de ellos.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Denis Di Marco
 */
public class ArreglosE2 {

    public static void main(String[] args) {
        int vectorNumeros[] = new int[10];
        int mayor = 0;

        Scanner leer = new Scanner(System.in);

        //Cargo 10 numeros al vector
        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("Ingrese un entero");
            vectorNumeros[i] = leer.nextInt();
        }

        //Inicializo la variable menor con el valor del indice 0 del vector;
        int menor = vectorNumeros[0];

        //Recorro el vector para encontrar mayor y menor valor
        for (int i = 0; i < vectorNumeros.length; i++) {
            if (vectorNumeros[i] > mayor) {
                mayor = vectorNumeros[i];
            }
            if (vectorNumeros[i] < menor) {
                menor = vectorNumeros[i];
            }
        }

        System.out.println("El mayor numero ingresado fue: " + mayor);
        System.out.println("El menor numero ingresado fue: " + menor);

    }

}
