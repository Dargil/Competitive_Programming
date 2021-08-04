package Accepted;


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
public class Main11689 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int casos = leerDatos.nextInt();
        int e = 0, f = 0, c = 0;
        for (int i = 0; i < casos; i++) {
            e = leerDatos.nextInt();
            f = leerDatos.nextInt();
            c = leerDatos.nextInt();
            int cantidad = e + f;
            int resultado = 0;
            int modulo = 0;
            int division = 0;
            while (cantidad >= c) {
                modulo = cantidad % c;
                division = cantidad / c;
                cantidad = modulo + division;
                resultado += division;
            }
            System.out.println(resultado);
        }
    }
}
