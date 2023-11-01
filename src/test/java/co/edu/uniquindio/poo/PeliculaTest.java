package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PeliculaTest {
    @Test
    public void actoresDrama(){
        Pelicula pelicula1 = new Pelicula("Película 1", "Sinopsis 1", 2022, TipoGenero.DRAMA, "Colombia", null, null);
        Pelicula pelicula2 = new Pelicula("Película 2", "Sinopsis 2", 2023, TipoGenero.COMEDIA, "España", null, null);

        Director director = new Director("Juan", "coso", LocalDate.of(1980, 1, 1), "español");
        Guionista guionista = new Guionista("nicolas", "castro", LocalDate.of(1985, 5, 10), "uruguayo");

        Pelicula pelicula = new Pelicula("Rapido y Furioso", "Sinopsis 3", 2022, TipoGenero.DRAMA, "País de la Película", director, guionista);
        Trailer trailer = new Trailer(pelicula, "Rapido Y Furioso");
        Actor actor1 = new Actor("Andres", "Polania", LocalDate.of(1980, 1, 1), "Colombiano", 3);
        Actor actor2 = new Actor("David", "Hurtado", LocalDate.of(1990, 2, 2), "paraguayo", 1);

        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);
        pelicula2.agregarActor(actor2);
        pelicula.agregarTrailer(trailer);

        List<Pelicula> peliculas = Arrays.asList(pelicula1, pelicula2);
        List<Actor> actores = Arrays.asList(actor1, actor2);

        Collection<Actor> actoresEnDrama = pelicula1.actoresDrama(peliculas, actores);

        assertEquals(2, actoresEnDrama.size()); // Verifica que se obtuvieron 2 actores
        assertTrue(actoresEnDrama.contains(actor1)); // Verifica que actor1 está en la lista
        assertTrue(actoresEnDrama.contains(actor2)); // Verifica que actor2 está en la lista
    }
    @Test
    public void actoresDrama_SinActores() {
        Director director = new Director("eduardo", "Sabogal", LocalDate.of(1980, 1, 1), "Estado Unidese");
        Guionista guionista = new Guionista("Alfonso", "Camargo", LocalDate.of(1985, 5, 10), "Frances");
        Pelicula pelicula = new Pelicula("Sin Actores", "Sinopsis", 2015, TipoGenero.DRAMA, "Australia", director, guionista);

        List<Pelicula> peliculas = Arrays.asList(pelicula);
        List<Actor> actores = new ArrayList<>();

        Collection<Actor> actoresEnDrama = pelicula.actoresDrama(peliculas, actores);

        assertEquals(0, actoresEnDrama.size()); // Verifica que la lista de actores en drama esté vacía
    }
  
}

