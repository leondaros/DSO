/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Comanda implements Serializable{
   private ArrayList<Produto> produtos;
   private double precoTotal;
   private Integer codigo;
   private boolean habilitaPedido;
   private int numMesa;

    public Comanda(int numMesa) {
        this.produtos= new ArrayList<>();
        this.habilitaPedido = true;
        this.numMesa = numMesa;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
     
    public double getPrecoTotal() {
        return precoTotal;
    }
    

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public boolean getHabilitaPedido(){
       return habilitaPedido;
    }
    
    public void setHabilitaPedido(boolean habilitaPedido){
       this.habilitaPedido = habilitaPedido;
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
