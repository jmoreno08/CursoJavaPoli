package condicionales;

public class condicionales {


    public static void main(String[] args) {

        //Calcular el valor absoluto de un número
        System.out.println("El valor absoluto de -5 es: " + valorAbsoluto(-5));
        System.out.println("El valor absoluto de 5 es: " + valorAbsoluto(5));

        //Determinar si un año es bisiesto
        System.out.println("El año 2020 es bisiesto: " + bisiesto(2020));
        System.out.println("El año 2021 es bisiesto: " + bisiesto(2021));
    }

    static int valorAbsoluto(int numero) {

        if (numero < 0) {
            return numero * -1;
        } else {
            return numero;
        }

    }

    static boolean bisiesto(int n) {

        if(n % 4 ==0){
            if(n % 100 == 0){
                if(n % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }

    }

}
