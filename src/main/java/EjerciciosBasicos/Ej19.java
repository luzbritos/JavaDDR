package EjerciciosBasicos;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        // Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
        // Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
        // Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        String num = sc.next();

        int cifras = num.length();

        System.out.println(num + " tiene " +cifras + " cifras");

        //DDR
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=sc.nextInt();
        }while(numero<0); int contador=0; for (int i=numero;i>0;i/=10){
            //Incrementamos el contador
            contador++;
        }

        //Controlamos en el caso de que haya una cifra o mas
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }
    }
}
