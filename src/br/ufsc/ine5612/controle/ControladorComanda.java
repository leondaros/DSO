/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;
import br.ufsc.ine5612.apresentacao.MenuJFrame;
import br.ufsc.ine5612.apresentacao.MesasJFrame;
import br.ufsc.ine5612.apresentacao.PedidosMesaJFrame;
import br.ufsc.ine5612.entidades.Comanda;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.entidades.Mesa;
import br.ufsc.ine5612.entidades.Produto;
import br.ufsc.ine5612.persistencia.ComandaDAO;
/**
 *
 * @author aluno
 */
public class ControladorComanda {
    private final int nMesas = 4;
    private Mesa[] mesas;
    private ControladorPrincipal principal;
    
    private ComandaDAO comandaDAO;
    
    
    private MesasJFrame mesasJFrame;
    private PedidosMesaJFrame pedidosMesaJFrame;
    private MenuJFrame menuJFrame;
    
    public ControladorComanda(ControladorPrincipal principal) {
        mesas = new Mesa[nMesas];
        this.principal=principal;
        
        mesasJFrame = new MesasJFrame(this);
        pedidosMesaJFrame = new PedidosMesaJFrame(this);
        menuJFrame = new MenuJFrame(this);
        
    }
    
    public void telaSelecaoMesa(){
        mesasJFrame.setVisible(true);
    }
    
    public void telaPedidosMesa(){
        pedidosMesaJFrame.setVisible(true);
    }
    
    public void telaCardapioMenu(){
        menuJFrame.setVisible(true);
    }
    
    public Mesa selecionaMesa(int i) {
        return mesas[i - 1];
    }
    public Mesa abreMesa(Funcionario f, int num) {
        if(num <= nMesas){
            mesas[num-1] = new Mesa(num);
            mesas[num-1].setFuncionario(f);
            mesas[num-1].setOcupada(true);
            Comanda comanda = new Comanda();
            mesas[num-1].setComanda(comanda);
            return mesas[num-1];
        }
        return null;
    }
    
    public void encerrarMesa(int num){
        mesas[num-1].getComanda().setHabilitaPedito(false);
    }
    public void receberPagamento(Funcionario f, int num) {
        //apenas gerente
        if (f.isGerente()) {
            mesas[num-1].setOcupada(false);
            Comanda comanda = mesas[num-1].getComanda();
            comandaDAO.put(comanda);
            mesas[num-1].setComanda(null);
            mesas[num-1].setFuncionario(null);
        }
    }
    
    public void adicionaPedido(Produto produto, int num) {
        if(mesas[num-1].getComanda().getHabilitaPedido()){
            mesas[num-1].getComanda().getProdutos().add(produto);
            mesas[num-1].getComanda().setPrecoTotal(mesas[num-1].getComanda().getPrecoTotal() + produto.getPreco());
        }
        //se não, a comanda está fechada e não dá
    }
    
    public void cancelaPedido(Produto p, int num) {
        //apenas gerente
        Comanda c = mesas[num-1].getComanda();
        for (int i = 0; i < c.getProdutos().size(); i++) {
            if (c.getProdutos().get(i).equals(p)) {
               c.getProdutos().remove(i);
               c.setPrecoTotal(mesas[num-1].getComanda().getPrecoTotal() - p.getPreco());
            }
        }
    }
    public void imprimeComanda(int num) {
    }
    
    public void adicionaCortesia(Funcionario funcionario, Produto produto, int num) {
        if (funcionario.isGerente()) {
            if(mesas[num-1].getComanda().getHabilitaPedido()){
                mesas[num-1].getComanda().getProdutos().add(produto);
            }
        }
    }

    public Mesa[] getMesas() {
        return mesas;
    }
 
    public ComandaDAO getComanda() {
        return comandaDAO;
    }

}
