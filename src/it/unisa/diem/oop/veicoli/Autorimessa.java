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
public class Autorimessa extends Box {

  // COMPLETARE DEFINENDO GLI ATTRIBUTI NECESSARI
    Veicolo[] veicoli;
    private int testa;
    private int coda;
    private int riemp;
  
    public Autorimessa(int maxPosti, String nome) {
        
        super(maxPosti,nome);
        testa=0;
        coda=0;
        riemp=0;
        veicoli = new Veicolo[maxPosti];
        // DA COMPLETARE
    }

    private boolean autorimessaPiena(){
            return riemp==maxPosti;     
    }

    private boolean autorimessaVuota() {
                // DA COMPLETAREù       
            return riemp==0;
    }

    @Override
    public void entra(Veicolo v)  throws AutorimessaPienaException, TargaNonValidaException{
        if (autorimessaPiena()) {
            throw new AutorimessaPienaException("Autorimessa piena. Ingresso vietato.");
        }
        if (!v.controllaTarga()) {
            throw new TargaNonValidaException("Targa non valida. Ingresso vietato.");
        }
        veicoli[coda]=v;
        coda=(coda+1)%maxPosti;
        riemp++;
        
                // DA COMPLETARE
            
    }

    @Override
    public Veicolo esce()  throws AutorimessaVuotaException{
        if(autorimessaVuota()){
            throw new AutorimessaVuotaException("Autorimessa Vuota. Uscita vietata.");
        }
        Veicolo v=veicoli[testa];
        riemp--;
        testa=(testa+1)%maxPosti;
        return  v;
        
                // DA COMPLETARE
    }

    @Override
    public String toString() {
        StringBuffer p=new StringBuffer(super.toString()+"\nVeicoli Presenti:\n");
 
        for(int i=0;i<riemp;i++){
            p.append(veicoli[(testa+i)%veicoli.length]+"\n");
        }
        return p.toString();
        
                // DA COMPLETARE
    }

}
