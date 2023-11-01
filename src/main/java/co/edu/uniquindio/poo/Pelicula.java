package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private int año;
    private TipoGenero tipoGenero;
    private String pais;
    private Director director;
    private Guionista guionista;
    private List<Trailer> trailers;
    private Collection<Actor> actores;
    
    public Pelicula(String titulo, String sinopsis, int año, TipoGenero tipoGenero, String pais, Director director, Guionista guionista) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.año = año;
        this.tipoGenero = tipoGenero;
        this.pais = pais;
        this.director = director;
        this.guionista = guionista;
        this.trailers = new ArrayList<>();
        this.actores = new LinkedList<>();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(TipoGenero tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    
    }
    public Guionista getGuionista() {
        return guionista;
    }

    public void setGuionista(Guionista guionista) {
        this.guionista = guionista;
    }

    public Collection<Actor> getActores() {
        return Collections.unmodifiableCollection(actores);
    }

    public void agregarActor(Actor actor){
        actores.add(actor);
    }

    public void agregarTrailer(Trailer trailer) {
        trailers.add(trailer);
    }

    public List<Trailer> getTrailers() {
        return Collections.unmodifiableList(trailers);
    }

    public void validarParticipacion(Actor actor ){
        assert actor.getActuaciones() > 0 : "El actor debe tener al menos una actuación en la película.";
    }

    public Collection<Actor> actoresDrama(Collection<Pelicula> películas, Collection<Actor> actores) {
        List<Pelicula> películasDrama = películas.stream()
                .filter(p -> p.getTipoGenero() == TipoGenero.DRAMA)
                .collect(Collectors.toList());

        return actores.stream()
                .filter(actor -> películasDrama.stream().anyMatch(p -> p.getActores().contains(actor)))
                .collect(Collectors.toList());
    }

    

}
