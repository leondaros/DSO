/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.apresentacao;

import br.ufsc.ine5612.controle.ControladorMenu;
import br.ufsc.ine5612.controle.ControladorPrincipal;
import br.ufsc.ine5612.entidades.Produto;
import static java.awt.Frame.NORMAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class MenuJFrame extends javax.swing.JFrame {

    private GerenciadorEventos gerenciadorEventos;

    private ControladorPrincipal controladorPrincipal;
    private ControladorMenu menu;

    public MenuJFrame(ControladorPrincipal controladorPrincipal) {

        initComponents();
        this.controladorPrincipal = controladorPrincipal;
        gerenciadorEventos= new GerenciadorEventos();
        menu = new ControladorMenu();
        inicializar();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Comida:");

        jLabel2.setText("Bebida:");

        jLabel3.setText("Sobremesa:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Adicionar");

        jButton2.setText("Adicionar");

        jButton3.setText("Adicionar");

        jLabel4.setText("Menu");

        jButton4.setText("Encerrar Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 180, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void inicializar() {

        ArrayList<Produto> comidas = menu.getMenu().getComidas();
        ArrayList<Produto> bebidas = menu.getMenu().getBebidas();
        ArrayList<Produto> sobremesa = menu.getMenu().getSobremesas();

        for (int i = 0; i < comidas.size(); i++) {
            jComboBox1.addItem(comidas.get(i).getTitulo());
        }
        for (int i = 0; i < bebidas.size(); i++) {
            jComboBox2.addItem(bebidas.get(i).getTitulo());
        }
        for (int i = 0; i < sobremesa.size(); i++) {
            jComboBox3.addItem(sobremesa.get(i).getTitulo());
        }

        jButton1.setActionCommand(jButton1.getText());
        jButton1.addActionListener(gerenciadorEventos);
        jButton2.setActionCommand(jButton2.getText());
        jButton2.addActionListener(gerenciadorEventos);
        jButton3.setActionCommand(jButton3.getText());
        jButton3.addActionListener(gerenciadorEventos);
        jButton4.setActionCommand(jButton4.getText());
        jButton4.addActionListener(gerenciadorEventos);        
        
    }

    private class GerenciadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals(jButton1.getActionCommand())) {
//                ADD
                controladorPrincipal.getControladorComanda().adicionaPedido(menu.getComidaMenu(jComboBox1.getSelectedItem().toString()),controladorPrincipal.getControladorComanda().getMesaAtual().getNumero());
            } else if (e.getActionCommand().equals(jButton2.getActionCommand())) {
//                ADD
                controladorPrincipal.getControladorComanda().adicionaPedido(menu.getBebidaMenu(jComboBox2.getSelectedItem().toString()), controladorPrincipal.getControladorComanda().getMesaAtual().getNumero());
            } else if (e.getActionCommand().equals(jButton3.getActionCommand())) {
//                ADD
                controladorPrincipal.getControladorComanda().adicionaPedido(menu.getSobremesaMenu(jComboBox3.getSelectedItem().toString()), controladorPrincipal.getControladorComanda().getMesaAtual().getNumero());
            } else if (e.getActionCommand().equals(jButton4.getActionCommand())) {
//                ENCERRAR PEDIDO
                  controladorPrincipal.fechaTelaCardapioMenu();
            }

        }
    }
    public GerenciadorEventos getGerenciadorEventos() {
        return gerenciadorEventos;
    }

    public void setGerenciadorEventos(GerenciadorEventos gerenciadorEventos) {
        this.gerenciadorEventos = gerenciadorEventos;
    }

    public ControladorPrincipal getControladorPrincipal() {
        return controladorPrincipal;
    }

    public void setControladorPrincipal(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
    }

    public ControladorMenu getMenu() {
        return menu;
    }

    public void setMenu(ControladorMenu menu) {
        this.menu = menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
