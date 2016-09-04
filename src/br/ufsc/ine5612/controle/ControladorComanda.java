/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Comanda;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.entidades.Mesa;
import br.ufsc.ine5612.entidades.Produto;

/**
 *
 * @author aluno
 */
public class ControladorComanda {
   
    private final int nMesas = 4;
    private Mesa[] mesas;    

    public ControladorComanda() {
        mesas= new Mesa[nMesas];
    }
    
    public void abreMesa(Funcionario f,int i){
        Mesa m = new Mesa(i);
        m.setFuncionario(f);
        mesas[i-1] = m;
    }
    
    public void fechaMesa(int i){

    }
    
    public void criaComanda(Comanda c,Mesa m){
    
    }
    
    public void imprimeComanda(Comanda c){
    
    }
    
    public void adicionaPedido(Comanda c ,Produto p){
    
    }
    
    public void encerrerComanda(Comanda c){
        //apenas gerente
    }
    
    public void cancelaPedido(Comanda c,Produto p){
        //apenas gerente
    }
    
    public void adicionaCortesia(Comanda c){
        //apensa gerente
    }
    
    public void armazenaComanda(Comanda c){
    
    }

    public Mesa[] getMesas() {
        return mesas;
    }

    public void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }
}
