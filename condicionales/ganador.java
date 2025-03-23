package condicionales;
/*
Problema:
Juan y David empezaron a correr una maratón al mediodía. Juan terminó a las h1 horas, m1 minutos y s1 segundos,
mientras que David lo hizo a las h2 horas, m2 minutos y s2 segundos. ¿Quién fue el ganador de la carrera?
 */

import java.util.Scanner;

public class ganador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo de Juan: ");
        System.out.print("Horas: ");
        int h1 = sc.nextInt();
        System.out.print("Minutos: ");
        int m1 = sc.nextInt();
        System.out.print("Segundos: ");
        int s1 = sc.nextInt();

        System.out.println("Introduce el tiempo de David: ");
        System.out.print("Horas: ");
        int h2 = sc.nextInt();
        System.out.print("Minutos: ");
        int m2 = sc.nextInt();
        System.out.print("Segundos: ");
        int s2 = sc.nextInt();

        System.out.println(ganadorCarrera(h1, m1, s1, h2, m2, s2));
        sc.close();

    }

    public static String ganadorCarrera(int h1, int m1, int s1, int h2, int m2, int s2) {
        int tiempoJuan = h1 * 3600 + m1 * 60 + s1;
        int tiempoDavid = h2 * 3600 + m2 * 60 + s2;
        if (tiempoJuan < tiempoDavid) {
            return "Juan en " + (tiempoDavid - tiempoJuan) + " segundos";
        } else if (tiempoDavid < tiempoJuan) {
            return "David en " + (tiempoJuan - tiempoDavid) + " segundos";
        } else {
            return "Empate en " + tiempoJuan + " segundos";
        }
    }
    
}
