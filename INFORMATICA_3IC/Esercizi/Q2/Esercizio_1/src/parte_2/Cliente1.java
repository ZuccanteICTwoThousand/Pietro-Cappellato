package parte_2;

import parte_1.Internet;

/**
 *
 * @author pietro.cappellato
 */
public class Cliente1 {

    public static void Main(String nome, String cognome, String dominio) {

        System.out.print("EMAIL : ");
        System.out.println(Internet.email(nome, cognome, dominio));
        System.out.print("HOMEPAGE : ");
        System.out.println(Internet.homepage(cognome, dominio));
        System.out.print("UserID : ");
        System.out.println(Internet.userID(nome, cognome));
        System.out.print("PASSWORD : ");
        System.out.println(Internet.password(nome, cognome));
    }
}
