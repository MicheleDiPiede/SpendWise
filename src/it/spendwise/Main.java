package it.spendwise;

import it.spendwise.model.GestioneFinanze;
import it.spendwise.model.Categoria;
import it.spendwise.model.Transizione;


public class Main {

    public static void main(String[] args) {
        // 1. Crea una categoria (usa la tua classe esistente)
        Categoria catSpesa = new Categoria("Spesa alimentare");

        // 2. Crea la transazione COME FAI DI SOLITO
        Transizione t = new Transizione(
                "2023-11-21",          // Data come String
                "Acquisto pane",       // Descrizione
                catSpesa,              // it.spendwise.model.Categoria
                3.50,                  // Importo
                Transizione.TipoTransizione.USCITA  // Tipo
        );

        // 3. Usa it.spendwise.model.GestioneFinanze come prima
        GestioneFinanze gf = new GestioneFinanze();
        gf.aggiungiTransizione(t);

        System.out.println("Transazione aggiunta: " + t);
    }
}
