/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Categoria;
import br.ufsc.ine5612.entidades.Produto;
import br.ufsc.ine5612.persistencia.ProdutoDAO;

/**
 *
 * @author aluno
 */
public class ControladorMenu {
    private ProdutoDAO produtoDAO;
    
    public ControladorMenu(){
        produtoDAO = new ProdutoDAO();
    }
    
    public Produto adicionarProduto(String titulo, double preco, Categoria c){
        Produto produto = new Produto(titulo, preco, c);
        Integer codigo = produtoDAO.gerarCodigoProduto();
        produto.setCodigo(codigo);
        produtoDAO.put(produto);
        return produto;
    }
    
  
}
