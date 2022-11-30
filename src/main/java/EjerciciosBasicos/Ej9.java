package EjerciciosBasicos;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        // Lee un número por teclado que pida el precio de un producto (puede tener decimales)
        // y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();

        double pcioFinal = precio * 1.21;

        System.out.println("El precio final es $" + pcioFinal);

    }
}