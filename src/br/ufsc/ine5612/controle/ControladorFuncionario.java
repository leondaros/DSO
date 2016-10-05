/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Funcionario;
import java.util.ArrayList;
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
        Funcionario funcionario2 = new Funcionario("Leon", "leondaros", "euamoanina", true);
        Funcionario funcionario3 = new Funcionario("Jan", "janpierry", "abacaxi", false);
        Funcionario funcionario4 = new Funcionario("Luiza", "lucardoso", "tchkmama", false);
        Funcionario funcionario5 = new Funcionario("eu", "oi", "oi",true);
        adicionarFuncionario(funcionario1);
        adicionarFuncionario(funcionario2);
        adicionarFuncionario(funcionario3);
        adicionarFuncionario(funcionario4);
        adicionarFuncionario(funcionario5);
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


    public Funcionario validaUsuarioException(String login, String senha) throws IndexOutOfBoundsException {
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
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }
    
    public Funcionario validaUsuario(String login, String senha){
        Funcionario funcionario = null;
        try {
            funcionario = validaUsuarioException(login, senha);  
        } catch (IndexOutOfBoundsException e) {
          JOptionPane.showMessageDialog(null, "Login ou senha incorretos","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return funcionario;
    }
 
}
