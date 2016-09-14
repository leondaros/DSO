/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import static br.ufsc.ine5612.entidades.Categoria.BEBIDA;
import static br.ufsc.ine5612.entidades.Categoria.COMIDA;
import static br.ufsc.ine5612.entidades.Categoria.SOBREMESA;
import br.ufsc.ine5612.entidades.Menu;
import br.ufsc.ine5612.entidades.Produto;
import br.ufsc.ine5612.excecao.ProdutoInexistenteException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ControladorMenu {
    private Menu menu;
    
    public ControladorMenu(){
        menu = new Menu();
        adicionarProdutos();
    }
    
//    public Produto adicionarProduto(String titulo, double preco, Categoria c){
//        Produto produto = new Produto(titulo, preco, c);
//        Integer codigo = produtoDAO.gerarCodigoProduto();
//        produto.setCodigo(codigo);
//        produtoDAO.put(produto);
//        return produto;
//    }
    
    public void adicionarProdutos(){
        Produto comida1 = new Produto("Pizza", 30, COMIDA);
        Produto comida2 = new Produto("Lasanha", 20, COMIDA);
        Produto comida3 = new Produto("Macarrão", 25, COMIDA);
        this.menu.setComida(comida1);
        this.menu.setComida(comida2);
        this.menu.setComida(comida3);
        
        Produto bebida1 = new Produto("Cerveja", 5, BEBIDA);
        Produto bebida2 = new Produto("Vinho", 20, BEBIDA);
        Produto bebida3 = new Produto("Café", 3, BEBIDA);
        Produto bebida4 = new Produto("Chocolate Quente", 3, BEBIDA);
        Produto bebida5 = new Produto("Chá", 2, BEBIDA);
        Produto bebida6 = new Produto("Marguerita", 15, BEBIDA);
        Produto bebida7 = new Produto("Gim tônica", 15, BEBIDA);
        Produto bebida8 = new Produto("Água", 2, BEBIDA);
        Produto bebida9 = new Produto("Tequila", 10, BEBIDA);
        this.menu.setBebida(bebida1);
        this.menu.setBebida(bebida2);
        this.menu.setBebida(bebida3);
        this.menu.setBebida(bebida4);
        this.menu.setBebida(bebida5);
        this.menu.setBebida(bebida6);
        this.menu.setBebida(bebida7);
        this.menu.setBebida(bebida8);
        this.menu.setBebida(bebida9);
        
        Produto sobremesa1 = new Produto("Pudim", 8, SOBREMESA);
        Produto sobremesa2 = new Produto("Bolo", 10, SOBREMESA);
        Produto sobremesa3 = new Produto("Torta", 8, SOBREMESA);
        this.menu.setSobremesa(sobremesa1);
        this.menu.setSobremesa(sobremesa2);
    }
    
    public Menu getMenu(){
        return menu;
    }
    
    public Produto getComidaMenuException(String titulo) throws ProdutoInexistenteException{
        int qtd = menu.getComidas().size();
        Produto produto = null;
        for(int i = 0; i <= qtd ; i++){
            produto = menu.getComidas().get(i);
            if(produto.getTitulo().equals(titulo)){
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso","WARNING", JOptionPane.WARNING_MESSAGE);
                return produto;
            }
        }
        
        throw new ProdutoInexistenteException();
    }
    
    public Produto getComidaMenu(String titulo){
        Produto produto = null;
        try {
           produto = getComidaMenuException(titulo);
        } catch (ProdutoInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }
    
    public Produto getBebidaMenuException(String titulo) throws ProdutoInexistenteException{
        int qtd = menu.getBebidas().size();
        Produto produto = null;
        for(int i = 0; i <= qtd ; i++){
            produto = menu.getBebidas().get(i);
            if(produto.getTitulo().equals(titulo)){
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso","WARNING", JOptionPane.WARNING_MESSAGE);
                return produto;
            }
        }

        return produto;
    }
    
    public Produto getBebidaMenu(String titulo){
        Produto produto = null;
        try {
           produto = getBebidaMenuException(titulo);
        } catch (ProdutoInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }
        
    public Produto getSobremesaMenuException(String titulo) throws ProdutoInexistenteException{
        int qtd = menu.getSobremesas().size();
        Produto produto = null;
        for(int i = 0; i <= qtd ; i++){
            produto = menu.getSobremesas().get(i);
            if(produto.getTitulo().equals(titulo)){
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso","WARNING", JOptionPane.WARNING_MESSAGE);
                return produto;
            }
        }
        return produto;
    }
    
      public Produto getSobremesaMenu(String titulo){
        Produto produto = null;
        try {
           produto = getSobremesaMenuException(titulo);
        } catch (ProdutoInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }
  
}
