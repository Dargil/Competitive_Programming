package Accepted;


import java.io.IOException;
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
public class Main10071 {

    public static void main(String[] args) throws IOException {
        Scanner leerDatos = new Scanner(System.in);
        int a = 0, b = 0;
        while (leerDatos.hasNext()) {
            a = leerDatos.nextInt();
            b = leerDatos.nextInt();
            System.out.println(a * b * 2);
        }
    }
}
