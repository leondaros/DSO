/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.apresentacao.LoginJFrame;

/**
 *
 * @author Leon
 */
public class ControladorPrincipal {
    
    
    private ControladorComanda controladorComanda;
    private ControladorFuncionario controladorFuncionario;
    
    private LoginJFrame loginJFrame;
    
    public ControladorPrincipal(){
    
    }
    
    public void iniciaPrograma(){
    
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
