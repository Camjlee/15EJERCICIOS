import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo (en cm): ");
        int radio = entrada.nextInt();

        double area = radio * radio * Math.PI;

        System.out.printf("El área de un círculo de radio %dcm es: %.2f cm2 ", radio, area);


    }
}
