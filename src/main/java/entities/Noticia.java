package entities;

public class Noticia {

    private String titulo, descripcion, enlace;

    public Noticia(String titulo, String descripcion, String enlace) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEnlace() {
        return enlace;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", enlace='" + enlace + '\'' +
                '}';
    }
}
