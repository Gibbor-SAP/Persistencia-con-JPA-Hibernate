package com.latam.alura.tienda.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//Delegando la responsabilidad de instanciar el EntityManager a una clase utilitaria cuya única función será instanciarlo.
public class JPAUtils {

    private static EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("tienda");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
