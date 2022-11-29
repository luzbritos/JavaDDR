package Ejercicios;

import java.util.Scanner;



public class Ej3 {
    public static void main(String[] args) {
        //Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        // Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String nombre = entrada.next();

        System.out.println("Bienvenido " + nombre);

    }
}
