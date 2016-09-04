/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.entidades;

import java.util.ArrayList;

/**
 *
 * @author Leon
 */
public class Menu {
    
    private ArrayList<Produto> comida;
    private ArrayList<Produto> bebida;
    private ArrayList<Produto> sobremesa; 

    public Menu() {
        comida = new ArrayList<>();
        bebida = new ArrayList<>();
        sobremesa = new ArrayList<>();
    }
    
    public ArrayList<Produto> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Produto> comida) {
        this.comida = comida;
    }

    public ArrayList<Produto> getBebida() {
        return bebida;
    }

    public void setBebida(ArrayList<Produto> bebida) {
        this.bebida = bebida;
    }

    public ArrayList<Produto> getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(ArrayList<Produto> sobremesa) {
        this.sobremesa = sobremesa;
    }
    
    
    
}
