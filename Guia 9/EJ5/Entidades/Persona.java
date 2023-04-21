package Entidades;

import java.util.Date;

public class Persona {
    Date nombre = new Date();
    Date fechaDeNacimiento = new Date();

    public Persona(){

    }

    public Persona(Date nombre, Date fechaDeNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNombre(Date nombre){
        this.nombre = nombre;
    }
    public Date setFechaDeNacimiento(Date fechaDeNacimiento){
        return this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Date getNombre(){
        return nombre;
    }
    public Date getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
}
