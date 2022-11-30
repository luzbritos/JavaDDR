package EjerciciosBasicos;

import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        //Modifica el ejercicio anterior, para que en lugar de pedir un número,
        // pida un carácter (char) y muestre su código en la tabla ASCII.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char caracter = entrada.next().charAt(0);

        //Pasamos el caracter a codigo
        int codigo=(int)caracter;
        System.out.println(codigo);
    }
}
