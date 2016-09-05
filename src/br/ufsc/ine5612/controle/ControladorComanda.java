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
<<<<<<< HEAD

    private final int nMesas = 4;
    private Mesa[] mesas;
    private Mesa mesa;

    public ControladorComanda() {
        mesas = new Mesa[nMesas];
    }

    public Mesa selecionaMesa(int i) {
        mesa = mesas[i - 1];
        return mesas[i - 1];
    }

=======
    private final int nMesas = 4;
    private Mesa[] mesas;
    private Mesa mesa;
    public ControladorComanda() {
        mesas = new Mesa[nMesas];
    }
    public Mesa selecionaMesa(int i) {
        mesa = mesas[i - 1];
        return mesas[i - 1];
    }
>>>>>>> master
    public void abreMesa(Funcionario f, int i) {
        mesa = new Mesa(i);
        mesa.setFuncionario(f);
        mesa.setOcupada(true);
        mesa.setComanda(new Comanda());
        mesas[i - 1] = mesa;
    }
<<<<<<< HEAD

=======
>>>>>>> master
    public void encerrerMesa(Funcionario f,Mesa m) {
        //apenas gerente
        if (f.isGerente()) {
            m.setOcupada(false);
            m.setComanda(null);
            m.setFuncionario(null);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> master
    public void adicionaPedido(Produto p) {
        mesa.getComanda().getProdutos().add(p);
        mesa.getComanda().setPrecoTotal(mesa.getComanda().getPrecoTotal() + p.getPreco());
    }
<<<<<<< HEAD

=======
>>>>>>> master
    public void cancelaPedido(Produto p) {
        //apenas gerente
        Comanda c = mesa.getComanda();
        for (int i = 0; i < c.getProdutos().size(); i++) {
            if (c.getProdutos().get(i).equals(p)) {
                mesa.getComanda().getProdutos().remove(i);
                mesa.getComanda().setPrecoTotal(mesa.getComanda().getPrecoTotal() - p.getPreco());
            }
        }
    }
<<<<<<< HEAD

    public void imprimeComanda(Comanda c) {

    }

    public void adicionaCortesia(Comanda c) {
        //apensa gerente
    }

    public void armazenaComanda(Comanda c) {

=======
    public void imprimeComanda(Comanda c) {
    }
    public void adicionaCortesia(Comanda c) {
        //apensa gerente
    }
    public void armazenaComanda(Comanda c) {
>>>>>>> master
    }
    public Mesa[] getMesas() {
        return mesas;
    }
    public void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }
<<<<<<< HEAD

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
=======
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
>>>>>>> master
