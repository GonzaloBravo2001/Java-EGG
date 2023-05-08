package service;

import java.util.HashSet;
import java.util.Scanner;

public class PaisesService {
    Scanner input = new Scanner(System.in);

    public void crearPaises(){
        while(true){
            System.out.println("Ingrese el pais que desee...");
            String pais = input.nextLine();
            input.nextLine();
            HashSet<String> paises = new HashSet<>();
            paises.add(pais);
            
            System.out.println("¿Desea agregar otro pais? o salir?");
            String respuesta = input.nextLine().toLowerCase();
            if(respuesta.equals("salir")){
                break;
            }
        }
    }
}
