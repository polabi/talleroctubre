package co.edu.uniquindio.poo;

public class Trailer {
    private String nombre;
    private Persona editor;
    private Pelicula pelicula;

    public Trailer(Pelicula pelicula, String nombre){
        if (pelicula == null) {
            throw new IllegalArgumentException("El trailer debe estar asociado a una película existente.");
        }
        this.pelicula = pelicula;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona getEditor() {
        return editor;
    }
    public void setEditor(Persona editor) {
        this.editor = editor;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
}
