package EjerciciosBasicos;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
        Scanner sc = new Scanner(System.in);
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int num;
        do {
            System.out.println("Ingrese un numero ");
            num = sc.nextInt();
        }while (num < 0);

        //System.out.println(num);
    }

}
