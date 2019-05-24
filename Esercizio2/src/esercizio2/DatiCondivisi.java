/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ingarozza_luigi
 */
public class DatiCondivisi {
    
    private int nPariLetti;
    private int nDispariLetti;
    private int nPariInseriti;
    private int nDispariInseriti;

    public int getN0Inseriti() {
        return n0Inseriti;
    }

    public void setN0Inseriti(int n0Inseriti) {
        this.n0Inseriti = n0Inseriti;
    }

    public int getN0Letti() {
        return n0Letti;
    }

    public void setN0Letti(int n0Letti) {
        this.n0Letti = n0Letti;
    }
    private int n0Inseriti;
    private int n0Letti;
    private int buffer;
    private int valoriDaGenerare;
    private Semaphore fineVisualizza;
    private Semaphore fineGeneraPari;
    private Semaphore fineGeneraDispari;

    public Semaphore getFineGeneraPari() {
        return fineGeneraPari;
    }

    public Semaphore getFineGeneraDispari() {
        return fineGeneraDispari;
    }

    private Semaphore fineLetturaUno;
    private Semaphore fineLetturaDue;

    public DatiCondivisi(int valoriDaGenerare) {
        this.valoriDaGenerare = valoriDaGenerare;
        fineVisualizza = new Semaphore(1);
        fineGeneraPari = new Semaphore(0);
        fineLetturaUno = new Semaphore(0);
        fineLetturaDue = new Semaphore(0);
        fineGeneraPari = new Semaphore(0);
        fineGeneraDispari = new Semaphore(0);
    }

    public Semaphore getFineVisualizza() {
        return fineVisualizza;
    }

    public Semaphore getFineGenera() {
        return fineGeneraPari;
    }

    public Semaphore getFineLetturaUno() {
        return fineLetturaUno;
    }

    public Semaphore getFineLetturaDue() {
        return fineLetturaDue;
    }
    
    public void incPariInseriti(){
        nPariInseriti++;
    }
    
    public void incDispariInseriti(){
        nDispariInseriti++;
    }   
    
    public void incNPariLetti(){
        nPariLetti++;
    }
        
    public void incNDispariLetti(){
        nDispariLetti++;
    }
        
    public int getValoriDaGenerare() {
        return valoriDaGenerare;
    }

    public void setValoriDaGenerare(int valoriDaGenerare) {
        this.valoriDaGenerare = valoriDaGenerare;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public int getNPariLetti() {
        return nPariLetti;
    }

    public int getNDispariLetti() {
        return nDispariLetti;
    }

    public int getPariInseriti() {
        return nPariInseriti;
    }

    public int getDispariInseriti() {
        return nDispariInseriti;
    }

    public int getBuffer() {
        return buffer;
    }    
    
}
