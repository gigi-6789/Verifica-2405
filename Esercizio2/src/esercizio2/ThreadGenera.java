/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author ingarozza_luigi
 */
public class ThreadGenera extends Thread {
    
    private DatiCondivisi ptrDati;
    
    public ThreadGenera(DatiCondivisi dati) {
        this.ptrDati = dati;
    }    
    
}
