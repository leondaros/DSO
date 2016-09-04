/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.entidades;

/**
 *
 * @author Leon
 */
public enum Categoria {
    
    COMIDA("Comida"),
    BEBIDA("Bebida"),
    SOBREMESA("Sobremesa");
    
    private String c;

    private Categoria(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }  
}
