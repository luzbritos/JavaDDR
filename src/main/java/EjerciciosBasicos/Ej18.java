package EjerciciosBasicos;

import java.util.Scanner;
import java.lang.Math;

public class Ej18 {
    public static void main(String[] args) {
        //Pide por teclado dos número y genera 10 números aleatorios entre esos números.
        // Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();

        //int aleatorio = Math.random(num1,num2);

        for (int i=0;i<10;i++) {
            //Generamos un numero aleatorio
            int numAleatorio = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            System.out.println(numAleatorio);

        }


    }
}
