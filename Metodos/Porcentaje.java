package Metodos;

public class Porcentaje {

    public static void main(String[] args) {
        System.out.println("El 10% de 100 es: " + porcentaje(5000, 10));
        System.out.println("El 15% de 100 es: " + porcentaje(2000*2+1000, 100+50));

        double valor = 5000;
        double porcentaje = 30;

        System.out.println("El 30% de " + valor + " es: " + porcentaje(valor, porcentaje));

    }

    static double porcentaje(double dinero, double p) {
        return (dinero * p) / 100;
    }

}
