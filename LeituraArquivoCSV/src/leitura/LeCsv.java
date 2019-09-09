package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LeCsv {

    public LinkedList<Cliente> leCsvClientes() throws IOException {

        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        String current = new java.io.File(".").getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo_teste.csv");
        FileReader in = new FileReader(inputFile);
        
        String dado = "";
        int c;
        
        while ((c = in.read()) != -1) {
            c = in.read();
            dado += (char)c;    
  
        }
        System.out.println(dado);
        in.close();

        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        return clientes;
    }
}
