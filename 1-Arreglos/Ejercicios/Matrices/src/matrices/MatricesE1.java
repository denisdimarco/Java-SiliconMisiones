package matrices;

import java.util.Scanner;

public class MatricesE1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int goles[][] = new int[5][3];
        double promedios[] = new double[5];
        int suma = 0;

        //cargar la matriz con goles de cada jugador
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.println("Ingrese goles del jugador " + f + " del partido " + c);
                goles[f][c] = leer.nextInt();
            }

        }

        //calcular los promedios y guardarlos en el vector promedios
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 3; c++) {

                suma = suma + goles[f][c];

            }
            promedios[f] = (double) suma / 3;
            suma = 0; //Tengo que reiniciar el auxiliar
        }

        //mostrar los goles + los promedios por pantalla
        for (int f = 0; f < 5; f++) {
            System.out.println("------ Jugador: N°" + f + " ------");
            for (int c = 0; c < 3; c++) {

                System.out.println("Goles del partido N°" + c + " " + goles[f][c]);

            }
            System.out.println("Promedio de goles: " + promedios[f]);

        }

    }

}
