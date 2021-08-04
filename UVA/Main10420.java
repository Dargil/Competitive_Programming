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
public class Main10420 {

    static ArrayList<Ciudad> datos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        leerDatos.nextLine();
        for (int i = 0; i < casos; i++) {
            String a = leerDatos.nextLine();
            String b = a.trim();
            String[] c = b.split(" ");
            String nombre = c[0];
            Ciudad ciudad = new Ciudad(nombre);
        }
        Collections.sort(datos);
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i).nombre + " " + datos.get(i).cnt);
        }
    }

    static class Ciudad implements Comparable<Ciudad> {

        String nombre;
        int cnt;

        public Ciudad(String nombre, int cnt) {
            this.nombre = nombre;
            this.cnt = cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

        public int getCnt() {
            return cnt;
        }

        public Ciudad(String nombre) {
            if (datos.isEmpty()) {
                datos.add(new Ciudad(nombre, 1));
            } else {
                boolean encontro = false;
                for (int i = 0; i < datos.size(); i++) {
                    if (nombre.equals(datos.get(i).nombre)) {
                        datos.get(i).setCnt(datos.get(i).getCnt() + 1);
                        encontro = true;
                        break;
                    }
                }
                if (encontro == false) {
                    datos.add(new Ciudad(nombre, 1));
                }
            }
        }

        @Override
        public int compareTo(Ciudad t) {
            if ((nombre.compareTo(t.nombre)) < 0) {
                return -1;
            }
            if ((nombre.compareTo(t.nombre)) > 0) {
                return 1;
            }
            return 0;
        }

    }

}
