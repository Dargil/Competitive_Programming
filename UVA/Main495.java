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
public class Main495 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        ArrayList<BigInteger> fibo = new ArrayList<>();
        fibo.add(0, BigInteger.valueOf(0));
        fibo.add(1, BigInteger.ONE);
        for (int i = 2; i < 5001; i++) {
            fibo.add(i, fibo.get(i - 1).add(fibo.get(i - 2)));
        }
        while (leerDatos.hasNext()) {
            int a = leerDatos.nextInt();
            System.out.println("The Fibonacci number for " + a + " is " + fibo.get(a));
        }
    }

}
