import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        int num = entrada.nextInt();

        if (num%2==0) {
            System.out.printf("El número %d SÍ es divisible en 2. ", num);
        } else {
            System.out.printf("El número %d NO es divisible en 2. ", num);
        }
    }
}
