package parte_1;

import java.util.Scanner;
import parte_2.Cliente1;

/**
 * @author pietro.cappellato
 */
public class Parte_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome : ");
        String nome = input.nextLine();
        System.out.println();
        System.out.print("Cognome : ");
        String cognome = input.nextLine();
        System.out.println();
        System.out.print("Dominio : ");
        String dominio = input.nextLine();
        
        Cliente1.Main(nome, cognome, dominio);
        
        
        
        //System.out.println(Internet.email("maria chiara", "lazzari", "gmail"));
        //System.out.println(Internet.homepage("lazzari", "gmail"));
        //System.out.println(Internet.userID("mariachiara", "lazzari"));
        //System.out.println(Internet.password("mariachiara", "lazzari"));
    }
}
