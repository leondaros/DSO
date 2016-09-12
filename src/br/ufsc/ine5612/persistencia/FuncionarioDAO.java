/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.persistencia;

import br.ufsc.ine5612.entidades.Funcionario;
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
public class FuncionarioDAO {
    private HashMap<Integer, Funcionario> cacheFuncionarios;
    private static final String nomeArquivo = "funcionarios.dat";
    
    
    public FuncionarioDAO() {
        cacheFuncionarios = new HashMap<>();
        load();
        
        cacheFuncionarios.values();
        for(Funcionario funcionario: cacheFuncionarios.values()){
            System.out.println(funcionario.getNome());
        }
    }
    

     public HashMap<Integer,Funcionario> getCache(){
        return cacheFuncionarios;
    }
    
    public void put(Funcionario funcionario) {
        Integer login = Integer.parseInt(funcionario.getLogin());
        cacheFuncionarios.put(login, funcionario);
        persist();
        
    }

    public void remover(Integer codigo){
        cacheFuncionarios.remove(codigo);
        persist();
    }
    
    private Integer gerarCodigoTecnico() {
        return cacheFuncionarios.keySet().size();
        
    }

    public Funcionario get(Integer codigoFuncionario) {         
        return cacheFuncionarios.get(codigoFuncionario);        
    }

    public void load() {
        
        try {
            FileInputStream fIS = new FileInputStream(nomeArquivo);
            ObjectInputStream oIS = new ObjectInputStream(fIS);
            
            cacheFuncionarios = (HashMap<Integer, Funcionario>) oIS.readObject();
            
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
            
            oOS.writeObject(cacheFuncionarios);
            
            oOS.flush();
            fOS.flush();
            
            oOS.close();
            fOS.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
