package Ejercicios;
import java.lang.Math;
import java.util.Scanner;


public class Ej5 {
    public static void main(String[] args) {
        // Haz una aplicación que calcule el área de un círculo(pi*R2).
        // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
        // Usa la constante PI y el método pow de Math.

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese el radio del círculo");
        double radio = entrada.nextDouble();

        double area = Math.PI*(Math.pow(radio,2));

        System.out.println("El área del círculo es: "+ area);

    }
}
