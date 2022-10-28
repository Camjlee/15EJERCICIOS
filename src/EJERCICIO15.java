import javax.swing.*;
import java.util.Scanner;

public class EJERCICIO15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        //int num = entrada.nextInt(); no entiendo por que es solo "int num" y no "int num = entrada.nextInt()"

        do {
            System.out.println("Ingresa un número: ");
            num = entrada.nextInt();
        } while (num <= 0);

        System.out.println("Tu número es " + num + ". ");

    }
}
