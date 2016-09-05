/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ControladorFuncionario {
 
    
    private ArrayList<Funcionario> funcionarios;
    private Funcionario usuario;

    public ControladorFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    public Funcionario getUsuario() {
        return usuario;
    }

    public void setUsuario(Funcionario usuario) {
        this.usuario = usuario;
    }
    
    public boolean validaUsuario(String login,String senha){
        return true;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    
}
