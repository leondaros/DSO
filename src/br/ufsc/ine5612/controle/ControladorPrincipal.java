/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.apresentacao.LoginJFrame;
import br.ufsc.ine5612.apresentacao.MenuJFrame;
import br.ufsc.ine5612.apresentacao.MesasJFrame;
import br.ufsc.ine5612.apresentacao.PedidosMesaJFrame;

/**
 *
 * @author Leon
 */
public class ControladorPrincipal {
    
    
    private ControladorComanda controladorComanda;
    private ControladorFuncionario controladorFuncionario;
    
    private LoginJFrame loginJFrame;
    
    private MesasJFrame mesasJFrame;
    private PedidosMesaJFrame pedidosMesaJFrame;
    private MenuJFrame menuJFrame;

    
    public ControladorPrincipal(){
        
        controladorComanda= new ControladorComanda(this);
        controladorFuncionario = new ControladorFuncionario(this);
        
        loginJFrame = new LoginJFrame(this);
        mesasJFrame=new MesasJFrame(this);
        pedidosMesaJFrame = new PedidosMesaJFrame(this);
        menuJFrame = new MenuJFrame(this);
        
    }
    
    public void iniciaPrograma(){
    
    }

    public MesasJFrame getMesasJFrame() {
        return mesasJFrame;
    }

    public void setMesasJFrame(MesasJFrame mesasJFrame) {
        this.mesasJFrame = mesasJFrame;
    }

    public PedidosMesaJFrame getPedidosMesaJFrame() {
        return pedidosMesaJFrame;
    }

    public void setPedidosMesaJFrame(PedidosMesaJFrame pedidosMesaJFrame) {
        this.pedidosMesaJFrame = pedidosMesaJFrame;
    }

    public MenuJFrame getMenuJFrame() {
        return menuJFrame;
    }

    public void setMenuJFrame(MenuJFrame menuJFrame) {
        this.menuJFrame = menuJFrame;
    }
    
    public void telaLogin(){
        loginJFrame.setVisible(true);
    }
    
    public void telaMesasSelecao(){
        mesasJFrame.setVisible(true);
    }
    
    public void telaSelecaoMesa(){
        mesasJFrame.setVisible(true);
    }
    
    public void telaPedidosMesa(){
        pedidosMesaJFrame.setVisible(true);
    }
    
    public void telaCardapioMenu(){
        menuJFrame.setVisible(true);
    }
    
    public void fechaTelaCardapioMenu(){
        menuJFrame.setVisible(false);
    }
    
    public ControladorComanda getControladorComanda() {
        return controladorComanda;
    }

    public void setControladorComanda(ControladorComanda controladorComanda) {
        this.controladorComanda = controladorComanda;
    }

    public ControladorFuncionario getControladorFuncionario() {
        return controladorFuncionario;
    }

    public void setControladorFuncionario(ControladorFuncionario controladorFuncionario) {
        this.controladorFuncionario = controladorFuncionario;
    }

    public LoginJFrame getLoginJFrame() {
        return loginJFrame;
    }

    public void setLoginJFrame(LoginJFrame loginJFrame) {
        this.loginJFrame = loginJFrame;
    }
}
