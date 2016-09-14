/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.apresentacao.LoginJFrame;
import br.ufsc.ine5612.entidades.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ControladorFuncionario {
//    private FuncionarioDAO funcionarioDAO;
    private ArrayList<Funcionario> funcionarios;
    private ControladorPrincipal principal;
    
    private LoginJFrame loginJFrame;
    
    public ControladorFuncionario(ControladorPrincipal principal) {
        this.funcionarios = new ArrayList<>();
        loginJFrame = new LoginJFrame(this);
        criarFuncionarios();
    }
    
    public void telaLogin(){
        loginJFrame.setVisible(true);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public void criarFuncionarios(){
        Funcionario funcionario1 = new Funcionario("Júlia", "junakayama", "meunomeehjulia", true);
        Funcionario funcionario2 = new Funcionario("Leon", "leondaros", "euamoanina", false);
        Funcionario funcionario3 = new Funcionario("Jan", "janpierry", "abacaxi", false);
        Funcionario funcionario4 = new Funcionario("Luiza", "lucardoso", "tchkmama", false);
        adicionarFuncionario(funcionario1);
        adicionarFuncionario(funcionario2);
        adicionarFuncionario(funcionario3);
        adicionarFuncionario(funcionario4);
    }

    public ControladorPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(ControladorPrincipal principal) {
        this.principal = principal;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public Funcionario validaUsuario(String login, String senha) {
        int qtd = funcionarios.size();
        for(int i = 0; i <= qtd ; i++){
            Funcionario funcionario = funcionarios.get(i);
            if(funcionario.getLogin().equals(login)){
                if(funcionario.getSenha().equals(senha)){
                    return funcionario;
                }
            }
        }
        return null;
    }
    
 
}
