package Metodos;

import java.util.Scanner;

public class circulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo:");
        double radio = entrada.nextDouble();
        
        double area = areaCirculo(radio);
        double perimetro = perimetroCirculo(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        entrada.close();

    }
    
    static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);            
    }

    static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    } 
}