package controller.noticias;

import entities.Fuente;
import entities.Noticia;

import java.util.List;

public interface DAONoticias {

    public List<Noticia> getNoticias(Fuente fuente);

}
