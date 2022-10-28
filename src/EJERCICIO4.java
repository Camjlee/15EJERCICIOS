import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.printf("Hola, %s. Bienvenid@! ", nombre);

    }
}