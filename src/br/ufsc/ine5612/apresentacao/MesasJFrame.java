/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.apresentacao;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aluno
 */
public class MesasJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MesasJFrame
     */
    private JLabel labelTitulo;
    
    private Container container;
    
    private JButton buttonMesa1;
    private JButton buttonMesa2;
    private JButton buttonMesa3;
    private JButton buttonMesa4;
    
    private GerenciadorEventos gerenciadorEventos;
    
    public MesasJFrame() {
        initComponents();
        
        this.container = getContentPane();
        gerenciadorEventos = new GerenciadorEventos();
        inicializarComponentes();
        
        setSize(400,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
     private void inicializarComponentes(){
         
         labelTitulo = new JLabel("Seleção de mesas: ");
        container.add(labelTitulo);
         
        labelTitulo = new JLabel("          ");
        container.add(labelTitulo);
        
        container.setLayout(new FlowLayout());
        
        buttonMesa1 = new JButton("Mesa 1");
        buttonMesa1.setPreferredSize(new Dimension(230, 20));
        buttonMesa1.setActionCommand(buttonMesa1.getText());
        container.add(buttonMesa1);
        buttonMesa1.addActionListener(gerenciadorEventos);


        buttonMesa2 = new JButton("Mesa 2");
        buttonMesa2.setPreferredSize(new Dimension(230, 20));
        buttonMesa2.setActionCommand(buttonMesa2.getText());
        container.add(buttonMesa2);
        buttonMesa2.addActionListener(gerenciadorEventos);


        buttonMesa3 = new JButton("Mesa 3");
        buttonMesa3.setPreferredSize(new Dimension(230, 20));
        buttonMesa3.setActionCommand(buttonMesa3.getText());
        container.add(buttonMesa3);
        buttonMesa3.addActionListener(gerenciadorEventos);


        buttonMesa4 = new JButton("Mesa 4");
        buttonMesa4.setPreferredSize(new Dimension(230, 20));
        buttonMesa4.setActionCommand(buttonMesa4.getText());
        container.add(buttonMesa4);
        buttonMesa4.addActionListener(gerenciadorEventos);
    }
     
     private class GerenciadorEventos implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {
    
        }
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
