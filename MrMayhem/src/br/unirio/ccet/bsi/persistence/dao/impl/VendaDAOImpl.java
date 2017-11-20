/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.VendaDAO;
import br.unirio.ccet.bsi.persistence.entity.Venda;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class VendaDAOImpl implements VendaDAO{

    public List<Venda> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Venda> query = em.createQuery("SELECT c FROM Venda c", Venda.class);
        List<Venda> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Venda venda) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Venda venda) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(venda);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Venda venda) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(venda);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }

    public Venda findById(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Venda> query = em.createQuery("SELECT c FROM Venda c WHERE c.codigoVenda = '"+text+"'", Venda.class);
        Venda result = query.getSingleResult();
        return result;
    }
    
}
