package parte_1;

/**
 *
 * @author pietro.cappellato
 */
public class CD {

    String titolo, autore, casa, proprietario;

    CD() {
        titolo = "";
        autore = "";
        casa = "";
    }

    CD(String titolo, String autore, String casa) {
        creaCD(titolo, autore, casa);
        proprietario="nessuno(letteralmente)";
    }

    CD(String titolo, String autore, String casa, String proprietario) {
        creaCD(titolo, autore, casa);
        setProprietario(proprietario);
    }

    public void creaCD(String titolo, String autore, String casa) {
        setTitolo(titolo);
        setAutore(autore);
        setCasa(casa);
    }

    //metodi stampa
    public void stampaCD() {
        System.out.println("Titolo: " + getTitolo());
        System.out.println("Autore: " + getAutore());
        System.out.println("Casa Discografica: " + getCasa());
    }

    public void stampaProprietario() {
        stampaCD();
        System.out.println("Proprietario: "+getProprietario());
    }

    //metodi set
    public void setProprietario(String p) {
        proprietario = p;
    }

    public void setTitolo(String t) {
        titolo = t;
    }

    public void setAutore(String a) {
        autore = a;
    }

    public void setCasa(String c) {
        casa = c;
    }

    //metodi get
    public String getProprietario() {
        return proprietario;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getCasa() {
        return casa;
    }
}
