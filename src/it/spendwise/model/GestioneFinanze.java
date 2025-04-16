package it.spendwise.model;

import it.spendwise.model.TransizioneRepository;
import java.util.ArrayList;
import java.util.List;

public class GestioneFinanze {
    private List<Transizione> transizioni;
    private List<Categoria> categorie;
    private List<Budget> budget;
    private TransizioneRepository repository = new TransizioneRepository();

    public GestioneFinanze(){
        this.transizioni = new ArrayList<>();
        this.categorie = new ArrayList<>();
        this.budget = new ArrayList<>();
    }

    public void aggiungiTransizione(Transizione transazione){
        repository.aggiungi(transazione);
        System.out.println("Transazione aggiunta: " + transazione);
    }

    public List<Transizione> getTransizioni() {
        return repository.getTutteTransizioni();
    }
}
