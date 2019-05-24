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
public class ThRazzoUno extends Thread{
    private DatiCondivisi ptrDatiC;
    
    public ThRazzoUno(DatiCondivisi ptrDatiC){
        this.ptrDatiC = ptrDatiC;
    }
    
    public void run(){
        System.out.println("razzo 1 PARTITO");
        Random rnd = new Random();
        try {
            Thread.sleep(rnd.nextInt(2)+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzoDue.class.getName()).log(Level.SEVERE, null, ex);
        }
        //arrivo razzo 2
        System.out.println("roccia 1 COLPITA");
        ptrDatiC.getArrivoRazzoUno().release();
    }
}
