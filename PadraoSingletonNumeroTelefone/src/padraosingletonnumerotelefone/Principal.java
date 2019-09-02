/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraosingletonnumerotelefone;

import java.io.IOException;
import persistencia.PersistenciaSerializada;

/**
 *
 * @author 20131BSI0173
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        
        GeradorDeNumerosUnicos gerador = GeradorDeNumerosUnicos.getNumero();
        persistencia.PersistenciaSerializada persistencia = new PersistenciaSerializada();
        
//        System.out.println("Próximo número: "+ gerador.getProximoNumero());
//        System.out.println("Próximo número: "+ gerador.getProximoNumero());
//        System.out.println("Próximo número: "+ gerador.getProximoNumero());
       
        persistencia.salvarObjeto(gerador);
        
        GeradorDeNumerosUnicos numeroRecuperado = (GeradorDeNumerosUnicos) persistencia.recuperarObjeto(GeradorDeNumerosUnicos.class);
        numeroRecuperado.listarNumeros(5);
    }
    
}
