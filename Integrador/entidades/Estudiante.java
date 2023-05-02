package entidades;

public class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(){

    }

    public Estudiante(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNota(int nota){
        this.nota = nota;
    }

    public String getNombre(){
        return nombre;
    }
    public int getNota(){
        return nota;
    }
}
