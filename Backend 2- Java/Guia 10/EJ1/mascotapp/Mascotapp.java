package mascotapp;

import java.util.Scanner;

import servicios.MascotaService;

//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
public class Mascotapp {
    public static void main(String[] args) {
        MascotaService mascota = new MascotaService();
        Scanner input = new Scanner(System.in);

        while (true) {
            mascota.crearPerro();
            System.out.println("¿Quiere agregar otro perro?-(Ponga salir si quiere salir del bucle)");
            String respuesta = input.nextLine().toLowerCase();
            if (respuesta.equals("salir")) {
                break;
            }
        }
        mascota.mostrarPerros();
        input.close();
    }
}
