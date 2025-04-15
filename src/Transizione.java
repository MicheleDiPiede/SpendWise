
import java.util.Scanner;

public class Transizione {

    private String data, descrizione;
    private Categoria categoria;
    private double importo;
    private TipoTransizione tipo;

    public Transizione(String data, String descrizione, Categoria categoria, double importo, TipoTransizione tipo){
        this.data = data;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.importo = importo;
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public TipoTransizione getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransizione tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Descrizione: " + descrizione + ", Importo: " + importo + ", Categoria: " + categoria.getNome() + ", Tipo: " + tipo;
    }

    public enum TipoTransizione{
        ENTRATA, USCITA
    }

    public static Transizione inserisciTransizione(Scanner scanner, Categoria[] categorie ){
        System.out.print("Data (AAAA-MM-GG): ");
        String data = scanner.nextLine();

        System.out.print("Descrizione: ");
        String descrizione = scanner.nextLine();

        System.out.print("Importo: ");
        double importo = scanner.nextDouble();
        scanner.nextLine(); // Consuma il newline

        System.out.println("Categorie disponibili:");
        for (int i = 0; i < categorie.length; i++) {
            System.out.println((i + 1) + ". " + categorie[i].getNome());
        }

        System.out.print("Seleziona categoria (numero): ");
        int sceltaCategoria = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        Categoria categoria = categorie[sceltaCategoria - 1];

        System.out.print("Tipo (ENTRATA/USCITA): ");
        TipoTransizione tipo = TipoTransizione.valueOf(scanner.nextLine().toUpperCase());

        return new Transizione(data, descrizione, categoria, importo, tipo);
    }
}
