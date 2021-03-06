/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.alugueis;

import br.unirio.ccet.bsi.persistence.dao.AluguelDAO;
import br.unirio.ccet.bsi.persistence.dao.ClienteDAO;
import br.unirio.ccet.bsi.persistence.dao.impl.AluguelDAOImpl;
import br.unirio.ccet.bsi.persistence.dao.impl.ClienteDAOImpl;
import br.unirio.ccet.bsi.persistence.entity.Aluguel;
import br.unirio.ccet.bsi.persistence.entity.Cliente;
import br.unirio.ccet.bsi.utils.Enums;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Yuri Lopam
 */
public class TelaAtualizarAluguel extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaAtualizarAluguel() {
        initComponents();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoNumeroPedido = new javax.swing.JFormattedTextField();
        campoDataPedido = new javax.swing.JFormattedTextField();
        campoDataEntrega = new javax.swing.JFormattedTextField();
        campoDataDevolucao = new javax.swing.JFormattedTextField();
        campoEstatusAluguel = new javax.swing.JComboBox<>();
        botaoProcurarAluguel = new java.awt.Button();
        botaoLimparBusca = new java.awt.Button();
        botaoAtualizarEstatusDoAluguel = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        campoCpfCliente = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        try {
            campoNumeroPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoDataPedido.setEditable(false);
        try {
            campoDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoDataEntrega.setEditable(false);
        try {
            campoDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoDataDevolucao.setEditable(false);
        try {
            campoDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoEstatusAluguel.setModel(new DefaultComboBoxModel(Enums.SituacoesDoAluguel.values()));
        campoEstatusAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstatusAluguelActionPerformed(evt);
            }
        });

        botaoProcurarAluguel.setLabel("Procurar aluguel");
        botaoProcurarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarAluguelActionPerformed(evt);
            }
        });

        botaoLimparBusca.setLabel("Limpar busca");
        botaoLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparBuscaActionPerformed(evt);
            }
        });

        botaoAtualizarEstatusDoAluguel.setEnabled(false);
        botaoAtualizarEstatusDoAluguel.setLabel("Atualizar estatus do aluguel");
        botaoAtualizarEstatusDoAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarEstatusDoAluguelActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastrar Aluguel");

        jLabel2.setText("Código do Pedido:");

        jLabel6.setText("Data do Pedido:");

        jLabel7.setText("Data da Entrega:");

        jLabel9.setText("Data da Devolução:");

        jLabel3.setText("CPF do cliente:");

        jLabel5.setText("Estatus do aluguel:");

        jLabel12.setText("Observações:");

        campoObservacoes.setEditable(false);
        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane1.setViewportView(campoObservacoes);

        campoCpfCliente.setEditable(false);
        try {
            campoCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoProcurarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(botaoLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEstatusAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(botaoAtualizarEstatusDoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoLimparBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoProcurarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campoDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(campoEstatusAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAtualizarEstatusDoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAtualizarEstatusDoAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarEstatusDoAluguelActionPerformed
        AluguelDAO aluguelDAO = new AluguelDAOImpl();
        
        Aluguel aluguelAtualizado = new Aluguel();
        
        aluguelAtualizado.setCodigoAluguel(campoNumeroPedido.getText());
        try {
            aluguelAtualizado.setDataAluguel(converterStringToDate(campoDataPedido.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaAtualizarAluguel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            aluguelAtualizado.setDataEntrega(converterStringToDate(campoDataEntrega.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaAtualizarAluguel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            aluguelAtualizado.setDataDevolucao(converterStringToDate(campoDataDevolucao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaAtualizarAluguel.class.getName()).log(Level.SEVERE, null, ex);
        }
        aluguelAtualizado.setSituacao(((Enums.SituacoesDoAluguel) campoEstatusAluguel.getSelectedItem()).toString());
        aluguelAtualizado.setObservacoes(campoObservacoes.getText());
        
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente cliente = clienteDAO.findByCpf(campoCpfCliente.getText());
        aluguelAtualizado.setCliente(cliente);
        
        aluguelDAO.update(aluguelAtualizado);
        JOptionPane.showMessageDialog(TelaAtualizarAluguel.this, "Aluguel atualizado com sucesso!");
        resetarCampos();                       
    }//GEN-LAST:event_botaoAtualizarEstatusDoAluguelActionPerformed

    private void botaoProcurarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarAluguelActionPerformed
        AluguelDAO aluguelDAO = new AluguelDAOImpl();
        List<Aluguel> alugueis = aluguelDAO.findAll();
        for (Aluguel aluguel : alugueis){
            if (aluguel.getCodigoAluguel().equals(campoNumeroPedido.getText())){
                campoCpfCliente.setText(aluguel.getCliente().getCpf());
                campoDataPedido.setText(new SimpleDateFormat("dd/MM/yyyy").format(aluguel.getDataAluguel()));
                campoDataEntrega.setText(new SimpleDateFormat("dd/MM/yyyy").format(aluguel.getDataEntrega()));
                campoDataDevolucao.setText(new SimpleDateFormat("dd/MM/yyyy").format(aluguel.getDataDevolucao()));
                campoEstatusAluguel.setSelectedIndex(recuperarEstatusAluguel(aluguel));
                campoObservacoes.setText(aluguel.getObservacoes());
                campoNumeroPedido.setEnabled(false);
                campoObservacoes.setEditable(true);
                botaoAtualizarEstatusDoAluguel.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botaoProcurarAluguelActionPerformed

    private void botaoLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBuscaActionPerformed
        limparPesquisa();
    }//GEN-LAST:event_botaoLimparBuscaActionPerformed

    private void campoEstatusAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstatusAluguelActionPerformed

    }//GEN-LAST:event_campoEstatusAluguelActionPerformed

    private void campoCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoAtualizarEstatusDoAluguel;
    private java.awt.Button botaoLimparBusca;
    private java.awt.Button botaoProcurarAluguel;
    private javax.swing.JFormattedTextField campoCpfCliente;
    private javax.swing.JFormattedTextField campoDataDevolucao;
    private javax.swing.JFormattedTextField campoDataEntrega;
    private javax.swing.JFormattedTextField campoDataPedido;
    private javax.swing.JComboBox<String> campoEstatusAluguel;
    private javax.swing.JFormattedTextField campoNumeroPedido;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private int recuperarEstatusAluguel(Aluguel dadosAluguel) {
        switch (dadosAluguel.getSituacao()) {
            case "ATRASADO":
                return 0;
            case "DEVOLVIDO":
                return 1;
            case "EM_DIA":
                return 2;
            case "PENDENTE":
                return 3;
            default:
                break;
        }
        return -1;
    }

    private void limparPesquisa() {
        campoNumeroPedido.setText(null);
        campoNumeroPedido.setValue(null);
        campoNumeroPedido.setEnabled(true);
        
        campoDataPedido.setText(null);
        campoDataPedido.setValue(null);
        
        campoDataEntrega.setText(null);
        campoDataEntrega.setValue(null);
        
        campoDataDevolucao.setText(null);
        campoDataDevolucao.setValue(null);
        
        campoCpfCliente.setText(null);
        campoCpfCliente.setValue(null);
        
        campoEstatusAluguel.setSelectedIndex(0);
        
        campoObservacoes.setText(null);
        campoObservacoes.setEditable(false);
        
        botaoAtualizarEstatusDoAluguel.setEnabled(false);
    }
    
    private void resetarCampos() {
        campoNumeroPedido.setText(null);
        campoNumeroPedido.setValue(null);
        campoNumeroPedido.setEnabled(true);
        
        campoDataPedido.setText(null);
        campoDataPedido.setValue(null);
        
        campoDataEntrega.setText(null);
        campoDataEntrega.setValue(null);
        
        campoDataDevolucao.setText(null);
        campoDataDevolucao.setValue(null);
        
        campoCpfCliente.setText(null);
        campoCpfCliente.setValue(null);
        
        campoEstatusAluguel.setSelectedIndex(0);
        
        campoObservacoes.setText(null);
        campoObservacoes.setEditable(false);
        
        botaoAtualizarEstatusDoAluguel.setEnabled(false);
    }

    private Date converterStringToDate(String text) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dt = sdf.parse(text);
        java.sql.Date sql = new java.sql.Date(dt.getTime());
        return sql; 
    }

}
