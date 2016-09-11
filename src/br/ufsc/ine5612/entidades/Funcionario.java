/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.entidades;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private String nome;
    private String login;
    private String senha;
    private boolean gerente;


    public Funcionario(String nome, String login, String senha, boolean gerente) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.gerente = gerente;
    }
    
    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
