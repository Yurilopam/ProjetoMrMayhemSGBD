/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Cliente;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface ClienteDAO {
    
    List<Cliente> findAll();
    void insert(Cliente cliente);
    void update(Cliente cliente);
    void delete(Cliente cliente);
    Cliente findByCpf(String text);
    
}
