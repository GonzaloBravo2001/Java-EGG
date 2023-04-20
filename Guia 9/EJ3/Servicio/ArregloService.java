package Servicio;

import java.util.Arrays;

public class ArregloService {
    public double[] inicializarA(double[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (double) (Math.random() * 10);
        }
        return A;
    }

    public void mostrar(double[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void ordenar(double[] A) {
        Arrays.sort(A);
    }

    public double[] inicializarB(double[] B, double[] A){
        for(int i = 0; i < 10; i++){
            B[i] = A[];
        }
        return B;
    }
}
