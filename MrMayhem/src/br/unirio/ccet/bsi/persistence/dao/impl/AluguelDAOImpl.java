/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.AluguelDAO;
import br.unirio.ccet.bsi.persistence.entity.Aluguel;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class AluguelDAOImpl implements AluguelDAO{

    
    public List<Aluguel> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Aluguel> query = em.createQuery("SELECT c FROM Aluguel c", Aluguel.class);
        List<Aluguel> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Aluguel aluguel) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(aluguel);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Aluguel aluguel) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(aluguel);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Aluguel aluguel) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(aluguel);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }

    public Aluguel findById(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Aluguel> query = em.createQuery("SELECT c FROM Aluguel c WHERE c.codigoAluguel = '"+text+"'", Aluguel.class);
        Aluguel result = query.getSingleResult();
        return result;
    }
    
}
