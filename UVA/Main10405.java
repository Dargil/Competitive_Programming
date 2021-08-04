package Accepted;


import java.util.ArrayList;
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
public class Main10405 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            String a = leerDatos.nextLine();
            String b = leerDatos.nextLine();
            System.out.println(subsecuenciaDinamica(a, b));
        }

    }

    public static int subsecuenciaDinamica(String x, String y) {
        int filas = y.length() + 1;
        int columnas = x.length() + 1;
        ArrayList matriz = new ArrayList();
        for (int i = 0; i < filas; i++) {
            ArrayList matrizaux = new ArrayList();
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || j == 0) {
                    matrizaux.add(j, 0);
                } else if (x.charAt(j - 1) == y.charAt(i - 1)) {
                    ArrayList matrizaux2 = new ArrayList();
                    matrizaux2 = (ArrayList) matriz.get(i - 1);
                    matrizaux.add(j, (int) matrizaux2.get(j - 1) + 1);
                } else {
                    ArrayList matrizaux3 = new ArrayList();
                    matrizaux3 = (ArrayList) matriz.get(i - 1);
                    matrizaux.add(j, Math.max((int) matrizaux3.get(j), (int) matrizaux.get(j - 1)));
                }
            }
            matriz.add(i, matrizaux);
        }
        int resultado = 0;
        ArrayList resul = (ArrayList) matriz.get(y.length());
        resultado = (int) resul.get(x.length());
        return resultado;
    }
}
