/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocompositemenu;

/**
 *
 * @author 20131BSI0173
 */
public abstract class Arquivos {
    private String nome;

    public Arquivos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void inserirArquivo(Arquivos novoArquivo);
    public abstract void removerArquivo(Arquivos arquivo);
    public abstract Arquivos[] getArquivos();
    
}
