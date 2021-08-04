package Accepted;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
public class Main438 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            Punto punto1 = new Punto(Double.parseDouble(leerDatos.next()), Double.parseDouble(leerDatos.next()));
            Punto punto2 = new Punto(Double.parseDouble(leerDatos.next()), Double.parseDouble(leerDatos.next()));
            Punto punto3 = new Punto(Double.parseDouble(leerDatos.next()), Double.parseDouble(leerDatos.next()));

            double a = distancia(punto1, punto2);
            double b = distancia(punto1, punto3);
            double c = distancia(punto2, punto3);
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double radio = (a * b * c) / ((double) 4 * area);
            double circulo = (double) 2 * Math.PI * radio;
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("0.00", simbolos);
            System.out.println(df.format(circulo));
        }

    }

    public static double distancia(Punto punto1, Punto punto2) {
        double distancia = 0;
        distancia = Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
        return distancia;
    }

    static class Punto {

        double x;
        double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}
