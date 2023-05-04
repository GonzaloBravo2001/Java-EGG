package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Alumnos;

public class AlumnoService {
    Scanner input = new Scanner(System.in);
    Alumnos aa = new Alumnos();

    public void crearAlumnos() {
        boolean condi = true;
        while (condi) {
            System.out.println("Ingrese el nombre del alumno.");
            aa.setNombre(input.nextLine());
            System.out.println("Ingrese la nota del alumno antes mencionado.");
            aa.setNotas(input.next());

            ArrayList<Alumnos> lista = new ArrayList<>();
            lista.add(notas, nombre);
            System.out.println("¿Desea seguir agregando alumnos?");
            String respuesta = input.nextLine();
            if (respuesta == "si") {

            } else {
                condi = false;
            }
        }
        
    }
}
