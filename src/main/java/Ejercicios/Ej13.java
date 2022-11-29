package Ejercicios;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        //Realiza una aplicación que nos pida un número de ventas a introducir,
        // después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
        // Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        double suma;
        suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de ventas");
        int vtas = sc.nextInt();

        for (int i = 0; i< vtas; i++){
            System.out.println("Ingrese el valor de la venta");
            double valor = sc.nextDouble();
            suma += valor;
        }

        System.out.println("La suma de todas las ventas es $" + suma);
    }
}
