package EjerciciosBasicos;

import java.util.Scanner;
import java.lang.Math;

public class Ej20 {
    public static void main(String[] args) {
        //Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
        // Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        //Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
        //NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzco un numero");
        int num = sc.nextInt();

        int suma = 0;

        for(int i=1; i<=num; i++){
            if (num % i == 0){
                suma ++;
            }
        }

        if (suma == 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

        //DDR
        System.out.println("*** DDR ***");
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        //Un numero negativo, el 0 y el 1, son directamente no primos.
        if (numero <= 1) {
            System.out.println("El numero " + numero + " no es primo");
        } else {

            //Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(numero);
            int contador = 0;

            //Contamos el numero de divisibles
            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            /*Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0
             */
            //Mensaje de traza
            System.out.println(">>" + contador);

            if (contador < 1) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
        }

    }
}
