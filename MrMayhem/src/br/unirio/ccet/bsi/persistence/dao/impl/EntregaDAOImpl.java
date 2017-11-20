/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.EntregaDAO;
import br.unirio.ccet.bsi.persistence.entity.Entrega;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class EntregaDAOImpl implements EntregaDAO{

    public List<Entrega> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Entrega> query = em.createQuery("SELECT c FROM Entrega c", Entrega.class);
        List<Entrega> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Entrega entrega) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(entrega);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Entrega entrega) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(entrega);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Entrega entrega) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(entrega);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }
    
    public Entrega findById(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Entrega> query = em.createQuery("SELECT c FROM Entrega c WHERE c.codigoPedido = '"+text+"'", Entrega.class);
        Entrega result = query.getSingleResult();
        return result;
    }
    
}
