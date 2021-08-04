package Accepted;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
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
public class Main12049 {

    public static void main(String[] args) {
        FastReader ls = new FastReader();
        int casos = ls.nextInt();
        int a = 0, b = 0;
        StringBuilder imprimir = new StringBuilder();
        for (int i = 0; i < casos; i++) {
            a = ls.nextInt();
            b = ls.nextInt();
            HashSet<Integer> conjuntoa = new HashSet<>();
            HashMap<Integer, Integer> mapaa = new HashMap<>();
            HashMap<Integer, Integer> mapab = new HashMap<>();
            HashSet<Integer> conjuntob = new HashSet<>();
            for (int j = 0; j < a; j++) {
                int dato = ls.nextInt();
                if (conjuntoa.add(dato) == false) {
                    if (mapaa.containsKey(dato)) {
                        int cnt = mapaa.get(dato);
                        cnt++;
                        mapaa.put(dato, cnt);
                    } else {
                        mapaa.put(dato, 1);
                    }
                }

            }
            for (int j = 0; j < b; j++) {
                int dato = ls.nextInt();
                if (conjuntob.add(dato) == false) {
                    if (mapab.containsKey(dato)) {
                        int cnt = mapab.get(dato);
                        cnt++;
                        mapab.put(dato, cnt);
                    } else {
                        mapab.put(dato, 1);
                    }
                }
            }
            conjuntoa.retainAll(conjuntob);
            if (conjuntoa.isEmpty()) {
                imprimir.append(a + b).append("\n");
            } else {
                int repetidos = 0;
                for (Integer integer : conjuntoa) {
                    if (mapaa.containsKey(integer) && mapab.containsKey(integer)) {
                        repetidos += 2 * Math.min(mapaa.get(integer), mapab.get(integer));
                    }
                }
                imprimir.append((a - conjuntoa.size()) + (b - conjuntoa.size()) - repetidos).append("\n");
            }
        }
        imprimir.deleteCharAt(imprimir.length() - 1);
        System.out.println(imprimir);
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
