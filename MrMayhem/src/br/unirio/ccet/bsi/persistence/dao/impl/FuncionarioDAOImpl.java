/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao.impl;

import br.unirio.ccet.bsi.persistence.dao.FuncionarioDAO;
import br.unirio.ccet.bsi.persistence.entity.Funcionario;
import br.unirio.ccet.bsi.persistence.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author yuril
 */
public class FuncionarioDAOImpl implements FuncionarioDAO{

    @Override
    public List<Funcionario> findAll() {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Funcionario> query = em.createQuery("SELECT f FROM Funcionario f", Funcionario.class);
        List<Funcionario> result = query.getResultList();
        em.close();
        return result;
    }

    public void insert(Funcionario funcionario) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Funcionario funcionario) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Funcionario funcionario) {
        EntityManager em = ConnectionFactory.getConnection();
        em.getTransaction().begin();
        Object f = em.merge(funcionario);
        em.remove(f);
        em.getTransaction().commit();
        em.close();
    }

    public Funcionario findByCtps(String text) {
        EntityManager em = ConnectionFactory.getConnection();
        TypedQuery<Funcionario> query = em.createQuery("SELECT f FROM Funcionario f WHERE f.ctps = '"+text+"'", Funcionario.class);
        Funcionario result = query.getSingleResult();
        return result;
    }
    
}
