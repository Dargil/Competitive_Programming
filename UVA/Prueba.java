
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
public class Prueba {

    public static void main(String args[]) throws IOException {
        String nombre;

        System.out.print("Introduzca su nombre (una o varias palabras): ");

        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter(System.getProperty("line.separator"));
        nombre = entrada.next();

        System.out.println("Hola, " + nombre);
    }
}
