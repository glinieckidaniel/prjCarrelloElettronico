import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> prodotti;

    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto p) {
        this.prodotti.add(p);
    }

    public void stampaScontrino(){
        String t = "";
        for(Prodotto p : this.prodotti){
            System.out.println(p); + " | Prezzo finale : " + p.cal
        }

    }

}
