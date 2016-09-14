/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.excecao;

/**
 *
 * @author julia
 */
public class MesaFechadaException extends NullPointerException{
    
    public MesaFechadaException(){
        super("Pedido não pode ser realizado pois a mesa ainda está fechada");
    }
}
