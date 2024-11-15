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
public abstract class Box {
    // DA COMPLETARE
    public int maxPosti;
    private String nome;

    
    public Box(int maxPosti, String nome) {
               // DA COMPLETARE
            this.maxPosti=maxPosti;
            this.nome=nome;
            
    }

    public int getMaxPosti() {
             // DA COMPLETARE
             return maxPosti;
    }

    public void setMaxPosti(int maxPosti) {
               // DA COMPLETARE
               this.maxPosti=maxPosti;
    }

    public String getNome() {
               // DA COMPLETARE
               return this.nome;
    }

    public void setNome(String nome) {
                // DA COMPLETARE
                this.nome=nome;
    }

    public abstract void entra(Veicolo v) throws BoxException;

    public abstract Veicolo esce() throws BoxException;

    @Override
    public String toString() {
        return "Nome:"+nome+" Capienza: "+maxPosti;
        // DA COMPLETARE
    }
    
}
