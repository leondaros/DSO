/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.persistencia;

import br.ufsc.ine5612.entidades.Produto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julia
 */
public class ProdutoDAO {
    private HashMap<Integer, Produto> cacheProdutos;
    private static final String nomeArquivo = "produtos.dat";
    
    
    public ProdutoDAO() {
        cacheProdutos = new HashMap<>();
        load();
        
//        cacheComandas.values();
//        for(Comanda comanda: cacheComandas.values()){
//            System.out.println(comanda.getPrecoTotal()); //mudar issoooooo
//        }
    }
    

    public HashMap<Integer,Produto> getCache(){
        return cacheProdutos;
    }
    
   public void put(Produto produto) {
       cacheProdutos.put(produto.getCodigo(), produto);
       persist();
    }
    public Integer gerarCodigoProduto(){
        return cacheProdutos.keySet().size()+1;
    }
    
    public void remover(Integer codigo){
        cacheProdutos.remove(codigo);
        persist();
    }
    
    public Produto get (Integer codigoProduto){
        return cacheProdutos.get(codigoProduto);
    }
    public void load(){
        try {
            FileInputStream fIS = new FileInputStream(nomeArquivo);
            ObjectInputStream oIS = new ObjectInputStream(fIS);
            
            cacheProdutos = (HashMap<Integer, Produto>) oIS.readObject();
            
            oIS.close();
            fIS.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir arquivo: "+nomeArquivo);
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Erro ao criar ObjectInputStream do arquivo: "+nomeArquivo);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao processar registros do arquivo: "+nomeArquivo);
            System.out.println(ex.getMessage());
        }
          
    }
    
     public void persist(){
        try {
          FileOutputStream fOS = new FileOutputStream(nomeArquivo);
          ObjectOutputStream oOS = new ObjectOutputStream(fOS);
          
          
          oOS.writeObject(cacheProdutos);
          oOS.flush();
          fOS.flush();
          
          oOS.close();
          fOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
}
