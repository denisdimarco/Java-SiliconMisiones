/*
Vectores - Ejercicio 4:

Un empleado desea almacenar en un vector sus 12 sueldos del año. 
A partir de esto, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos 
y el promedio de sueldo que tuvo en el año.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Denis Di Marco
 */
public class ArreglosE4 {

    public static void main(String[] args) {
        int sueldosEmpleado[] = new int[12];
        Scanner leer = new Scanner(System.in);
        int sueldoAnual = 0;
        int promedioSueldo = 0;
        for (int i = 0; i < sueldosEmpleado.length; i++) {
            System.out.println("Ingrese el sueldo para el mes " + (i + 1));
            sueldosEmpleado[i] = leer.nextInt();
        }

        for (int i = 0; i < sueldosEmpleado.length; i++) {

            sueldoAnual += sueldosEmpleado[i];
        }

        System.out.println("El sueldo anual fue de " + sueldoAnual);
        System.out.println("El promedio de sueldo mensual fue de " + sueldoAnual / 12);

    }

}
