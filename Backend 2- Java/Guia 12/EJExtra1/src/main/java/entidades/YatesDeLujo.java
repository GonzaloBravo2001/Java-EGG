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
public class YatesDeLujo extends BarcoAMotor{
    private int numCamarotes;

    public YatesDeLujo() {
    }

    public YatesDeLujo(int numCamarotes, double potenciaCV, int matricula, double esloras, Date añoFabricacion) {
        super(potenciaCV, matricula, esloras, añoFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    
}
