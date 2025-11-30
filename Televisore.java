public class Televisore extends Prodotto{
    private int pollici;
    private boolean isSmart;

    public Televisore(String codice, String modello, double prezzoBase, int pollici, boolean isSmart) {
        super(codice, modello, prezzoBase);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }


    public double calcolaPrezzo(){
        double sovraprezzo = 0;

        if(isSmart==true){
            sovraprezzo = super.getPrezzoBase() + 100;
        }
        return sovraprezzo;
    }

    @Override
    public String toString() {
        return "\nTELEVISORE" + super.toString() +
                "pollici=" + pollici +
                ", isSmart=" + isSmart +
                '}';
    }
}
