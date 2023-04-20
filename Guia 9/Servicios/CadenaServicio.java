package Servicios;

import java.util.Scanner;

import Entidades.Cadena;

public class CadenaServicio {
    Cadena ff = new Cadena();

    public void pedirFrase() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la frase.");
        ff.setFrase(input.nextLine());

        ff.setLongitud(ff.getFrase().length());

        System.out.println(ff.getLongitud());

        input.close();
    }

    public void mostrarVocales() {
        int vocal = 0;
        String frase = ff.getFrase().toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char vocales = frase.charAt(i);
            switch (vocales){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vocal++;
                break;
            }
        }
        System.out.println("La cantidad de vocales que tiene es: " + vocal);
    }

    public String invertirFrase() {
        String frase = ff.getFrase();
        char[] caracteres = frase.toCharArray();
        int longitud = caracteres.length;

        for (int i = 0; i < longitud /2; i++){
            char temporal = caracteres[i];
            caracteres[i] = caracteres[longitud -i -1];
            caracteres[longitud -i -1] = temporal;
        }
       return new String(caracteres);
    }
}
