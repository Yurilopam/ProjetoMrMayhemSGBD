/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.controller;

import br.unirio.ccet.bsi.persistence.dao.ProdutoDAO;
import br.unirio.ccet.bsi.persistence.dao.impl.ProdutoDAOImpl;
import br.unirio.ccet.bsi.persistence.entity.Produto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class Estoque {

    public Estoque() {
    }
    /**
     * Calcula a quantidade do produto a ser reduzida no estoque
     * @param quantidadeAReduzir Parametro correspondente a quanto deve reduzir no estoque
     * @param quantidadeAntiga Parametro correspondente ao quanto tem no estoque
     * @return O restante da quantidade do produto em String
     */
    public String reduzirQuantidade(String quantidadeAReduzir, String quantidadeAntiga) {
        int numQuantidadeAReduzir = Integer.parseInt(quantidadeAReduzir);
        int numQuantidadeAntiga = Integer.parseInt(quantidadeAntiga);
        int quantidadeRestante = numQuantidadeAntiga - numQuantidadeAReduzir;
        String quantidadeRestateString = String.valueOf(quantidadeRestante);      
        return quantidadeRestateString;
    }
    
    /**
     * Faz a redução da quantidade em estoque dos produtos na lista de venda
     * @param jTable1 Parametro correspondente a tabela da lista de venda
     */
    public void controleDaQuantidadeDoProduto(JTable jTable1) {
        Produto produtoAtualizado = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAOImpl();
        List<Produto> produtos = produtoDAO.findAll();
        for (Produto produto : produtos) {
            String codigoDoProduto;
            String quantidadeDoProdutoNaLista;
            DefaultTableModel dtmListaProdutos = (DefaultTableModel) jTable1.getModel();
            int totalDeLinhas = dtmListaProdutos.getRowCount();
            for (int i = 0; i < totalDeLinhas; i++) {
                codigoDoProduto = dtmListaProdutos.getValueAt(i, 0).toString();
                quantidadeDoProdutoNaLista = dtmListaProdutos.getValueAt(i, 2).toString();
                if (produto.getCodigo().equals(codigoDoProduto)){
                    produtoAtualizado.setCodigo(produto.getCodigo());
                    produtoAtualizado.setDataCadastramento(produto.getDataCadastramento());
                    produtoAtualizado.setDescricao(produto.getDescricao());
                    produtoAtualizado.setNomeProduto(produto.getNomeProduto());
                    produtoAtualizado.setQuantidade(reduzirQuantidade(quantidadeDoProdutoNaLista, produto.getQuantidade()));
                    produtoAtualizado.setTipoProduto(produto.getTipoProduto());
                    produtoAtualizado.setValor(produto.getValor());
                    produtoDAO.insert(produtoAtualizado);
                }
            }       
        }
    }
    
}
