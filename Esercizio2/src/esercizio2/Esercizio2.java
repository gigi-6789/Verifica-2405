/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingarozza_luigi
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi dati = new DatiCondivisi(36);
        ThreadGenera t1=new ThreadGenera(dati);
        ThreadContaPari t2=new ThreadContaPari(dati);
        ThreadContaDispari t3=new ThreadContaDispari(dati);
        ThreadConta t4=new ThreadConta(dati);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();        
    }
    
}
