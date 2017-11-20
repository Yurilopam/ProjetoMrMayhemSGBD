/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Entrega;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface EntregaDAO {
    
    List<Entrega> findAll();
    void insert(Entrega entrega);
    void update(Entrega entrega);
    void delete(Entrega entrega);
    Entrega findById(String text);
    
}
