package condicionales;

import java.util.Scanner;

/*
Problema:
Se desea determinar si un triángulo, dadas las longitudes de sus lados, es equilátero, isósceles o escaleno.
 */

public class tipo_de_triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Ingrese el lado a: ");
        a = sc.nextInt();
        System.out.print("Ingrese el lado b: ");
        b = sc.nextInt();
        System.out.print("Ingrese el lado c: ");
        c = sc.nextInt();

        System.out.println("El triangulo es: " + tipoTriangulo(a, b, c));
        sc.close();

    }

    public static String tipoTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilatero"; // Equilátero es cuando los tres lados son iguales
        } else if (a == b || a == c || b == c) {
            return "Isosceles";  // Isósceles es cuando dos lados son iguales
        } else {
            return "Escaleno";  // Escaleno es cuando los tres lados son diferentes
        }
    }

}
