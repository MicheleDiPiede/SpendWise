import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        List<Categoria> categorie = Categoria.creaListaCategorie();
        System.out.println("Categorie disponibili:");
        for (Categoria categoria : categorie) {
            System.out.println(categoria.getNome());
       /* Categoria[] categorie = {
                new Categoria("Spesa alimentare"),
                new Categoria("Psicologo"),
                new Categoria("Nutrizionista"),
                new Categoria("Tecnologia"),
                new Categoria("Shopping"),
                new Categoria("Intrattenimento"),
                new Categoria("Ristorante")
        };*/

            //Transizione transizione = Transizione.inserisciTransizione(scanner, categorie);
            //System.out.println("Transizione inserita: " + transizione);

            //scanner.close();
        }
    }
}
