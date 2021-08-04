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
public class Main11498 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int a = 0;
        while ((a = leerDatos.nextInt()) != 0) {
            int x = leerDatos.nextInt();
            int y = leerDatos.nextInt();
            for (int i = 0; i < a; i++) {
                int x1 = leerDatos.nextInt();
                int y1 = leerDatos.nextInt();
                int c = x1 - x;
                int b = y1 - y;
                if (c > 0 && b > 0) {
                    System.out.println("NE");
                } else if (c < 0 && b < 0) {
                    System.out.println("SO");
                } else if (c < 0 && b > 0) {
                    System.out.println("NO");
                } else if (c > 0 && b < 0) {
                    System.out.println("SE");
                } else {
                    System.out.println("divisa");
                }
            }

        }

    }
}
