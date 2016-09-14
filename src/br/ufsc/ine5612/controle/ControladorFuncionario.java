/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.persistencia.FuncionarioDAO;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class ControladorFuncionario {
//    private FuncionarioDAO funcionarioDAO;
    private ArrayList<Funcionario> funcionarios;
    private ControladorPrincipal principal;
    public ControladorFuncionario(ControladorPrincipal principal) {
        this.funcionarios = new ArrayList<>();
        criarFuncionarios();
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

//    public FuncionarioDAO getFuncionarios() {
//        return funcionarioDAO;
//    }
//
//    public boolean validaUsuario(String login,String senha){
//        int verificador = 0;
//        Integer log = Integer.parseInt(login);
//        Set<Integer> chaves = funcionarioDAO.getCache().keySet();
//        for(Integer chave: chaves){
//            if(chave.equals(log)){
//                Funcionario funcionario = funcionarioDAO.get(chave);
//                if(funcionario.getSenha().equals(senha)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    
//    public Funcionario registraUsuario(String nome, String login, String senha, boolean gerente){
//        Integer log = Integer.parseInt(login);
//        Set<Integer> chaves = funcionarioDAO.getCache().keySet();
//        for(Integer chave: chaves){
//            if(chave.equals(log)){
//                return null; //login ja existe
//            }
//        }
//        Funcionario funcionario = new Funcionario(nome, login, senha, gerente);
//        funcionarioDAO.put(funcionario);
//        return funcionario;
//    }    
}
