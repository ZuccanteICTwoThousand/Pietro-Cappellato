package isolamentonum;
import java.util.Scanner;
import java.lang.Math;

public class IsolamentoNum {
    public static void main(String[] args) {
        String stringa = new String();
		Scanner input = new Scanner(System.in);

		stringa = input.nextLine();

		System.out.print(IsolamentoNumero(stringa));
    }

	public static int IsolamentoNumero(String stringa){
		int risultato, /*numero,*/ i, j;

		j=0; risultato=0;
		for (i=stringa.length()-1; i>=0; i--){
			if(stringa.charAt(i)<58 && stringa.charAt(i)>47){
				risultato += (stringa.charAt(i)-48)*(Math.pow(10, j));
				j++;
			}
		}

		return risultato;
	}
}
