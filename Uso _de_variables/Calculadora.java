import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número:>>");
        int a = entrada.nextInt();
        System.out.println("Introduce el segundo número:>>");
        int b = entrada.nextInt();

        System.out.println("La suma es: " + (a + b));
        System.out.println("La resta es: " + (a - b));
        System.out.print("La multiplicación es: " + (a * b));
        System.out.println("La división es: " + (a / b));
        System.out.println("El módulo es: " + (a % b));
        entrada.close();
    }
}
