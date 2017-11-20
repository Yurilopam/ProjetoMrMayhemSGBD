package br.unirio.ccet.bsi.persistence.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
    private static EntityManagerFactory factory;

    static {
            factory = Persistence.createEntityManagerFactory("MrMayhemManager");
    }

    public static EntityManager getConnection() {
            EntityManager entityManager = factory.createEntityManager();
            return entityManager;
    }

    public static void main(String[] args) {
        getConnection();
        System.exit(0);
    }  
}
