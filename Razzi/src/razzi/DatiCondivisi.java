/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razzi;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ingarozza_luigi
 */
public class DatiCondivisi {
    private Semaphore arrivoRazzoUno;
    private Semaphore arrivoRazzoDue;

    public Semaphore getArrivoRazzoUno() {
        return arrivoRazzoUno;
    }

    public void setArrivoRazzoUno(Semaphore arrivoRazzoUno) {
        this.arrivoRazzoUno = arrivoRazzoUno;
    }

    public Semaphore getArrivoRazzoDue() {
        return arrivoRazzoDue;
    }

    public void setArrivoRazzoDue(Semaphore arrivoRazzoDue) {
        this.arrivoRazzoDue = arrivoRazzoDue;
    }

    public DatiCondivisi() {
        arrivoRazzoUno = new Semaphore(0);
        arrivoRazzoDue = new Semaphore(0);
    }
}
