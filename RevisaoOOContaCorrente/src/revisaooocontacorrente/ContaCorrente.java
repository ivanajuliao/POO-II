/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaooocontacorrente;

/**
 *
 * @author 20131bsi0173
 */
public class ContaCorrente extends Conta implements ITributavel{
    
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double cauculaTributos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
