package EjerciciosBasicos;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        //Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana");
        String dia = sc.next();
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println(dia + " no es un dia laboral");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
