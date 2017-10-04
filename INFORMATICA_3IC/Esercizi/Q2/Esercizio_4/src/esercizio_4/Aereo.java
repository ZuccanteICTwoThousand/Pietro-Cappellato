/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio_4;

/**
 *
 * @author pietro.cappellato
 */
public class Aereo {

    String modello, identificativo, compagnia;
    String Undefinized = null;

    Aereo(String modello, String identificativo) {
        setModello(modello);
        setIdentificativo(identificativo);
        setCompagnia(Undefinized);
    }

    Aereo(String modello, String identificativo, String compagnia) {
        setModello(modello);
        setIdentificativo(identificativo);
        setCompagnia(compagnia);
    }

    void setModello(String modello) {
        this.modello = modello;
    }

    void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    String getModello() {
        return this.modello;
    }

    String getIdentificativo() {
        return this.identificativo;
    }

    String getCompagnia() {
        return this.compagnia;
    }
}
