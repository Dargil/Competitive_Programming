package Accepted;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
public class Main11995 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            int casos = leerDatos.nextInt();
            Stack<Integer> pila = new Stack<Integer>();
            Queue<Integer> cola = new LinkedList<Integer>();
            PriorityQueue<Integer> coladeprioridad = new PriorityQueue<>(Collections.reverseOrder());
            boolean pilita = true;
            boolean colita = true;
            boolean prioridad = true;

            for (int i = 0; i < casos; i++) {
                int a = leerDatos.nextInt();
                int b = leerDatos.nextInt();
                if (a == 1) {
                    pila.push(b);
                    cola.add(b);
                    coladeprioridad.add(b);
                } else {
                    if (!pila.isEmpty()) {
                        if (pila.peek() == b) {
                            pila.pop();
                        } else {
                            pilita = false;
                        }
                    } else {
                        pilita = false;
                    }

                    if (!cola.isEmpty()) {
                        if (cola.element() == b) {
                            cola.remove();
                        } else {
                            colita = false;
                        }
                    } else {
                        colita = false;
                    }

                    if (!coladeprioridad.isEmpty()) {
                        if (coladeprioridad.element() == b) {
                            coladeprioridad.remove();
                        } else {
                            prioridad = false;
                        }
                    } else {
                        prioridad = false;
                    }
                }
            }
            if (pilita == true && colita == false && prioridad == false) {
                System.out.println("stack");
            } else if (pilita == false && colita == true && prioridad == false) {
                System.out.println("queue");
            } else if (pilita == false && colita == false && prioridad == true) {
                System.out.println("priority queue");
            } else if (pilita == true || colita == true || prioridad == true) {
                System.out.println("not sure");
            } else {
                System.out.println("impossible");
            }
        }
    }
}
