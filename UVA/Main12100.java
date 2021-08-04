package Accepted;


import java.util.LinkedList;
import java.util.Queue;
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
public class Main12100 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        for (int i = 0; i < casos; i++) {
            Queue<Integer> cola = new LinkedList<Integer>();
            int tamaño = leerDatos.nextInt();
            int ubicacion = leerDatos.nextInt();
            for (int j = 0; j < tamaño; j++) {
                cola.add(leerDatos.nextInt());
            }
            int resultado = 0;
            int posMayor = -1;
            while (true) {
                int mayor = 0;
                posMayor = 0;
                for (int j = 0; j < cola.size(); j++) {
                    if (cola.element() > mayor) {
                        mayor = cola.element();
                        posMayor = j;
                    }
                    cola.add(cola.poll());
                }
                for (int j = 0; j < posMayor; j++) {
                    cola.add(cola.poll());
                }
                if (ubicacion < posMayor) {
                    ubicacion = (tamaño - posMayor) + ubicacion;
                    ubicacion = ubicacion - 1;
                    cola.remove();
                    tamaño = tamaño - 1;
                } else if (ubicacion > posMayor) {
                    ubicacion = ubicacion - posMayor - 1;
                    cola.remove();
                    tamaño = tamaño - 1;
                } else {
                    ubicacion = 0;
                    cola.remove();
                    tamaño = tamaño - 1;
                    resultado++;
                    break;
                }
                resultado++;
            }
            System.out.println(resultado);
        }
    }
}
