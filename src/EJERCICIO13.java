import java.util.Scanner;

public class EJERCICIO13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de ventas que necesitas procesar: ");
        int cantidad = entrada.nextInt();
        double total = 0;

        System.out.println("Ingresa tus " + cantidad + " ventas (ejemplo: 6.99): " );

        int v=1;
        while (v<=cantidad) {
            System.out.println("Venta " + v + ": " );
            double venta = entrada.nextDouble();
            total = total + venta;
            v++;
        }

        System.out.printf("El total de tus %d ventas es: %.2f ", cantidad, total);
    }
}
