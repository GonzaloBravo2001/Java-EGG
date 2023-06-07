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
public class BarcoAMotor extends Barco{
    private double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(double potenciaCV, int matricula, double esloras, Date añoFabricacion) {
        super(matricula, esloras, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
}
