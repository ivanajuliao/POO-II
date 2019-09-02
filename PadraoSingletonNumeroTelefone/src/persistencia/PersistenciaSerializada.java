/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 20131BSI0173
 */
public class PersistenciaSerializada {
    public void salvarObjeto(Object objNome) throws IOException {
        String atual = new java.io.File(".").getCanonicalPath();
        FileOutputStream arqSerializado = new FileOutputStream(
            atual + "\\src\\" + objNome.getClass().getSimpleName() + ".ser");
        ObjectOutputStream outputSerializado = new ObjectOutputStream(arqSerializado);
        outputSerializado.writeObject(objNome);
        outputSerializado.close();
        System.out.println("Arquivo gerado em: \\src\\" + objNome.getClass().getSimpleName()+".ser");
    }
    
    public Object recuperarObjeto(Class classe) throws IOException, ClassNotFoundException {
        String atual = new java.io.File(".").getCanonicalPath();
        String nomeClasse = classe.getSimpleName();
        FileInputStream arqIn = new FileInputStream(
                atual + "\\src\\" + nomeClasse + ".ser");
        ObjectInputStream in = new ObjectInputStream(arqIn);
        Object obj = in.readObject();
        in.close();
        return obj;
    }
}
