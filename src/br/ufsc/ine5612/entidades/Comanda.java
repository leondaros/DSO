/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.entidades;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Comanda {
   private ArrayList<Produto> produtos;
   private double precoTotal;
   private Integer codigo;

    public Comanda() {
        produtos= new ArrayList<>();
    }
    
    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
        public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
   
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
   
   
}
