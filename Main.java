//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carrello spesa = new Carrello();

        try{
            spesa.aggiungiProdotto(new SmartPhone("45F2","Samsung",253,55,true));
            spesa.aggiungiProdotto(new Televisore("63H35","LG",999.98,45,true));

            spesa.stampaScontrino();

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}