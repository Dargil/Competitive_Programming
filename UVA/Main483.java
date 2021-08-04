package Accepted;


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
public class Main483 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            String dato = leerDatos.nextLine();
            String[] palabras = dato.split(" ");
            String resultado = "";
            for (int i = 0; i < palabras.length; i++) {
                for (int j = palabras[i].length()-1; j >= 0; j--) {
                    resultado += palabras[i].charAt(j);
                }
                if (i != palabras.length - 1) {
                    resultado += " ";
                }
            }
            if (dato.length() == resultado.length()) {
                System.out.println(resultado);
            } else {
                int veces = dato.length() - resultado.length();
                for (int i = 0; i < veces; i++) {
                    resultado += " ";
                }
                System.out.println(resultado);
            }

        }
    }
}
