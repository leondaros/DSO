/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.persistencia;

import br.ufsc.ine5612.entidades.Comanda;
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
public class ComandaDAO {
    private HashMap<Integer, Comanda> cacheComandas;
    private static final String nomeArquivo = "comandas.dat";
    
    
    public ComandaDAO() {
        cacheComandas = new HashMap<>();
        load();
    }
    

    public HashMap<Integer,Comanda> getCache(){
        return cacheComandas;
    }
    
   public void put(Comanda comanda) {
       cacheComandas.put(comanda.getCodigo(), comanda);
       persist();
    }
   
    public Integer gerarCodigoComanda(){
        return cacheComandas.keySet().size()+1;
    }

   
    public void remover(Integer codigo){
        cacheComandas.remove(codigo);
        persist();
    }
    
    public Comanda get (Integer codigoComanda){
        return cacheComandas.get(codigoComanda);
    }
    public void load(){
        try {
            FileInputStream fIS = new FileInputStream(nomeArquivo);
            ObjectInputStream oIS = new ObjectInputStream(fIS);
            
            cacheComandas = (HashMap<Integer, Comanda>) oIS.readObject();
            
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
          
          
          oOS.writeObject(cacheComandas);
          oOS.flush();
          fOS.flush();
          
          oOS.close();
          fOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
}
