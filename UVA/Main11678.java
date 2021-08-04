package Accepted;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JEFFERSON
 */
public class Main11678 {

    public static void main(String[] args) {
        FastReader leerDatos = new FastReader();
        int n = 0, k = 0;
        while ((n = leerDatos.nextInt()) != 0 && (k = leerDatos.nextInt()) != 0) {
            HashSet conjuntosn = new HashSet();
            HashSet conjuntosk = new HashSet();
            for (int i = 0; i < n; i++) {
                conjuntosn.add(leerDatos.nextInt());
            }
            for (int i = 0; i < k; i++) {
                conjuntosk.add(leerDatos.nextInt());
            }
            int tamanio = conjuntosn.size();
            conjuntosn.retainAll(conjuntosk);
            System.out.println(Math.min(tamanio - conjuntosn.size(), conjuntosk.size() - conjuntosn.size()));

        }
        System.exit(0);
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
