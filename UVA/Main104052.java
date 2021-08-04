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
public class Main104052 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            String a = leerDatos.nextLine();
            String b = leerDatos.nextLine();
            System.out.println(subsecuencia(a, b));
        }

    }

    public static int subsecuencia(String x, String y) {
        int filas = x.length() + 1;
        int columnas = y.length() + 1;
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || j == 0) {
                    matriz[i][j] = 0;
                } else if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    matriz[i][j] = (matriz[i - 1][j - 1]) + 1;
                } else {
                    matriz[i][j] = Math.max(matriz[i - 1][j], matriz[i][j - 1]);
                }
            }
        }
        return matriz[x.length()][y.length()];
    }
}
