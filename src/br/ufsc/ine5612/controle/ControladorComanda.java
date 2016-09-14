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
import br.ufsc.ine5612.excecao.ComandaFechadaException;
import br.ufsc.ine5612.excecao.MesaInexistenteException;
import br.ufsc.ine5612.excecao.NaoGerenteException;
import br.ufsc.ine5612.persistencia.ComandaDAO;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ControladorComanda {
    private final int nMesas = 4;
    private Mesa[] mesas;
    private Mesa mesaAtual;
    private ControladorPrincipal principal;
    
    private ComandaDAO comandaDAO;
    
    public ControladorComanda(ControladorPrincipal principal) {
        mesas = new Mesa[nMesas];
        this.principal=principal;
    }
    
    public void atualizaTabela(){
        principal.telaPedidosMesa();
    }

    public Mesa getMesaAtual() {
        return mesaAtual;
    }

    public void setMesaAtual(Mesa mesaAtual) {
        this.mesaAtual = mesaAtual;
    }

    public ControladorPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(ControladorPrincipal principal) {
        this.principal = principal;
    }

    public ComandaDAO getComandaDAO() {
        return comandaDAO;
    }

    public void setComandaDAO(ComandaDAO comandaDAO) {
        this.comandaDAO = comandaDAO;
    }
    
    public Mesa selecionaMesa(int i) {
        return mesas[i - 1];
    }
    public Mesa abreMesaException(Funcionario f, int num) throws MesaInexistenteException{
        if(num <= nMesas){
            mesas[num-1] = new Mesa(num);
            mesas[num-1].setFuncionario(f);
            mesas[num-1].setOcupada(true);
            Comanda comanda = new Comanda(num);
            mesas[num-1].setComanda(comanda);
            return mesas[num-1];
        }else{
            throw new MesaInexistenteException();
        }
    }
    
    public Mesa abreMesa(Funcionario f, int num){
       Mesa mesa = null;
        try {
            mesa = abreMesaException(f, num);
            mesaAtual=mesa;
        } catch (MesaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
       return mesa;
    }
    
    public void encerrarMesaException(int num) throws MesaInexistenteException{
        //qualquer funcionario pode encerrar a mesa
        if(num <= nMesas){
            mesas[num-1].getComanda().setHabilitaPedido(false);
        }else{
            throw new MesaInexistenteException();
        }
    }
    
    public void encerrarMesa(int num){
        try {
           encerrarMesaException(num);
        } catch (MesaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void receberPagamentoException(Funcionario f, int num) throws NaoGerenteException, MesaInexistenteException {
        if (f.isGerente()) {
            if(num <= nMesas){
                if(mesas[num-1].getComanda().getHabilitaPedido()){
                    mesas[num-1].getComanda().setHabilitaPedido(false);
                }
                mesas[num-1].setOcupada(false);
                Comanda comanda = mesas[num-1].getComanda();
                comandaDAO.put(comanda);
                mesas[num-1].setComanda(null);
                mesas[num-1].setFuncionario(null);
            }else{
                throw new MesaInexistenteException();
            }
        }else{
            throw new NaoGerenteException();
        }
    }
    
    public void receberPagamento(Funcionario f, int num){
        try {
            receberPagamentoException(f,num);
        } catch (NaoGerenteException | MesaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void adicionaPedidoException(Produto produto, int num) throws ComandaFechadaException, MesaInexistenteException {
        if(mesas[num-1].getComanda().getHabilitaPedido()){
            if(num <= nMesas){
                mesas[num-1].getComanda().getProdutos().add(produto);
                mesas[num-1].getComanda().setPrecoTotal(mesas[num-1].getComanda().getPrecoTotal() + produto.getPreco());
            }else{
                throw new MesaInexistenteException();
            }
        }else{
            throw new ComandaFechadaException();
        }
    }
    
    public void adicionaPedido(Produto produto, int num){
        try {
            adicionaPedidoException(produto, num);
        } catch (ComandaFechadaException | MesaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cancelaPedidoException(Funcionario f, Produto p, int num) throws NaoGerenteException, MesaInexistenteException, ComandaFechadaException {
        if (f.isGerente()) {
            if(num<=nMesas){
                if(mesas[num-1].getComanda().getHabilitaPedido()){
                    Comanda c = mesas[num-1].getComanda();
                    for (int i = 0; i < c.getProdutos().size(); i++) {
                        if (c.getProdutos().get(i).equals(p)) {
                           c.getProdutos().remove(i);
                           c.setPrecoTotal(mesas[num-1].getComanda().getPrecoTotal() - p.getPreco());
                        }
                    }
                } else{
                    throw new ComandaFechadaException();
                }
            } else{
                throw new MesaInexistenteException();
            }
        }else{
            throw new NaoGerenteException();
        }
    }
    
    public void cancelaPedido(Funcionario f, Produto p, int num){
        try {
            cancelaPedidoException(f, p, num);
        } catch (NaoGerenteException | MesaInexistenteException | ComandaFechadaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void imprimeComanda(int num) {
    }
    
    public void adicionaCortesiaException(Funcionario funcionario, Produto produto, int num) throws ComandaFechadaException, NaoGerenteException, MesaInexistenteException {
        if (funcionario.isGerente()) {
            if(num <= nMesas){
                if(mesas[num-1].getComanda().getHabilitaPedido()){
                    mesas[num-1].getComanda().getProdutos().add(produto);
                } else{
                    throw new ComandaFechadaException();
                }
            } else{
                throw new MesaInexistenteException();
            }
        } else{
            throw new NaoGerenteException();
        }
    }
    
    public void adicionaCortesia(Funcionario funcionario, Produto produto, int num){
        try {
            adicionaCortesiaException(funcionario, produto, num);
        } catch (ComandaFechadaException | NaoGerenteException | MesaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Mesa[] getMesas() {
        return mesas;
    }
 
    public ComandaDAO getComanda() {
        return comandaDAO;
    }

}
