/*
Vectores - Ejercicio 5:

En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de
5 ciudades de la provincia de Misiones.
 
En el primer vector se guardan los nombres de las ciudades, 
en el segundo las temperaturas mínimas alcanzadas y 
en el tercero lastemperaturas máximas alcanzadas en la última semana. 

Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; 
además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual 
con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class ArreglosE5 {

    public static void main(String[] args) {

        String nombresCiudades[] = new String[5];
        double tempMinima[] = new double[5];
        double tempMaxima[] = new double[5];
        
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < nombresCiudades.length; i++) {

            System.out.println("Ingrese ciudad");
            nombresCiudades[i] = leer.next();
            System.out.println("Ingrese temperatura minima");
            tempMinima[i] = leer.nextDouble();
            System.out.println("Ingrese temperatura maxima");
            tempMaxima[i] = leer.nextDouble();
        }
        int indiceCiudadTemperaturaMasBaja;
        int indiceCiudadTemperaturaMasAlta;
        
         for (int i = 0; i < nombresCiudades.length; i++) {

           if(tempMinima[i])
        }
         

    }
}
