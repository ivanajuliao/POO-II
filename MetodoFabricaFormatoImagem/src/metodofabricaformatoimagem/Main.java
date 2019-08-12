/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodofabricaformatoimagem;

/**
 *
 * @author Ivana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Formato formato;
        formato = FabricaFormato.gerarFormato("jpeg");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("png");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("gif");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("bmp");
        formato.gera();
        
        
    }
    
}
