package entidades;

public class Alumnos {
    private String nombre;
    private Integer notas;

    public Alumnos(){

    }

    public Alumnos(String nombre, Integer notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer getNotas() {
        return notas;
    }
    public void setNotas(Integer notas) {
        this.notas = notas;
    }
}
