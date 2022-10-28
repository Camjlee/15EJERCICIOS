import java.lang.Math;
import java.util.Scanner;

public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Considera la ecuación de segundo grado ax^2 + bx + c = 0 ");
        System.out.println("ingresa a: ");
        int a = entrada.nextInt();
        System.out.println("ingresa b: ");
        int b = entrada.nextInt();
        System.out.println("ingresa c: ");
        int c = entrada.nextInt();

        double raiz = Math.sqrt ((b * b) - (4 * a * c)); //corresponde a la parte interna de la ecuacion
        double X1 = ((-b + raiz) / (2 * a)); //resolucion final de la ecuacion con +
        double X2 = ((-b - raiz) / (2 * a)); //resolucion final de la ecuacion con -

        System.out.println("Los valores de X para tu ecuación son: ");
        System.out.println("X1=" + X1 + " y X2=" + X2);
        System.out.println("Solución: {" + X1 + "," + X2 + "} ");

        }








}
