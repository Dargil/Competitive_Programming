package Accepted;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
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
public class Main11340 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        for (int t = 0; t < casos; t++) {
            int k = leerDatos.nextInt();
            HashMap mapa = new HashMap();
            for (int i = 0; i < k; i++) {
                char a = leerDatos.next().charAt(0);
                double b = leerDatos.nextDouble() / 100;
                mapa.put(a, b);
            }
            int frases = leerDatos.nextInt();
            leerDatos.nextLine();
            double precio = 0.0;
            for (int i = 0; i < frases; i++) {
                String a = leerDatos.nextLine();
                for (int j = 0; j < a.length(); j++) {
                    if (mapa.get(a.charAt(j)) != null) {
                        precio += (double) mapa.get(a.charAt(j));
                    }
                }
            }
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("0.00", simbolos);
            System.out.println(df.format(precio) + "$");

        }
    }
}
