/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Venda;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface VendaDAO {
    
    List<Venda> findAll();
    void insert(Venda venda);
    void update(Venda venda);
    void delete(Venda venda);
    Venda findById(String text);
    
}
