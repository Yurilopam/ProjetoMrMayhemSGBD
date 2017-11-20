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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author yuril
 */
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_cliente_seq")
    @SequenceGenerator(name = "id_cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;
    
    @Column(name = "nome_cliente", nullable = false)
    private String nome;
    
    @Column(name = "data_nasc_cliente", nullable = true)
    private Date dataNascimento;
    
    @Column(name = "nacionalidade_cliente", nullable = true)
    private String nacionalidade;
    
    @Column(name = "email_cliente", nullable = true)
    private String email;
    
    @Column(name = "cpf_cliente", nullable = false)
    private String cpf;
    
    @Column(name = "rg_cliente", nullable = false)
    private String rg;
    
    @Column(name = "est_civil_cliente", nullable = true)
    private String estadoCivil;
    
    @Column(name = "tel_cliente", nullable = true)
    private String telefone;
    
    @Column(name = "rua_cliente", nullable = true)
    private String rua;
    
    @Column(name = "numero_rua_cliente", nullable = true)
    private String numeroRua;
    
    @Column(name = "bairro_cliente", nullable = true)
    private String bairro;
    
    @Column(name = "cep_cliente", nullable = true)
    private String cep;
    
    @Column(name = "data_cad_cliente", nullable = false)
    private Date dataCadastramento;
    
    @Column(name = "receb_not_cliente", nullable = false)
    private Boolean receberNotificacoes;
    
    @Column(name = "info_adi_cliente", nullable = true)
    private String infoAdicional;

    /**
     * @return the idCliente
     */
    public Long getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numeroRua
     */
    public String getNumeroRua() {
        return numeroRua;
    }

    /**
     * @param numeroRua the numeroRua to set
     */
    public void setNumeroRua(String numeroRua) {
        this.numeroRua = numeroRua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the dataCadastramento
     */
    public Date getDataCadastramento() {
        return dataCadastramento;
    }

    /**
     * @param dataCadastramento the dataCadastramento to set
     */
    public void setDataCadastramento(Date dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    /**
     * @return the receberNotificacoes
     */
    public Boolean getReceberNotificacoes() {
        return receberNotificacoes;
    }

    /**
     * @param receberNotificacoes the receberNotificacoes to set
     */
    public void setReceberNotificacoes(Boolean receberNotificacoes) {
        this.receberNotificacoes = receberNotificacoes;
    }

    /**
     * @return the infoAdicional
     */
    public String getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * @param infoAdicional the infoAdicional to set
     */
    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
    
}
