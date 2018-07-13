package com.master.pro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProEntityManagerFactory {
    public static EntityManager getEntityManager(String serviceName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(serviceName);
        return emf.createEntityManager();
    }
}
