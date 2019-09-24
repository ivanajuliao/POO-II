package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class LeCsv {

    @SuppressWarnings("empty-statement")
    public LinkedList<Cliente> leCsvClientes() throws IOException {
        
        LinkedList<Cliente> clientes = new LinkedList<>();
        String current = new java.io.File(".").getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo_teste.csv");
        try (FileReader in = new FileReader(inputFile)) {
            String linhas = "";
            int c;

            while ((c = in.read()) != -1) {
                linhas += (char) c;
            }
            String[] arr_linha = linhas.split("\n");
            for (int i = 1; i < arr_linha.length; i++) {
                
                String[] arr_dado = arr_linha[i].split(";"); 
                Cliente cliente = new Cliente();
                
                cliente.setId(arr_dado[0]);
                cliente.setNome(arr_dado[1]);
                cliente.setEmail(arr_dado[2]);
                cliente.setData_nasc(arr_dado[3]);
                cliente.setTelefone(arr_dado[4]);
                cliente.setTotalCompras(Double.parseDouble(arr_dado[5]));

                clientes.addLast(cliente);
                
            }

        }
       
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        return clientes;
    }
}
