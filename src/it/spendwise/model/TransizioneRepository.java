package it.spendwise.model; //package  model;

import java.util.ArrayList;
import java.util.List;

public class TransizioneRepository {
    private List<Transizione> transazioni = new ArrayList<>();

    //aggiunge una transazione
    public void aggiungi(Transizione transazione){
        if(transazione == null){
            throw new IllegalArgumentException("Transazione non può essere null");
        }
        transazioni.add(transazione);
    }

    //restituiscce una copia immutabile della lista
    public List<Transizione> getTutteTransizioni(){
        return new ArrayList<>(transazioni); //copia per sicurezza
    }

    //filtra per tipo (ENTRATA/USCITA)
    public List<Transizione> getTransizioniPerTipo(Transizione.TipoTransizione tipo){
        List<Transizione> risultato = new ArrayList<>();
        for(Transizione t : transazioni){
            if(t.getTipo() == tipo){
                risultato.add(t);
            }
        }
        return risultato;
    }


}
