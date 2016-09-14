/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.apresentacao.LoginJFrame;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.excecao.LoginInexistenteException;
import br.ufsc.ine5612.excecao.NenhumFuncionarioCadastradoException;
import br.ufsc.ine5612.excecao.SenhaErradaException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ControladorFuncionario {
//    private FuncionarioDAO funcionarioDAO;
    private ArrayList<Funcionario> funcionarios;
    private ControladorPrincipal principal;
    private Funcionario funcionarioLogado;
    
    public ControladorFuncionario(ControladorPrincipal principal) {
        this.funcionarios = new ArrayList<>();
        this.principal=principal;
        criarFuncionarios();
    }

    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setFuncionarioLogado(Funcionario funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
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


    public Funcionario validaUsuarioException(String login, String senha) throws SenhaErradaException, LoginInexistenteException, NenhumFuncionarioCadastradoException {
        int qtd = funcionarios.size();
        int verifica = 0;
        Funcionario funcionario = null;
        for(int i = 0; i <= qtd ; i++){
            funcionario = funcionarios.get(i);
            if(funcionario.getLogin().equals(login)){
                if(funcionario.getSenha().equals(senha)){
                    verifica = 0;
                    this.funcionarioLogado = funcionario;
                    return funcionario;
                } else{
                    verifica = 1;
                }
            } else {
                verifica = 2;
            }
        }
        if(verifica == 1) {
            throw new SenhaErradaException();
        }
        if(verifica == 2) {
            throw new LoginInexistenteException();
        }
        throw new NenhumFuncionarioCadastradoException();
    }
    
    public Funcionario validaUsuario(String login, String senha){
        Funcionario funcionario = null;
        try {
            funcionario = validaUsuarioException(login, senha);  
        } catch (SenhaErradaException | LoginInexistenteException | NenhumFuncionarioCadastradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return funcionario;
    }
 
}
