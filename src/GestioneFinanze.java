import java.util.ArrayList;
import java.util.List;

public class GestioneFinanze {
    private List<Transizione> transizioni;
    private List<Categoria> categorie;
    private List<Budget> budget;

    public GestioneFinanze(){
        this.transizioni = new ArrayList<>();
        this.categorie = new ArrayList<>();
        this.budget = new ArrayList<>();
    }

    public void aggiungiTransizione(Transizione transizione){
        transizioni.add(transizione);
    }

    public void visualizzaTransizione(){
        for(Transizione transazione : transizioni){
            System.out.println(transizioni);
        }
    }

}
