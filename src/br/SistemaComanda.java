/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import br.ufsc.ine5612.apresentacao.ComandaJFrame;
import br.ufsc.ine5612.apresentacao.LoginJFrame;
import br.ufsc.ine5612.apresentacao.MenuJFrame;
import br.ufsc.ine5612.apresentacao.MesasJFrame;
import br.ufsc.ine5612.controle.ControladorComanda;
import br.ufsc.ine5612.controle.ControladorFuncionario;
import br.ufsc.ine5612.entidades.Categoria;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.entidades.Produto;

/**
 *
 * @author aluno
 */
public class SistemaComanda {

    /**
     * @param args the command line arguments
     */
    
    LoginJFrame frame;
    MesasJFrame mesasJFrame;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        (new MesasJFrame()).setVisible(true);
        (new LoginJFrame()).setVisible(true);
        ControladorFuncionario controladorFuncionario = new ControladorFuncionario();
        ControladorComanda controladorComanda = new ControladorComanda();
        
        Produto produto = new Produto("Comida",10.50,Categoria.COMIDA);
        Produto produto1 = new Produto("Comida1",10.50,Categoria.COMIDA);
        Produto produto2 = new Produto("Comida2",10.50,Categoria.COMIDA);
        Produto produto3 = new Produto("Comida3",10.50,Categoria.COMIDA);
        Produto produto4 = new Produto("Comida4",10.50,Categoria.COMIDA);
        
        Funcionario funcionario = new Funcionario("Trabalhadô","login","senha",true,"123456789");
        Funcionario funcionario1 = new Funcionario("Trabalhadô1","login","senha",false,"987654321");

        
        controladorComanda.abreMesa(funcionario,1);
        System.out.println("abriu mesa");
        
        controladorComanda.adicionaPedido(produto, 1);
        System.out.println("adiciona produto0");
        controladorComanda.adicionaPedido(produto1, 2);
        System.out.println("adiciona produto1");
        controladorComanda.adicionaPedido(produto2, 1);
        System.out.println("adiciona produto2");
        controladorComanda.adicionaPedido(produto3, 3);
        System.out.println("adiciona produto3");
        controladorComanda.adicionaPedido(produto4, 4);
        System.out.println("adiciona produto4");
        
        controladorComanda.cancelaPedido(produto, 1);
        System.out.println("removeu produto");
        
//        for (Produto p : controladorComanda.getMesa().getComanda().getProdutos()) {
//            System.out.println(""+p.getTitulo());
//        }
        
        
    }
    
}
