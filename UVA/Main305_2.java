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
public class Main305oP {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int k = 0;
        while ((k = leerDatos.nextInt()) != 0) {
            Queue<Integer> cola = new LinkedList();
            for (int i = 1; i <= 2 * k; i++) {
                cola.add(i);
            }
            Queue<Integer> aux = new LinkedList();
            aux.addAll(cola);
            int contador = k + 1;
            while (aux.size() != k) {
                for (int i = 0; i < contador - 1; i++) {
                    aux.add(aux.remove());
                }
                if (aux.element() > k) {
                    aux.remove();
                } else {
                    aux.clear();
                    aux.addAll(cola);
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
