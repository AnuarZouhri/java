/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione;
import it.unisa.diem.oop.veicoli.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anuar
 */
// QUESTO FILE NON VA MODIFICATO

public class TestRimessa {

    public static void main(String[] args) {
        Autorimessa autorimessa = new Autorimessa(2, "Parcheggio E1");
 
       try {
            autorimessa.entra(new Camion("spl265", "Volvo PTG", "Gasolio", "YH96671", 6));
        } catch (AutorimessaPienaException | TargaNonValidaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            autorimessa.entra(new Autovettura("cgt612", "Fiat Idea", "Gasolio", "AQ9Y7UUU", 5));
        } catch (AutorimessaPienaException | TargaNonValidaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            autorimessa.entra(new Moto("gdt7896", "Suzuki Bandit", "Benzina", "AT5123N", false));
        } catch (AutorimessaPienaException | TargaNonValidaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            autorimessa.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
            autorimessa.entra(new Autovettura("mk23t", "Fiat Punto", "Metano", "EA566FM", 5));
            autorimessa.entra(new Moto("das7896", "Honda Hornet", "Benzina", "AT51233", false));
        } catch (AutorimessaPienaException | TargaNonValidaException ex) {
            System.out.println(ex.getMessage());
        }
        

        System.out.print(autorimessa);

        try {
            autorimessa.esce();
            autorimessa.esce();
            autorimessa.esce();
        } catch (AutorimessaVuotaException ex) {
            System.out.println(ex.getMessage());
        }
         System.out.print(autorimessa);
    }

}
