package Accepted;


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
public class Main10282 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        HashMap<String, String> mapa = new HashMap<String, String>();
        String a = "";
        while (!(a = leerDatos.nextLine()).equals("")) {
            String[] b = a.split(" ");
            mapa.put(b[1], b[0]);
        }
        while (leerDatos.hasNext()) {
            String dato = leerDatos.next();
            if (mapa.containsKey(dato)) {
                System.out.println(mapa.get(dato));
            } else {
                System.out.println("eh");
            }
        }
    }
}
