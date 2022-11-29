package Ejercicios;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
        // Si no lo es, también debemos indicarlo.
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese un número");
        int num = entrada.nextInt();

        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

    }
}
