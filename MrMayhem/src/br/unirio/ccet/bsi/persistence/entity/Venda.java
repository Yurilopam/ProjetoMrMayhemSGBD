/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.persistence.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author yuril
 */
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_venda_seq")
    @SequenceGenerator(name = "id_venda_seq", sequenceName = "venda_seq", allocationSize = 1)
    @Column(name = "id_venda", nullable = false)
    private Long idVenda;
    
    @Column(name = "cod_venda", nullable = false)
    private String codigoVenda;
    
    @Column(name = "obs_venda", nullable = true)
    private String observacoes;
    
    @Column(name = "preco_total_venda", nullable = false)
    private String precoTotal;
    
    @Column(name = "forma_pag_venda", nullable = false)
    private String formaPagamento;
    
    @Column(name = "vendedor_venda", nullable = false)
    private String vendedor;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
   
    @Column(name = "data_venda", nullable = false)
    private Date dataVenda;
    
    @Column(name = "data_entrega_venda", nullable = true)
    private Date dataEntrega;

    /**
     * @return the codigoVenda
     */
    public String getCodigoVenda() {
        return codigoVenda;
    }

    /**
     * @param codigoVenda the codigoVenda to set
     */
    public void setCodigoVenda(String codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the precoTotal
     */
    public String getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the dataEntrega
     */
    public Date getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the idVenda
     */
    public Long getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }
    
}
