package Principal;

import Servicio.ArregloService;

public class Main {
    public static void main(String[] args) {
        ArregloService mostrar = new ArregloService();

        double[] A = new double[50];
        double [] B = new double[20];

        mostrar.inicializarA(A);
        mostrar.mostrar(A);
        mostrar.ordenar(A);

    }
}
