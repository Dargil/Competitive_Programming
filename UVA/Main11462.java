package Accepted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11462 {

    public static void main(String[] args) {
        FastReader leerDatos = new FastReader();
        int casos = 0;
        while ((casos = leerDatos.nextInt()) != 0) {
            int[] edades = new int[casos];
            for (int i = 0; i < casos; i++) {
                edades[i] = leerDatos.nextInt();
            }
            Arrays.sort(edades);
            StringBuffer resultado = new StringBuffer();
            for (int i : edades) {
                resultado.append(i + " ");
            }
            resultado.deleteCharAt(resultado.length() - 1);
            System.out.println(resultado);
        }
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
