/*
Vectores - Ejercicio 3:

Realizar un programa que permita la carga de 15 números en un vector. 
Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.

 */
package arreglos;

import java.util.Scanner;

public class ArreglosE3 {

    public static void main(String[] args) {
        int numeros[] = new int[15];
        Scanner leer = new Scanner(System.in);
        int contadorTres = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero para el indice " + i);
            numeros[i] = leer.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == 3) {
                contadorTres++;
            }
        }

        System.out.println("El numero 3 fue encontrado " + contadorTres + " veces.");

    }

}
