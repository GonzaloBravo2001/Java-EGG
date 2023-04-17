package Principal;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        Persona persona1 = new Persona("Gonzalo", 22, "Masculino", 67.0, 1.75);
        Persona persona2 = new Persona("Santiago", 19, "Masculino", 68.0, 1.80);
        Persona persona3 = new Persona("Estela", 42, "Femenino", 85.0, 1.72);
        Persona persona4 = new Persona("Bautista", 5, "Masculino", 17.0, 1.13);

        servicio.persona = persona1;
        if (servicio.esMayorDeEdad()) {
            System.out.println(persona1.getnombre() + " es mayor de edad.");
        } else {
            System.out.println(persona1.getnombre() + " es menor de edad.");
        }
        servicio.calcularIMC();

        servicio.persona = persona2;
        if (servicio.esMayorDeEdad()) {
            System.out.println(persona2.getnombre() + " es mayor de edad.");
        } else {
            System.out.println(persona2.getnombre() + " es menor de edad.");
        }
        servicio.calcularIMC();

        servicio.persona = persona3;
        if (servicio.esMayorDeEdad()) {
            System.out.println(persona3.getnombre() + " es mayor de edad.");
        } else {
            System.out.println(persona3.getnombre() + " es menor de edad.");
        }
        servicio.calcularIMC();

        servicio.persona = persona4;
        if (servicio.esMayorDeEdad()) {
            System.out.println(persona4.getnombre() + " es mayor de edad.");
        } else {
            System.out.println(persona4.getnombre() + " es menor de edad.");
        }
        servicio.calcularIMC();
        calcularPorcentajes(10, 20);

    }

    public static void calcularPorcentajes(int num1, int num2) {
        // código para calcular los porcentajes
        double porcentaje1 = num1 * 0.10;
        double porcentaje2 = num2 * 0.20;

        // imprimir resultados
        System.out.println("El 10% de " + num1 + " es: " + porcentaje1);
        System.out.println("El 20% de " + num2 + " es: " + porcentaje2);
    }
}
