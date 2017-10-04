package parte_1;

/**
 *
 * @author pietro.capellato
 */
public class Esercizio_2 {

    public static void main(String[] args) {
        CD blitz = new CD();
        CD lello = new CD("lello spara", "lello", "kyrenis production");

        lello.stampaProprietario();
        System.out.println("----------------------------------------");
        lello.setProprietario("La maronne");
        lello.setTitolo("maronne valzer");
        lello.stampaProprietario();
        System.out.println("----------------------------------------");
        
        CD garenno = new CD("vayne main", "garenno", "kyrenis production", "kyrenis");

        garenno.stampaProprietario();
        System.out.println("----------------------------------------");
        garenno.setProprietario("La maronne");
        garenno.setTitolo("maronne valzer");
        garenno.stampaProprietario();
    }

}
