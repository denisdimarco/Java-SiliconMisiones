package principal;

import entidades.Auto;
import entidades.Mascota;
import entidades.Mueble;

public class principal {

    public static void main(String[] args) {
        //Crear una clase llamada Auto, que tenga los siguientes atributos: color, marca, modelo, patente, cantidad de puertas (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
        //Crear 3 objetos Auto utilizando parámetros
        //Crear 1 objeto Auto sin parámetros.
        //Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con parámetros.
        //Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

        Auto auto1 = new Auto("Azul", "Renault", "Clio", "abc123", 4);
        Auto auto2 = new Auto("Rojo", "Ford", "Fiesta", "deb233", 5);
        Auto auto3 = new Auto("Negro", "Citroen", "C4", "acc123", 5);

        Auto auto4 = new Auto();

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());

        System.out.println(auto4.getMarca());

        //Punto b. 
        //Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, alto, ancho, material, cantidad.
        //Crear 3 muebles utilizando parámetros.
        //Mostrar por pantalla el nombre y el material de los 3 muebles.
        //Colocar “Madera” como material de los 3 muebles creados.
        //Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles que fueron cambiados.
        Mueble mueble1 = new Mueble("Repisa", 200, 40, "Madera", 3);
        Mueble mueble2 = new Mueble("Mesa Luz", 50, 60, "Madera", 2);
        Mueble mueble3 = new Mueble("Biblioteca", 160, 50, "Madera", 1);

        System.out.println(mueble1.toString());
        System.out.println(mueble2.toString());
        System.out.println(mueble3.toString());

        //Punt c. 
        //Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
        //Crear un vector de tipo Mascota que pueda almacenar 5 mascotas. Crear 5 mascotas y guardarlas en el vector.
        //Recorrer el vector creado y mostrar por pantalla el nombre, especie y sexo de las mascotas almacenadas.
        //Cambiar el nombre de dos mascotas. Mostrar por pantalla los datos de las dos mascotas cuyos nombres fueron cambiados.
        //Recorrer el vector y mostrar por pantalla únicamente a las mascotas que sean de la especie “perro”.
        Mascota mascota1 = new Mascota("Fito", "perro", "Macho", "Negro", "Rizado", "Caniche");
        Mascota mascota2 = new Mascota("James", "perro", "Macho", "Marron", "Corto", "Boxer");
        Mascota mascota3 = new Mascota("Renata", "perro", "Hembra", "Blanco", "Largo", "Cocker");
        Mascota mascota4 = new Mascota("Juan", "gato", "Macho", "Negro", "Largo", "Siames");
        Mascota mascota5 = new Mascota("Elmer", "raton", "Macho", "Marron", "Corto", "Miki");

        Mascota[] mascotas = new Mascota[5];

        mascotas[0] = mascota1;
        mascotas[1] = mascota2;
        mascotas[2] = mascota3;
        mascotas[3] = mascota4;
        mascotas[4] = mascota5;

        for (int i = 0; i < mascotas.length; i++) {

            System.out.println(mascotas[i].getNombre() + " " + mascotas[i].getEspecie() + " " + mascotas[i].getSexo());

        }
        
        mascota1.setNombre("Johny");
        mascota2.setNombre("Alfredo");
        
        System.out.println(mascota1.toString());
        System.out.println(mascota2.toString());          
        System.out.println("");
        
        
        System.out.println("Mascotas de especie perros");
        
         for (int i = 0; i < mascotas.length; i++) {

             if(mascotas[i].getEspecie().equals("perro"))
            System.out.println(mascotas[i].toString());

        }
        
    }

}
