/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEFFERSON
 */
public class Factorial {

    public static void main(String[] args) {

        int dato = 100;
       System.out.println("normal : "+factorialNormal(dato));
        System.out.println("Recursion : "+factorialRecursion(dato));

    }

    public static double factorialNormal(int dato) {
        double resultado = 1;
        for (int i = 1; i <= dato; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double factorialRecursion(int dato) {
        if (dato == 0) {
            return 1;
        } else {
            return dato * factorialRecursion(dato - 1);
        }

    }

}
