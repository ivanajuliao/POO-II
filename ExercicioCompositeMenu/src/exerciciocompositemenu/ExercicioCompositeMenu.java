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
public class ExercicioCompositeMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arquivos arq1 = new Arquivo("arq1");
        Arquivos arq2 = new Arquivo("arq2");
        Arquivos arq3 = new Arquivo("arq3");
        
        Arquivos pasta = new Pasta("pasta");
        pasta.inserirArquivo(arq1);
        
        Arquivos pasta2 = new Pasta("pasta2");
        pasta2.inserirArquivo(arq2);
        pasta2.inserirArquivo(arq3);
        pasta2.inserirArquivo(pasta);
        
        System.out.println("Arquivos da "+pasta.getNome());
        for(Arquivos arq: pasta.getArquivos()){
            System.out.println(arq.getNome());
        }
        
        System.out.println("\nArquivos da "+pasta2.getNome()+":");
        for(Arquivos arq: pasta2.getArquivos()){
            System.out.println( arq.getNome());
        }
    }
    
}
