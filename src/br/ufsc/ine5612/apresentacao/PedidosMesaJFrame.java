/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.apresentacao;

import br.ufsc.ine5612.controle.ControladorPrincipal;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.entidades.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leon
 */
public class PedidosMesaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PedidosMesaJFrame
     */
    private GerenciadorEventos gerenciadorEventos;
    private ControladorPrincipal controladorPrincipal;

    String[] colunas = {};
    String[][] linhas;

    public PedidosMesaJFrame(ControladorPrincipal controladorPrincipal) {

        initComponents();

        this.controladorPrincipal = controladorPrincipal;
        this.gerenciadorEventos = new GerenciadorEventos();

        inicializarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaImpressao = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Adiciona Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exclui Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Receber Dinheiro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Encerrar Mesa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Imprimir Comanda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tabelaImpressao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Quantidade", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaImpressao.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaImpressao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(36, 36, 36)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        controladorPrincipal.getControladorComanda().receberPagamento(controladorPrincipal.getControladorFuncionario().getFuncionarioLogado(), controladorPrincipal.getControladorComanda().getMesaAtual().getNumero());
        controladorPrincipal.fechaTelaPedidosMesa();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            boolean print = jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PedidosMesaJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controladorPrincipal.telaCardapioMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        controladorPrincipal.getControladorComanda().encerrarMesa(controladorPrincipal.getControladorComanda().getMesaAtual().getNumero());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        controladorPrincipal.fechaTelaPedidosMesa();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void inicializarComponentes() {

        jButton1.setActionCommand(jButton1.getText());
        jButton1.addActionListener(gerenciadorEventos);
        jButton2.setActionCommand(jButton2.getText());
        jButton2.addActionListener(gerenciadorEventos);
        jButton3.setActionCommand(jButton3.getText());
        jButton3.addActionListener(gerenciadorEventos);
        jButton4.setActionCommand(jButton4.getText());
        jButton4.addActionListener(gerenciadorEventos);
        jButton5.setActionCommand(jButton5.getText());
        jButton5.addActionListener(gerenciadorEventos);
        jButton6.setActionCommand(jButton6.getText());
        jButton6.addActionListener(gerenciadorEventos);

    }

    public void atualizaTabela() {

        DefaultTableModel colunas = new DefaultTableModel();
        colunas.addColumn("Produto");
        colunas.addColumn("Preço");
//        this.tabelaImpressao.setModel(colunas);
        double saldoTotal = 0;

        if (!controladorPrincipal.getControladorComanda().getMesaAtual().getComanda().getProdutos().isEmpty()) {
            for (int i = 0; i < controladorPrincipal.getControladorComanda().getMesaAtual().getComanda().getProdutos().size(); i++) {
                Produto produto = controladorPrincipal.getControladorComanda().getMesaAtual().getComanda().getProdutos().get(i);
                colunas.addRow(new Object[]{produto.getTitulo(), produto.getPreco()});
                saldoTotal = saldoTotal + produto.getPreco();
            }
            colunas.addRow(new Object[]{"Conta:", saldoTotal});
        } 
        else {
            colunas.setRowCount(0);
        }
        tabelaImpressao.setModel(colunas);
    }

    private class GerenciadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals(jButton1.getActionCommand())) {
                controladorPrincipal.telaCardapioMenu();
            }
            if (e.getActionCommand().equals(jButton2.getActionCommand())) {
//                exclui pedido
            }
            if (e.getActionCommand().equals(jButton3.getActionCommand())) {
//                imprime
            }
            if (e.getActionCommand().equals(jButton4.getActionCommand())) {
            }
            if (e.getActionCommand().equals(jButton5.getActionCommand())) {
            }
            if (e.getActionCommand().equals(jButton6.getActionCommand())) {
//                controladorPrincipal.fechaTelaCardapioMenu();
            }
        }
    }

    public GerenciadorEventos getGerenciadorEventos() {
        return gerenciadorEventos;
    }

    public void setGerenciadorEventos(GerenciadorEventos gerenciadorEventos) {
        this.gerenciadorEventos = gerenciadorEventos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaImpressao;
    // End of variables declaration//GEN-END:variables

}
