package service;

import java.util.Scanner;
import java.util.TreeSet;

public class PaisesService {
    Scanner input = new Scanner(System.in);

    public void crearPaises(){
        while(true){
            System.out.println("Ingrese el pais que desee...");
            String pais = input.nextLine();
            input.nextLine();
            TreeSet<String> paises = new TreeSet<>();
            paises.add(pais);
            
            System.out.println("¿Desea agregar otro pais? o salir?");
            String respuesta = input.nextLine().toLowerCase();
            if(respuesta.equals("salir")){
                break;
            }
        }
    }
}
