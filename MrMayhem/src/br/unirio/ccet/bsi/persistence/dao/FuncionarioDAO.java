/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.dao;

import br.unirio.ccet.bsi.persistence.entity.Funcionario;
import java.util.List;

/**
 *
 * @author yuril
 */
public interface FuncionarioDAO {
    
    List<Funcionario> findAll();
    void insert(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Funcionario funcionario);
    Funcionario findByCtps(String text);
    
}
