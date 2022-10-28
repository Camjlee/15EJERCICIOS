import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, ingresa un primer número: ");
        int primero = entrada.nextInt();
        System.out.println("Por favor, ingresa un segundo número: ");
        int segundo = entrada.nextInt();

        if (primero<segundo){
            System.out.println("Tu primer número es de menor valor que tu segundo número. ");
        } else if (primero>segundo){
            System.out.println("Tu primer número es de mayor valor que tu segundo número. ");
        } else {
            System.out.println("Tu primer número es de igual valor que tu segundo número. ");
        }
    }
}
