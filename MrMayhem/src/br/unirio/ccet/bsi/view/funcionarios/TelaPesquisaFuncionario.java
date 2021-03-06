/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.funcionarios;

import br.unirio.ccet.bsi.view.envios.TelaEnvioRelatorio;
import br.unirio.ccet.bsi.controller.Login;
import br.unirio.ccet.bsi.persistence.dao.FuncionarioDAO;
import br.unirio.ccet.bsi.persistence.dao.impl.FuncionarioDAOImpl;
import br.unirio.ccet.bsi.persistence.entity.Funcionario;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class TelaPesquisaFuncionario extends javax.swing.JInternalFrame {

    private final JDesktopPane desktop;

    /**
     * Creates new form TelaPesquisaFuncionario
     */
    public TelaPesquisaFuncionario(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        if (!Login.getIdUsuario().equals("supervisor")){
            botaoEncaminharPorEmail.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoPesquisar = new java.awt.Button();
        botaoImprimir = new java.awt.Button();
        botaoEncaminharPorEmail = new java.awt.Button();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CTPS", "Função", "Salário", "Data de cadastramento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botaoPesquisar.setLabel("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoImprimir.setEnabled(false);
        botaoImprimir.setLabel("Imprimir");
        botaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirActionPerformed(evt);
            }
        });

        botaoEncaminharPorEmail.setEnabled(false);
        botaoEncaminharPorEmail.setLabel("Encaminhar por e-mail");
        botaoEncaminharPorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEncaminharPorEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        DefaultTableModel dtmFuncionarios = (DefaultTableModel) jTable1.getModel();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
        List<Funcionario> funcionarios = funcionarioDAO.findAll();
        if (!funcionarios.isEmpty()){
            for (Funcionario funcionario : funcionarios){
                Object[] dados = {funcionario.getNome(), funcionario.getCtps(), funcionario.getTipoFuncionario(), 
                    funcionario.getSalario(), new SimpleDateFormat("dd/MM/yyyy").format(funcionario.getDataCadastramento())};
                dtmFuncionarios.addRow(dados);
            }
            botaoPesquisar.setEnabled(false);
            botaoImprimir.setEnabled(true);
            botaoEncaminharPorEmail.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(TelaPesquisaFuncionario.this, "Não existem registros!");
        }
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        try {
            boolean impresso = jTable1.print();
            if(impresso){
                JOptionPane.showMessageDialog(TelaPesquisaFuncionario.this, "Impressão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(TelaPesquisaFuncionario.this, "Erro ao realizar impressão!");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(TelaPesquisaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoImprimirActionPerformed

    private void botaoEncaminharPorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEncaminharPorEmailActionPerformed
        TelaEnvioRelatorio telaEnvioRelatorioFuncionario = new TelaEnvioRelatorio(jTable1);
        desktop.add(telaEnvioRelatorioFuncionario);
        telaEnvioRelatorioFuncionario.setVisible(true);
    }//GEN-LAST:event_botaoEncaminharPorEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoEncaminharPorEmail;
    private java.awt.Button botaoImprimir;
    private java.awt.Button botaoPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
