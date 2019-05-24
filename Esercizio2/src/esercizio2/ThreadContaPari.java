/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingarozza_luigi
 */
public class ThreadContaPari extends Thread {
    
    private DatiCondivisi ptrDati;
    
    public ThreadContaPari(DatiCondivisi dati) {
        this.ptrDati = dati;
    }  
    
    public void run(){
        for(int i = 0; i < ptrDati.getValoriDaGenerare();i++){
            try {
                //fine genera
                ptrDati.getFineGeneraPari().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadContaPari.class.getName()).log(Level.SEVERE, null, ex);
            }
        int numero = ptrDati.getBuffer();

        if((numero%2==0)&&(numero!=0)){
            ptrDati.incNPariLetti();
        }
        }
        //fine lettura
        ptrDati.getFineLetturaUno().release();
    }    
}
