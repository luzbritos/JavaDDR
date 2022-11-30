package EjerciciosBasicos;

import java.util.Scanner;
import java.lang.Math;

public class Ej14 {
    public static void main(String[] args) {
        // Realiza una aplicación que nos calcule una ecuación de segundo grado.
        // Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada).
        // Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese a");
        int a = sc.nextInt();
        System.out.println("Ingrese b");
        int b = sc.nextInt();
        System.out.println("Ingrese c");
        int c = sc.nextInt();

        double disc = Math.pow(b,2) - 4 * a * c;

        if(disc > 0){
            double x1 = (-b + Math.sqrt(disc))/2*a;
            double x2 = (-b - Math.sqrt(disc))/2*a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (disc == 0) {
            double x = -b/2*a;
            System.out.println("x = " + x);
        }else {
            System.out.println("La ecuacion no tiene raices reales");
        }


    }
}
