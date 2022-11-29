package Ejercicios;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        //Escribe una aplicación con un String que contenga una contraseña cualquiera.
        // Después se te pedirá que introduzcas la contraseña, con 3 intentos.
        // Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
        // Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

       /* Scanner sc = new Scanner(System.in);
        String pass = "abc";
        int suma = 0;
        String cont;



        do {
            System.out.println("Ingrese su contraseña");
            cont = sc.next();
            if (pass != cont){
                System.out.println("Contraseña erronea");
            }
            suma ++;
        }while (pass != cont || suma != 3);*/


        Scanner sc = new Scanner(System.in);
        String contraseña="abc";

        final int INTENTOS = 3;

        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;

        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();

            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }


    }


}
