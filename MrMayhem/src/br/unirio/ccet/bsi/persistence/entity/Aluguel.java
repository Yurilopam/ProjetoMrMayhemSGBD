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
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_aluguel_seq")
    @SequenceGenerator(name = "id_aluguel_seq", sequenceName = "aluguel_seq", allocationSize = 1)
    @Column(name = "id_aluguel", nullable = false)
    private Long idAluguel;
    
    @Column(name = "cod_aluguel", nullable = false)
    private String codigoAluguel;
    
    @Column(name = "obs_aluguel", nullable = true)
    private String observacoes;
    
    @Column(name = "preco_total_aluguel", nullable = false)
    private String precoTotal;
    
    @Column(name = "forma_pag_aluguel", nullable = false)
    private String formaPagamento;
    
    @Column(name = "data_dev_aluguel", nullable = false)
    private Date dataDevolucao;
    
    @Column(name = "sit_aluguel", nullable = false)
    private String situacao;

    @Column(name = "vendedor_aluguel", nullable = false)
    private String vendedor;
    
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
   
    @Column(name = "data_aluguel", nullable = false)
    private Date dataAluguel;
    
    @Column(name = "data_entrega_aluguel", nullable = true)
    private Date dataEntrega;
    
    /**
     * @return the idAluguel
     */
    public Long getIdAluguel() {
        return idAluguel;
    }

    /**
     * @param idAluguel the idAluguel to set
     */
    public void setIdAluguel(Long idAluguel) {
        this.idAluguel = idAluguel;
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
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
     * @return the dataAluguel
     */
    public Date getDataAluguel() {
        return dataAluguel;
    }

    /**
     * @param dataAluguel the dataAluguel to set
     */
    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
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
     * @return the codigoAluguel
     */
    public String getCodigoAluguel() {
        return codigoAluguel;
    }

    /**
     * @param codigoAluguel the codigoAluguel to set
     */
    public void setCodigoAluguel(String codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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
    
}
