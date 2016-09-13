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
public class Produto {
    private String titulo;
    private double preco;
    private Categoria c;
    private Integer codigo;

    public Produto(String titulo, double preco, Categoria c) {
        this.titulo = titulo;
        this.preco = preco;
        this.c = c;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Categoria getC() {
        return c;
    }

    public void setC(Categoria c) {
        this.c = c;
    }
    
        public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
