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
public class ThreadContaDispari extends Thread {
    
    private DatiCondivisi ptrDati;
    
    public ThreadContaDispari(DatiCondivisi dati) {
        this.ptrDati = dati;
    }    
    public void run(){
        for(int i = 0; i < ptrDati.getValoriDaGenerare();i++){
            try {
                //fine genera
                ptrDati.getFineGeneraDispari().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadContaDispari.class.getName()).log(Level.SEVERE, null, ex);
            }
        int numero = ptrDati.getBuffer();

        if((numero%2==1)&&(numero!=0)){
            ptrDati.incNDispariLetti();
        }
        }
        //fine lettura
        ptrDati.getFineLetturaDue().release();
    }
    
}
