package trabajopractico7;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private int legajo;
    private String apellido, nombre;
    private Set<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m) {

        if (!materias.contains(m)) {
            materias.add(m);
            System.out.println("Se agregó " + m.getNombre() + " a las materias de " + apellido);
        } else {
            System.out.println("No se agregó " + m.getNombre() + " a " + apellido + " porque ya la cursa");
        }
    }

    public int cantidadMaterias() {
        return materias.size();
    }
}