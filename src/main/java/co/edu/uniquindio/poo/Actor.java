package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Actor extends Persona {
    private int actuaciones;

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, int actuaciones) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.actuaciones = actuaciones;
    }

    public int getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(int actuaciones) {
        this.actuaciones = actuaciones;
    }
    
    public boolean esActor() {
        return actuaciones > 0;
    }
}
