/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Produto;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface ProdutoDAO {
    
    List<Produto> findAll();
    void insert(Produto produto);
    void update(Produto produto);
    void delete(Produto produto);
    Produto findByCod(String text);
    
}
