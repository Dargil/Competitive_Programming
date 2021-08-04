package Accepted;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
public class Main12577 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader ls = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        int contador = 1;
        while (!(dato = ls.readLine()).equals("*")) {
            if (dato.equals("Hajj")) {
                System.out.println("Case " + contador + ": " + "Hajj-e-Akbar");
            } else {
                System.out.println("Case " + contador + ": " + "Hajj-e-Asghar");
            }
            contador++;
        }
        System.exit(0);
    }
}
