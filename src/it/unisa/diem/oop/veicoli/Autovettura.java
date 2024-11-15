/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.veicoli;

/**
 *
 * @author anuar
 */
public class Autovettura extends Veicolo {
    private final int numeroPosti;
    
    
    
    
    
    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti=numeroPosti;
    }
    
    public int getNumeroPosti(){
        return this.numeroPosti;
    }
    
    
    
    
    @Override
    public boolean controllaTarga() {
        return this.getTarga().matches("[A-Z]{2}[0-9]{3}[A-Z]{2}");
    }
    @Override
    public String toString(){
        return "Moto "+super.toString()+" Numero posti: "+this.numeroPosti;
    }
}
