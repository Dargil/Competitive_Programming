package Accepted;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
public class Main10892 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader ls = new BufferedReader(new InputStreamReader(System.in));
        String m = "";
        StringBuilder d = new StringBuilder();
        while ((m = ls.readLine()) != null) {
            if (m.equals("0")) {
                break;
            }
            long a = Long.parseLong(m);
            LinkedList<Long> datos = new LinkedList<Long>();
            for (long i = 1; i * i <= a; i++) {
                if (a % i == 0) {
                    datos.add(i);
                    if (i != a / i) {
                        datos.add(a / i);
                    }
                }
            }
            
            int resultado = 0;
            for (int i = 0; i < datos.size(); i++) {
                for (int j = i; j < datos.size(); j++) {
                    if (re(datos.get(i), datos.get(j)) == a) {
                        resultado++;
                    }
                }
            }
            d.append(a).append(" ").append(resultado).append("\n");
        }
        System.out.print(d);
    }
    
    public static long mcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static long re(long a, long b) {
        return (a * b) / mcd(a, b);
    }
}
