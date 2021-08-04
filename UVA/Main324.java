package Accepted;


import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
 class Main324 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            int a = leerDatos.nextInt();
            if (a == 0) {
                break;
            }
            String dato, resultado = "";
            int[] cntDatos = new int[10];
            dato = String.valueOf(factorial(new BigInteger(String.valueOf(a))));
            for (int i = 0; i < cntDatos.length; i++) {
                int contador = 0;
                for (int j = 0; j < dato.length(); j++) {
                    if (i == Integer.parseInt(String.valueOf(dato.charAt(j)))) {
                        contador++;
                    }
                }
                cntDatos[i] = contador;
            }
            System.out.println(a + "! --");
            resultado += "   ";
            for (int i = 0; i < cntDatos.length; i++) {
                if (i == 5) {
                    resultado += "\n" + "   ";
                }
                resultado += "(" + i + ")";
                for (int j = 0; j < 5 - (numeroDigitos(cntDatos[i])); j++) {
                    resultado += " ";
                }
                if (i == 4 || i == 9) {
                    resultado += cntDatos[i];
                } else {
                    resultado += cntDatos[i] + "    ";
                }
            }
            System.out.println(resultado);
        }
    }

     static BigInteger factorial(BigInteger dato) {
        if (dato.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return dato.multiply(factorial(dato.subtract(BigInteger.ONE)));
        }
    }

     static int numeroDigitos(int a) {
        if (a == 0) {
            return 1;
        }
        int numero = 0;
        while (a > 0) {
            a = a / 10;
            numero++;
        }
        return numero;
    }

}
