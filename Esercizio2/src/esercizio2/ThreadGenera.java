/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingarozza_luigi
 */
public class ThreadGenera extends Thread {
    
    private DatiCondivisi ptrDati;
    
    public ThreadGenera(DatiCondivisi dati) {
        this.ptrDati = dati;
    } 
    
     public void run(){
        Random rnd = new Random();
        for(int i = 0; i < ptrDati.getValoriDaGenerare(); i++){
            try {
                //visulizza
                ptrDati.getFineVisualizza().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadGenera.class.getName()).log(Level.SEVERE, null, ex);
            }
        int random=0;    
        random = rnd.nextInt(36);
        ptrDati.setBuffer(random);
        int numero = random;

        if((numero%2==0)&&(numero!=0)){
            ptrDati.incPariInseriti();
        }
        if((numero%2==1)&&(numero!=0)){
            ptrDati.incDispariInseriti();
        }
        

        //fine genera x2
        ptrDati.getFineGeneraPari().release();
        ptrDati.getFineGeneraDispari().release();
        }
        
    }   
    
}
