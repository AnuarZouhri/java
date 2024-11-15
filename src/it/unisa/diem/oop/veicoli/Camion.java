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
public class Camion extends Veicolo {
    private final int numeroAssi;
    
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi){
    
        super(numTelaio,modello,alimentazione,targa);
        this.numeroAssi=numeroAssi;
    }
    
    public int getNumeroAssi(){
        return numeroAssi;
    }
    
    public boolean controllaTarga(){
        return this.getTarga().matches("[A-Z]{2}[0-9]{6}");
    }
    
    @Override
    public String toString(){
        return "Camion: "+super.toString()+" NumeroAssi"+this.numeroAssi+" assi";
    }
    
    
    
}
