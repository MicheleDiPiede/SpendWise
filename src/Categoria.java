import java.util.List;
import java.util.ArrayList;

public class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public static List<Categoria> creaListaCategorie() {
        List<Categoria> categorie = new ArrayList<>();
        categorie.add(new Categoria("Spesa alimentare"));
        categorie.add(new Categoria("Psicologo"));
        categorie.add(new Categoria("Nutrizionista"));
        categorie.add(new Categoria("Tecnologia"));
        categorie.add(new Categoria("Shopping"));
        categorie.add(new Categoria("Intrattenimento"));
        categorie.add(new Categoria("Ristorante"));

        return categorie;
    }
}
