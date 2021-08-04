package Accepted;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class Main11308 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int t = leerDatos.nextInt();
        for (int k = 0; k < t; k++) {
            leerDatos.nextLine();
            String title = leerDatos.nextLine();
            int m, n, b;
            m = leerDatos.nextInt();
            n = leerDatos.nextInt();
            b = leerDatos.nextInt();
            HashMap costIngredient = new HashMap(m);
            for (int i = 0; i < m; i++) {
                String ingredient = leerDatos.next();
                int c = leerDatos.nextInt();
                costIngredient.put(ingredient, c);
            }
            ArrayList<Receta> receta = new ArrayList<Receta>();
            for (int i = 0; i < n; i++) {
                leerDatos.nextLine();
                String nombreReceta = leerDatos.nextLine();
                int cntIngredientes = leerDatos.nextInt();
                int costo = 0;
                for (int j = 0; j < cntIngredientes; j++) {
                    String nombreIngrediente = leerDatos.next();
                    int cantidad = leerDatos.nextInt();
                    costo += (int) costIngredient.get(nombreIngrediente) * cantidad;
                }
                if (costo <= b) {
                    receta.add(new Receta(nombreReceta, costo));
                }
            }
            Comparator<Receta> comparador = new Comparator<Receta>() {
                @Override
                public int compare(Receta t, Receta t1) {
                    int resultado = Integer.compare(t.getCosto(), t1.getCosto());
                    if (resultado != 0) {
                        return resultado;
                    }
                    resultado = t.getNombre().compareToIgnoreCase(t1.getNombre());
                    return resultado;
                }
            };
            System.out.println(title.toUpperCase());
            Collections.sort(receta, comparador);
            if (receta.isEmpty()) {
                System.out.println("Too expensive!");
            } else {
                for (int i = 0; i < receta.size(); i++) {
                    Receta p = (Receta) receta.get(i);
                    if (p.costo <= b) {
                        System.out.println(p.nombre);
                    }
                }
            }
            System.out.println("");
        }

    }

    static class Receta {

        String nombre;
        int costo;

        public Receta(String nombre, int costo) {
            this.nombre = nombre;
            this.costo = costo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCosto() {
            return costo;
        }

        public void setCosto(int costo) {
            this.costo = costo;
        }

    }
}
