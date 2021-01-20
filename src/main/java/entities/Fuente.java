package entities;

public class Fuente {
    private String nombre;
    private String URL;

    public Fuente(String nombre, String URL) {
        this.nombre = nombre;
        this.URL = URL;
    }

    public String getNombre() {
        return nombre;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public String toString() {
        return "Fuentes{" +
                "nombre='" + nombre + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}