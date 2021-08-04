package Accepted;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.math.BigInteger;
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
public class Main496 {

    public static void main(String[] args) throws IOException {
        FastReader leerDatos = new FastReader();
        String datoa = "";
        while ((datoa = leerDatos.nextLine()) != null) {
            HashSet conjuntoa = new HashSet();
            HashSet conjuntob = new HashSet();
            HashSet interseccion = new HashSet();
            String[] a = datoa.split(" ");
            String[] b = leerDatos.nextLine().split(" ");
            for (int i = 0; i < a.length; i++) {
                conjuntoa.add(a[i]);
            }
            for (int i = 0; i < b.length; i++) {
                conjuntob.add(b[i]);
            }
            interseccion.addAll(conjuntoa);
            interseccion.retainAll(conjuntob);
            if (interseccion.size() == conjuntoa.size() && interseccion.size() == conjuntob.size()) {
                System.out.println("A equals B");
            } else if (interseccion.size() == conjuntoa.size()) {
                System.out.println("A is a proper subset of B");
            } else if (interseccion.size() == conjuntob.size()) {
                System.out.println("B is a proper subset of A");
            } else if (interseccion.isEmpty()) {
                System.out.println("A and B are disjoint");
            } else {
                System.out.println("I'm confused!");
            }
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
