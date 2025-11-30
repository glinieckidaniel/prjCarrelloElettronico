public class SmartPhone extends Prodotto{
    private int memoriaGB;
    private boolean isUsato;

    public SmartPhone(String codice, String modello, double prezzoBase, int memoriaGB, boolean isUsato) {
        super(codice, modello, prezzoBase);
        this.memoriaGB = memoriaGB;
        this.isUsato = isUsato;
    }

    private double calcolaPrezzo(){
        double prezzoConSconto = 0;
        if(isUsato==true){
           prezzoConSconto = super.getPrezzoBase() * 0.80;
        }
        return prezzoConSconto;
    }

    @Override
    public String toString() {
        return "\nSMART PHONE" +super.toString() +
                "memoriaGB=" + memoriaGB +
                ", isUsato=" + isUsato +
                '}';
    }
}
