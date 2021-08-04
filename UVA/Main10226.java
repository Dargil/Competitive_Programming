package Accepted;


import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
public class Main10226 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        leerDatos.nextLine();
        for (int i = 0; i < casos; i++) {
            leerDatos.nextLine();
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            String a = "";
            int cantidad = 0;
            while (!(a = leerDatos.nextLine()).equals("")) {
                if (map.containsKey(a)) {
                    int total = map.get(a);
                    map.put(a, total + 1);
                } else {
                    map.put(a, 1);
                }
                cantidad++;
            }
            for (Entry<String, Integer> dato : map.entrySet()) {
                System.out.printf("%s %.4f\n", dato.getKey(), dato.getValue() * 100.0 / cantidad);
            }
            System.out.println("");
        }
    }
}
