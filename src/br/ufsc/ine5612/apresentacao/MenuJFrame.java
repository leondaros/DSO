/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.apresentacao;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author aluno
 */
public class MenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PedidoJFrame
     */
    private Container container;
    private Container containerBar;
    JScrollBar scrPane = null;
    JPanel jPanel = new JPanel();
    JFrame frame = new JFrame();
    private JLabel labelProduto;
    private JLabel labelValor;
    private JLabel labelQuantidade;
    private JButton btAdicionaProduto;
    private JButton btRetiraProduto;
    
    JTabbedPane abas;
    
    public MenuJFrame() {
        
        container =  getContentPane();
        containerBar =  getContentPane();
        
//        scrPane = new JScrollPane(jPanel);
        
        initComponents();
        
        inicializarComponentes();
//        setSize(700,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
    }

    private void inicializarComponentes(){

        
        abas = new JTabbedPane();
//	GridBagConstraints cts = new GridBagConstraints();
        GridLayout cts = new GridLayout(10,6);
        container.setLayout(cts);
        
        scrPane =new JScrollBar(JScrollBar.VERTICAL, 10, 0, 0, 100);
//        cts.gridx = 6;
//        cts.gridy = 0;
//        cts.gridwidth = 1;
//	cts.fill = GridBagConstraints.VERTICAL;
        container.add(scrPane);
        
        for (int i = 0; i < 10; i++) {
        
        labelProduto = new JLabel("Produto:"+i);
//        cts.gridx = 0;
//	cts.gridy = i;
//	cts.fill = GridBagConstraints.HORIZONTAL;
	container.add(labelProduto);
        
   
        btAdicionaProduto = new JButton("+");
        btAdicionaProduto.setActionCommand(btAdicionaProduto.getText());
//        cts.gridx = 1;
//	cts.gridy = i;
//        cts.insets = new Insets(15,15, 15, 15);
//	cts.fill = GridBagConstraints.HORIZONTAL;
        container.add(btAdicionaProduto);
//        buttonMesa1.addActionListener(gerenciador);
        
        labelQuantidade = new JLabel("Quantidade");
//        cts.gridx = 2;
//	cts.gridy = i;
//	cts.fill = GridBagConstraints.HORIZONTAL;
	container.add(labelQuantidade);
        
        btRetiraProduto = new JButton("-");
        btRetiraProduto.setActionCommand(btRetiraProduto.getText());
//        cts.gridx = 3;
//	cts.gridy = i;
//        cts.insets = new Insets(15,15, 15, 15);
//	cts.fill = GridBagConstraints.HORIZONTAL;
        container.add(btRetiraProduto);
//        buttonMesa1.addActionListener(gerenciador);

        labelValor = new JLabel("Valor");
//        cts.gridx = 4;
//	cts.gridy = i;
//	cts.fill = GridBagConstraints.HORIZONTAL;
	container.add(labelValor);
        
        } 
        
        abas.add("container",container);
//        jPanel.add(container);
        
//        frame.add(scrPane);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
