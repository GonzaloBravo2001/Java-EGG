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
public class Barco {
    private int matricula;
    private double esloras;
    private Date añoFabricacion;

    public Barco() {
    }

    public Barco(int matricula, double esloras, Date añoFabricacion) {
        this.matricula = matricula;
        this.esloras = esloras;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEsloras() {
        return esloras;
    }

    public void setEsloras(double esloras) {
        this.esloras = esloras;
    }

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
}
