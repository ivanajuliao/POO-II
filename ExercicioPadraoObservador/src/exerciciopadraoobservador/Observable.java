/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopadraoobservador;

import java.util.ArrayList;

/**
 *
 * @author 20131BSI0173
 */
public class Observable {
    private ArrayList<Observer> monitores = new ArrayList();

    public void addObservador(Observer ob) {
        this.monitores.add(ob);
    }
    
    public void deleteObservador(Observer ob) {
        this.deleteObservador(ob);
    }
    
    public void notificarObservador() {
        for(Observer ob : monitores){
            ob.update(this);
        }
    }
}
