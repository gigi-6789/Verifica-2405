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
public class ThreadContaDispari extends Thread {
    
    private DatiCondivisi ptrDati;
    
    public ThreadContaDispari(DatiCondivisi dati) {
        this.ptrDati = dati;
    }    
    
}
