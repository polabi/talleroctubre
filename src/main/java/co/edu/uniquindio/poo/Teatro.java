package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Teatro {
    private List<Pelicula> peliculas;
    private List<Persona> personas;

    public Teatro(){
        this.peliculas = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public void removerPelicula(Pelicula pelicula){
        peliculas.remove(pelicula);
    }
    public List<Pelicula> obtenerPeliculas(){
        return peliculas;
    }
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    public void removerPersona(Persona persona){
        personas.remove(persona);
    }
    public List<Persona> obtenerPersonas(){
        return personas;
    }
}
