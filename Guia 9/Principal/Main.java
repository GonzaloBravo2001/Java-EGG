package Principal;

import Servicios.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        CadenaServicio mostrar = new CadenaServicio();

        mostrar.pedirFrase();
        mostrar.mostrarVocales();
        System.out.println("La palabra invertida es: " + mostrar.invertirFrase());
    }
}
