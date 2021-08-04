package Accepted;


import java.util.PriorityQueue;
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
public class Main10954 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = 0;
        while ((casos = leerDatos.nextInt()) != 0) {
            PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
            leerDatos.nextLine();
            String cadena = leerDatos.nextLine();
            String[] datos = cadena.split(" ");
            for (int i = 0; i < datos.length; i++) {
                cola.add(Integer.parseInt(datos[i]));
            }
            int resultado = 0;
            while (cola.size() != 1) {
                int a = cola.remove();
                int b = cola.remove();
                int c = a + b;
                resultado += c;
                cola.add(c);
            }
            System.out.println(resultado);
        }
    }
}
