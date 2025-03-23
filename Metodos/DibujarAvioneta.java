package Metodos;

public class DibujarAvioneta {

    
    public static void main(String[] args) {
        System.out.println("Dibujando avioneta...");
        dibujarAvioneta();
    }
    
    static void dibujarAvioneta(){

        String avioneta =
                "       __|__\n" +
                "--@--@--(_)--@--@--\n" +
                "       /   \\\n" +
                "      /_____\\\n" +
                "      \\o o o/";
        System.out.println(avioneta);
    }
}
