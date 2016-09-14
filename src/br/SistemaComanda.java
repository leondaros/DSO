/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import br.ufsc.ine5612.apresentacao.LoginJFrame;
import br.ufsc.ine5612.apresentacao.MesasJFrame;
import br.ufsc.ine5612.apresentacao.PedidosMesaJFrame;
import br.ufsc.ine5612.controle.ControladorComanda;
import br.ufsc.ine5612.controle.ControladorFuncionario;
import br.ufsc.ine5612.controle.ControladorMenu;
import br.ufsc.ine5612.controle.ControladorPrincipal;
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
    PedidosMesaJFrame frame1;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        (new MesasJFrame()).setVisible(true);
        
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
        ControladorFuncionario controladorFuncionario = new ControladorFuncionario(controladorPrincipal);
        ControladorComanda controladorComanda = new ControladorComanda(controladorPrincipal);
        
        (new LoginJFrame(controladorFuncionario)).setVisible(true);

        ControladorMenu controladorMenu = new ControladorMenu();
        
        Produto comida1 = controladorMenu.getComidaMenu("Pizza");
        Produto comida2 = controladorMenu.getComidaMenu("Lasanha");
        Produto comida3 = controladorMenu.getComidaMenu("Pizza");
        Produto comida4 = controladorMenu.getComidaMenu("Macarrão");
        Produto comida5 = controladorMenu.getComidaMenu("Macarrão");
        
        Funcionario funcionario = controladorFuncionario.validaUsuario("junakayama", "meunomeehjulia");

        
        controladorComanda.abreMesa(funcionario,1);
        System.out.println("abriu mesa1");
        
        controladorComanda.adicionaPedido(comida1, 1);
        System.out.println("adiciona produto0");
        controladorComanda.adicionaPedido(comida2, 1);
        System.out.println("adiciona produto1");
        controladorComanda.adicionaPedido(comida3, 1);
        System.out.println("adiciona produto2");
        controladorComanda.adicionaPedido(comida4, 1);
        System.out.println("adiciona produto3");
        
        controladorComanda.abreMesa(funcionario,2);
        System.out.println("abriu mesa");
        
        controladorComanda.adicionaPedido(comida4, 2);
        System.out.println("adiciona produto3");
        controladorComanda.adicionaPedido(comida5, 2);
        System.out.println("adiciona produto4");
        
        controladorComanda.cancelaPedido(comida1, 1);
        System.out.println("removeu produto");
        
//        for (Produto p : controladorComanda.getMesa().getComanda().getProdutos()) {
//            System.out.println(""+p.getTitulo());
//        }
        
        
    }
    
}
