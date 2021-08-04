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
public class Main10340 {

    public static void main(String[] args) throws IOException {
        BufferedReader ls = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        while ((dato = ls.readLine()) != null) {
            String palabras[] = dato.split(" ");
            int contador = 0;
            int pos = 0;
            for (int i = 0; i < palabras[0].length(); i++, pos++, contador++) {
                pos = palabras[1].indexOf(palabras[0].charAt(i), pos);
                if (pos == -1) {
                    break;
                }
            }

            if (contador == palabras[0].length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
