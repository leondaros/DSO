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
    private ArrayList<Produto> comidas;
    private ArrayList<Produto> bebidas;
    private ArrayList<Produto> sobremesas; 

    public Menu() {
        comidas = new ArrayList<>();
        bebidas = new ArrayList<>();
        sobremesas = new ArrayList<>();
    }
    
    public ArrayList<Produto> getComidas() {
        return comidas;
    }

    public void setComida(Produto comida) {
        this.comidas.add(comida);
    }

    public ArrayList<Produto> getBebidas() {
        return bebidas;
    }

    public void setBebida(Produto bebida) {
        this.bebidas.add(bebida);
    }

    public ArrayList<Produto> getSobremesas() {
        return sobremesas;
    }
    public void setSobremesa(Produto sobremesa) {
        this.sobremesas.add(sobremesa);
    }
    
}
