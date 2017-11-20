/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.ProdutoDAO;
import br.unirio.ccet.bsi.persistence.entity.Produto;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class ProdutoDAOImpl implements ProdutoDAO {

    public List<Produto> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Produto> query = em.createQuery("SELECT c FROM Produto c", Produto.class);
        List<Produto> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Produto produto) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Produto produto) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Produto produto) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(produto);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }

    public Produto findByCod(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Produto> query = em.createQuery("SELECT c FROM Produto c WHERE c.cpf = '"+text+"'", Produto.class);
        Produto result = query.getSingleResult();
        return result;
    }
    
}
