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
public class ContaPoupança extends Conta{
    
    private double juros;

    public ContaPoupança(double juros, double saldo) {
        super(saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
    
}
