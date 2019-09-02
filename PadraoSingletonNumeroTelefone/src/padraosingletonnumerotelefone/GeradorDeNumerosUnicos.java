/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraosingletonnumerotelefone;

import java.io.Serializable;

/**
 *
 * @author 20131BSI0173
 */
public class GeradorDeNumerosUnicos implements Serializable{
    private static GeradorDeNumerosUnicos numero;

    public synchronized static GeradorDeNumerosUnicos getNumero() {
        if(numero == null){
            numero = new GeradorDeNumerosUnicos();
        }
        
        return numero;
    }
    private int count;

    private GeradorDeNumerosUnicos() {
        this.count = 999990101;
    }
    
    public synchronized  int getProximoNumero(){
        return ++count;
    }
     
    public void listarNumeros(int qtd){
        for (int i = 0; i < qtd; i++) {
            System.out.println("Numero: " + getProximoNumero());
        }
    }
}
