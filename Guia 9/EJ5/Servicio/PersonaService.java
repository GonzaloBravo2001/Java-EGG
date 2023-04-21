package Servicio;

import java.util.Date;
import java.util.Scanner;

import Entidades.Persona;

public class PersonaService {
    Persona pp = new Persona();
    
    public Date crearPersona(){
        Scanner input = new Scanner(System.in);

        System.out.println("¿Podria decirme su nombre?");
        
        System.out.println("Ingrese la fecha de su nacimiento.");
        input.close();
    }
}
