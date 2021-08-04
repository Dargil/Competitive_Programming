package Accepted;


import java.util.ArrayList;
import java.util.Collections;
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
public class Main10038 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            int casos = leerDatos.nextInt();
            ArrayList<Integer> datos = new ArrayList<Integer>();
            ArrayList<Integer> resultado = new ArrayList<Integer>();
            for (int i = 0; i < casos; i++) {
                datos.add(leerDatos.nextInt());
            }
            for (int i = 0; i < datos.size() - 1; i++) {
                resultado.add(Math.abs(datos.get(i) - datos.get(i + 1)));
            }
            Collections.sort(resultado);
            System.out.println(isJolly(resultado));
        }
    }

    public static String isJolly(ArrayList<Integer> resultado) {
        String a = "Jolly";
        String b = "Not jolly";
        if (resultado.size() > 0) {
            if (resultado.get(0) != 1) {
                return b;
            }
        }
        for (int i = 0; i < resultado.size() - 1; i++) {
            if (resultado.get(i) != (resultado.get(i + 1) - 1)) {
                return b;
            }
        }
        return a;
    }
}
