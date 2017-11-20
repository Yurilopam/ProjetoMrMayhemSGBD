/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.ClienteDAO;
import br.unirio.ccet.bsi.persistence.entity.Cliente;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class ClienteDAOImpl implements ClienteDAO{

    @Override
    public List<Cliente> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
        List<Cliente> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Cliente cliente) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Cliente cliente) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Cliente cliente) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(cliente);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }

    public Cliente findByCpf(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.cpf = '"+text+"'", Cliente.class);
        Cliente result = query.getSingleResult();
        return result;
    }
    
}
