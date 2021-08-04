package Accepted;


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
public class Main117999 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        for (int i = 0; i < casos; i++) {
            ArrayList<Integer> datos = new ArrayList<>();
            int t = leerDatos.nextInt();
            for (int j = 0; j < t; j++) {
                datos.add(leerDatos.nextInt());
            }
            System.out.println("Case " + (i + 1) + ": " + mayor(datos));
        }
    }

    static int mayor(ArrayList<Integer> a) {
        int mayor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > mayor) {
                mayor = a.get(i);
            }
        }
        return mayor;
    }
}
