package controller.fuentes;

import entities.Fuente;
import entities.Noticia;

import java.util.List;

public interface DAOFuentes {
    public List<Fuente> getFuentes();
    public void inserta(Fuente fuente);
    public List<Noticia> busca(String nombre);
}
