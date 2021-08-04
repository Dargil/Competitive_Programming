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
public class Main11727 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        for (int i = 0; i < casos; i++) {
            ArrayList<Integer> datos = new ArrayList<>();
            datos.add(leerDatos.nextInt());
            datos.add(leerDatos.nextInt());
            datos.add(leerDatos.nextInt());
            menor(datos);
            mayor(datos);
            System.out.println("Case " + (i + 1) + ": " + datos.get(0));
        }
    }

    static void menor(ArrayList<Integer> a) {
        int pos = 0;
        int menor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (menor > a.get(i)) {
                menor = a.get(i);
                pos = i;
            }
        }
        a.remove(pos);
    }

    static void mayor(ArrayList<Integer> a) {
        int pos = 0;
        int mayor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (mayor < a.get(i)) {
                mayor = a.get(i);
                pos = i;
            }
        }
        a.remove(pos);
    }

}
