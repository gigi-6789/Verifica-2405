/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razzi;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingarozza_luigi
 */
public class ThRocciaDue extends Thread{
    private DatiCondivisi ptrDatiC;
    
    public ThRocciaDue(DatiCondivisi ptrDatiC){
        this.ptrDatiC = ptrDatiC;
    }
    
    public void run(){
        try {
            //arrivo razzo 2
            ptrDatiC.getArrivoRazzoDue().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRocciaDue.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("INIZIO DISINTEGRAZIONE roccia 2");
        Random rnd = new Random();
        try {
            Thread.sleep(rnd.nextInt(2)+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzoDue.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINE DISINTEGRAZIONE roccia 2");
    }
}
