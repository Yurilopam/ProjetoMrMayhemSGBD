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
public class Entrega {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_entrega_seq")
    @SequenceGenerator(name = "id_entrega_seq", sequenceName = "entrega_seq", allocationSize = 1)
    @Column(name = "id_entrega", nullable = false)
    private Long idEntrega;
    
    @Column(name = "tipo_transacao", nullable = false)
    private String tipoTransacao;
    
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @Column(name = "obs_entrega", nullable = true)
    private String observacoes;
    
    @Column(name = "status_entrega")
    private String status;
    
    @Column(name = "cod_pedido", nullable = false)
    private String codigoPedido;
    
    @Column(name = "data_pedido")
    private Date dataPedido;
    
    @Column(name = "data_entrega")
    private Date dataEntrega;

    /**
     * @return the idEntrega
     */
    public Long getIdEntrega() {
        return idEntrega;
    }

    /**
     * @param idEntrega the idEntrega to set
     */
    public void setIdEntrega(Long idEntrega) {
        this.idEntrega = idEntrega;
    }

    /**
     * @return the tipoTransacao
     */
    public String getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * @param tipoTransacao the tipoTransacao to set
     */
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the codigoPedido
     */
    public String getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * @param codigoPedido the codigoPedido to set
     */
    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    /**
     * @return the dataPedido
     */
    public Date getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
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
    
    
}
