import javax.swing.*;
import java.util.Scanner;

public class EJER4JOption {
    public static void main(String[] args) {

        String teclado = JOptionPane.showInputDialog("Por favor, ingresa tu nombre: ");

        System.out.println("Bienvenid@, " + teclado + "!!");
    }
}

/* con Scanner
Scanner teclado = Scanner(System.in)
System.out.println("Ingresa tu nombre: ");
String n = teclado.next();

System.out.println("Bienvenido " + n)
 */
