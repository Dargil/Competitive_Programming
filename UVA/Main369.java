package Accepted;


import java.math.BigInteger;
import java.util.ArrayList;
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
public class Main369 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int n = 0;
        int m = 0;
        ArrayList<BigInteger> factorial = new ArrayList<BigInteger>();
        factorial.add(0, BigInteger.ONE);
        factorial.add(1, BigInteger.ONE);
        for (int i = 2; i <= 100; i++) {
            factorial.add(i, factorial.get(i - 1).multiply(BigInteger.valueOf(i)));
        }
        while ((n = leerDatos.nextInt()) != 0 && (m = leerDatos.nextInt()) != 0) {
            BigInteger resultado = factorial.get(n).divide(factorial.get(n - m).multiply(factorial.get(m)));
            System.out.println(n + " things taken " + m + " at a time is " + resultado + " exactly.");
        }
    }
}
