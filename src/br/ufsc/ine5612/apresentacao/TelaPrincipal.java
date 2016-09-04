/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.apresentacao;

import br.ufsc.ine5612.controle.ControladorComanda;
import br.ufsc.ine5612.controle.ControladorFuncionario;
import br.ufsc.ine5612.entidades.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Leon
 */
public class TelaPrincipal {

    private Scanner teclado;
    
    private ControladorFuncionario controladorFuncionario;
    private ControladorComanda controladorComanda;
    Funcionario f = new Funcionario("nome","nome","senha", true);
            
    public TelaPrincipal() {
        teclado = new Scanner(System.in);
        
        
    }
    
    public void selecionaMesas(){
        System.out.println("-------SYS DARAYAMA-------");
	System.out.println("--Selecao de Mesa--");
	System.out.println("Mesa 1");
        System.out.println("Mesa 2");
	System.out.println("Mesa 3");
        
        int opcao = teclado.nextInt();
        switch (opcao) {
		case 1: {
                    controladorComanda.abreMesa(f,opcao);
                }
                case 2:{
                    controladorComanda.abreMesa(f,opcao);
                }
                case 3:{
                    controladorComanda.abreMesa(f,opcao);
                }
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ControladorFuncionario getControladorFuncionario() {
        return controladorFuncionario;
    }

    public void setControladorFuncionario(ControladorFuncionario controladorFuncionario) {
        this.controladorFuncionario = controladorFuncionario;
    }

    public ControladorComanda getControladorComanda() {
        return controladorComanda;
    }

    public void setControladorComanda(ControladorComanda controladorComanda) {
        this.controladorComanda = controladorComanda;
    }
}
