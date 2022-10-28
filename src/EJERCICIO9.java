import java.util.Scanner;

public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor bruto del producto:");
        System.out.println("(Ejemplo: 6.50)");
        double precio = entrada.nextDouble();

        double total = precio + (precio * 21 / 100);
        System.out.printf("El valor pvp de tu producto es: %.2f", total );



    }
}
