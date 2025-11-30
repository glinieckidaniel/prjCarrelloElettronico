public class Prodotto {
    private String codice;
    private String modello;
    private double prezzoBase;

    public Prodotto(String codice, String modello, double prezzoBase) {

        if(prezzoBase < 0){
            throw new IllegalArgumentException("Prezzo non valido.");
        }
        this.codice = codice;
        this.modello = modello;
        this.prezzoBase = prezzoBase;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }


    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                ", modello='" + modello + '\'' +
                ", prezzoBase=" + prezzoBase +
                '}';
    }
}
