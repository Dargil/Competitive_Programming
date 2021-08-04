/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosProgramacion;

/**
 *
 * @author JEFFERSON
 */
public class ClaseString {

    public static void main(String[] args) {
        //formas de declarar un String
        System.out.println("El primer programa");
        String str = new String("El primer programa");
        String str2 = "El primer programa";
        String str3 = "";
        String str4 = new String();
        String str5;

        //número de caracteres que guarda un string
        String str6 = "El primer programa";
        int longitud = str6.length();

        //Podemos conocer si un string comienza con un determinado prefijo, llamando al método startsWith, que devuelve true o false, según que el string comience o no por dicho prefijo
        String str7 = "El primer programa";
        boolean resultado = str7.startsWith("El");

        //podemos saber si un string finaliza con un conjunto dado de caracteres, mediante la función miembro endsWith.
        String str8 = "El primer programa";
        boolean resultado8 = str8.endsWith("programa");

        //Si se quiere obtener la posición de la primera ocurrencia de la letra p, se usa la función indexOf.
        String str9 = "El primer programa";
        int pos = str9.indexOf('p');

        //Para obtener las sucesivas posiciones de la letra p, se llama a otra versión de la misma función
        pos = str9.indexOf('p', pos + 1);

        //Otra versión de indexOf busca la primera ocurrencia de un substring dentro del string.
        String str10 = "El primer programa";
        pos = str10.indexOf("pro");

        //Comparación de strings
        String str11 = "El lenguaje Java";
        String str12 = new String("El lenguaje Java");
        if (str11 == str12) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }
        if (str11.equals(str12)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }

        //Los objetos str1 y str2 guardan la misma referencia al objeto de la clase String creado. La expresión (str1==str2) devolverá true.
        String str13 = "El lenguaje Java";
        String str14 = str13;
        System.out.print("Son el mimso objeto " + (str13 == str14));

        //Asñi pues, el método equals compara un string con un objeto cualquiera que puede ser otro string,  y devuelve true cuando dos strings son iguales o false si son distintos.
        //La variable resultado tomará el valor true.
        String str15 = "El lenguaje Java";
        boolean resultado15 = str15.equals("El lenguaje Java");
        System.out.println(resultado15);

        //La función miembro comapareTo devuelve un entero menor que cero si el objeto string es menor (en orden alfabético) que el string dado, cero si son iguales, y mayor que cero si el objeto string es mayor que el string dado.
        String str16 = "Tomás";
        int resultado16 = str16.compareTo("Alberto");

        //Extraer un substring de un string
        //Se obtendrá el substring "Java".
        String str17 = "El lenguaje Java";
        String subStr = str17.substring(12);

        // Una segunda versión de la función miembro substring, nos permite extraer un substring especificando la posición de comienzo y la el final.
        //Se obtendrá el substring "lenguaje"
        String str18 = "El lenguaje Java";
        String subStr18 = str18.substring(3, 11);

        String str19 = "  12 ";
        int numero = Integer.parseInt(str19.trim());

        String str20 = "12.35 ";
        double numero20 = Double.valueOf(str20).doubleValue();

        StringBuilder sb = new StringBuilder();
        sb.append("hola"); //equivale a:
        sb.insert(sb.length(), "hola");

        String a = "la vida es bella";
        String[] palabras = a.split(" ");
        StringBuffer mensaje = new StringBuffer();
        for (int i = 0; i < palabras.length; i++) {
            mensaje.append("  ");
            mensaje.append(palabras[i]);
        }

    }
}
