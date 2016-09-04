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
   private float precoTotal;
   private boolean contaFechada;

    public Comanda() {
        produtos= new ArrayList<>();
    }

    public boolean isContaFechada() {
        return contaFechada;
    }

    public void setContaFechada(boolean contaFechada) {
        this.contaFechada = contaFechada;
    }
    
    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
   
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
   
   
}
