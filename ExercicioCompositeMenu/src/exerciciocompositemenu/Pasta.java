/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocompositemenu;

import java.util.ArrayList;

/**
 *
 * @author 20131BSI0173
 */
public class Pasta extends Arquivos {
    
    public ArrayList<Arquivos> listaDeArquivos;

    public Pasta(String nome) {
        super(nome);
        this.listaDeArquivos = new ArrayList<Arquivos>();
    }
   
    public void inserirArquivo(Arquivos novoArquivo){
        this.listaDeArquivos.add(novoArquivo);
    }
    
    public void removerArquivo(Arquivos arquivo){
        this.listaDeArquivos.remove(arquivo);
        
    }
    public Arquivos[] getArquivos(){
        return this.listaDeArquivos.toArray(new Arquivos[listaDeArquivos.size()]);
    }
    
}
