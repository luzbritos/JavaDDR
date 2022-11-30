package EjerciciosBasicos;

public class Ej2 {
    public static void main(String[] args) {
        // Declara 2 variables numéricas (con el valor que desees),
        // he indica cual es mayor de los dos. Si son iguales indicarlo también.
        // Ves cambiando los valores para comprobar que funciona.

        int a = 15;
        int b = 15;

        if(a>b){
            System.out.println(a + " es mayor que " + b);
        } else if (a<b) {
            System.out.println(b + " es mayor que " + a);
        }else {
            System.out.println("Los numeros son iguales");
        }
    }
}
