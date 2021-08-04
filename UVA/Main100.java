package Accepted;


import java.util.Scanner;

class Main100 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        while (leerDatos.hasNext()) {
            int i = leerDatos.nextInt();
            int j = leerDatos.nextInt();
            int valorarray = 0, inicio = 0, termino = 0;
            if (j > i) {
                valorarray = (j + 1) - i;
                inicio = i;
                termino = j;
            } else {
                valorarray = (i + 1) - j;
                inicio = j;
                termino = i;
            }
            int[] total = new int[valorarray];
            int contador = 0;
            for (int k = inicio; k <= termino; k++) {
                int cnt = 1;
                int aux = k;
                while (true) {
                    if (aux == 1) {
                        break;
                    }
                    if (aux % 2 != 0) {
                        aux = (3 * aux) + 1;
                    } else {
                        aux = aux / 2;
                    }
                    cnt++;
                }
                total[contador] = cnt;
                contador++;
            }
            int mayor = total[0];
            for (int k = 1; k < total.length; k++) {
                if (total[k] >= mayor) {
                    mayor = total[k];
                }
            }
            System.out.println(i + " " + j + " " + mayor);
        }
    }
}
