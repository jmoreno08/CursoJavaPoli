//Integrantes:
//  - JONATHAN MORENO NÚÑEZ
//  - DIEGO MONTOYA LOPEZ
//  - MATEO MONTOYA RODRIGUEZ
//  - DIANA MARCELA MORALES ROJAS
//  - ALBERTO MORENO ROMERO

// Ejercicio 

/* 
1. Siglo
En la clase de historia de Juan con frecuencia se habla de los siglos en que ocurrieron ciertos
hechos. Esto hace que a Juan se le dificulte un poco ubicar los hechos en una línea de tiempo.
Su tarea es escribir un programa java que ayude a Juan.

A. Escriba un método java llamado siglo, el cual recibe como entrada el número de un año
(positivo), y retorna el número del siglo al que pertenece el año.

B. Escriba un método java llamado primer_anho, el cual recibe como entrada el número de
un siglo (positivo), y retorna el número del primer año de dicho siglo.

C. Complete el programa de forma que lea del teclado un valor n correspondiente a un año,
e imprima en pantalla el número del siglo al que pertenece el año n y el primer año de
dicho siglo.

El programa debe usar los métodos creados en los literales a y b.

 */
import java.util.Scanner;

public class Entrega1_GrupoB03_Equipo18 {

    // Método para calcular el siglo de un año dado
    public static int siglo(int anho) {
        return (anho + 99) / 100;
    }

    // Método para calcular el primer año de un siglo dado
    public static int primer_anho(int siglo) {
        return (siglo - 1) * 100 + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) { // Mientras no se seleccione la opción de salir
            // Mostrar menú
            System.out.println("\n=== Calculadora de Siglos ===");
            System.out.println("1. Calcular siglo a partir de un año");
            System.out.println("2. Calcular primer año a partir de un siglo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            // Validar que la opción ingresada sea un número entero
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    int anho = obtenerNumeroPositivo(scanner, "Ingrese un año positivo: ");
                    int siglo = siglo(anho);
                    System.out.println("El año " + anho + " pertenece al siglo " + siglo);
                } 
                else if (opcion == 2) {
                    int sigloIngresado = obtenerNumeroPositivo(scanner, "Ingrese un siglo positivo: ");
                    int primerAnho = primer_anho(sigloIngresado);
                    System.out.println("El primer año del siglo " + sigloIngresado + " es " + primerAnho);
                } 
                else if (opcion == 3) {
                    System.out.println("Saliendo del programa...");
                } 
                else {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        scanner.close();
    }

    // Método para obtener un número entero positivo con validación
    public static int obtenerNumeroPositivo(Scanner scanner, String mensaje) {
        int numero;
        while (true) { // Ciclo infinito hasta que se ingrese un número positivo
            System.out.print(mensaje);
            if (scanner.hasNextInt()) { // Validar que la entrada sea un número
                numero = scanner.nextInt();
                if (numero > 0) { // Validar que el número sea positivo
                    return numero;
                } else {
                    System.out.println("Error: El número debe ser positivo.");
                }
            } else {
                System.out.println("Error: Entrada inválida. Debe ingresar un número.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }
    }
}
