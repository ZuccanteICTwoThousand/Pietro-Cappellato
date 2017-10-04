package parte_2b;

/**
 *
 * @author pietro.capellato
 */
public class Esercizio_2b {

    public static void main(String[] args) {
        CD_array myCollection = new CD_array();
        // titoli
        String a = "ciao";
        String b = "hello";
        String c = "hi";
        String d = "sup";
        // autori
        String e = "garen";
        String f = "varus";
        String g = "lee sin";
        String h = "kled";
        // case
        String i = "kyrenis production";
        String l = "limone";
        String m = "mattone";
        String n = "777";
        // proprietario
        String p="paolo";
        String q="quentin";

        myCollection.addCD(a, e, i ,p);
        myCollection.addCD(a, f, i ,q);
        myCollection.addCD(b, e, l ,p);
        myCollection.addCD(b, g, i ,p);
        myCollection.addCD(c, f, n ,q);
        myCollection.addCD(d, h, m ,q);
        myCollection.addCD(d, h, l ,p);
    }

}
