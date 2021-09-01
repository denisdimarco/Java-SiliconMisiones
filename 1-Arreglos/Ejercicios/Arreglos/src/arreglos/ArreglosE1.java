package arreglos;

import java.util.Scanner;

public class ArreglosE1 {

    public static void main(String[] args) {
        String nombres[] = new String[8];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Cargue el nombre para el índice: " + i);
            nombres[i] = leer.nextLine();
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("En el indice: " + i + ", tengo el nombre: " + nombres[i]);          
        }

    }

}
