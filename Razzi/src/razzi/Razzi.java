/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razzi;

import java.util.Scanner;

/**
 *
 * @author ingarozza_luigi
 */
public class Razzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi dati = new DatiCondivisi();
        ThRazzoDue thRazzoDue = new ThRazzoDue(dati);
        ThRazzoUno thRazzoUno = new ThRazzoUno(dati);
        ThRocciaDue thRocciaDue = new ThRocciaDue(dati);
        ThRocciaUno thRocciaUno = new ThRocciaUno(dati);
        Scanner input = new Scanner(System.in);
        if((input.next().equals("S") == true)){
            thRazzoDue.start();
            thRazzoUno.start();
            thRocciaDue.start();
            thRocciaUno.start();
        }
    }
    
}
