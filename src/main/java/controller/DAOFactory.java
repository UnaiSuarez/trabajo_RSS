package controller;

import controller.fuentes.DAOFuentes;
import controller.fuentes.DAOFuentesXML;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private controller.fuentes.DAOFuentes DAOFuentes;
    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOFuentes getDAOFuentes(){
        if(DAOFuentes == null){
            DAOFuentes = new DAOFuentesXML();
        }
        return DAOFuentes;
    }

}
