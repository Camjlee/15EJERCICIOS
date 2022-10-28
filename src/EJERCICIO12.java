public class EJERCICIO12 {
    public static void main(String[] args) {

        System.out.println("Estos son los números, entre 1 y 100, que son divisibles en 2: ");

        for (int i=1;i<=100;i++) {
            if (i%2==0) {

                System.out.print(i + ", ");
            }
        }

        System.out.println(" ");
        System.out.println("Estos son los números, entre 1 y 100, que son divisibles en 3: ");

        for (int i=1;i<=100;i++) {
            if (i%3==0) {

                System.out.print(i + ", ");

            }
        }


    }
}
