/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author GonzaletoKun
 */
public class Veleros extends Barco{
    private int numMastiles;

    public Veleros() {
    }

    public Veleros(int numMastiles, int matricula, double esloras, Date añoFabricacion) {
        super(matricula, esloras, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    
}
