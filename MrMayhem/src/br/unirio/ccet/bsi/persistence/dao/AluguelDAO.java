/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Aluguel;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface AluguelDAO {
    
    List<Aluguel> findAll();
    void insert(Aluguel aluguel);
    void update(Aluguel aluguel);
    void delete(Aluguel aluguel);
    Aluguel findById(String text);
    
}
