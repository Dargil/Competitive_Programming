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
public class Main10055 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            BigInteger a = new BigInteger(leerDatos.next());
             BigInteger b = new BigInteger(leerDatos.next());
             BigInteger c=a.subtract(b);
            System.out.println(c.abs());
        }
    }
}
