package frasipalindrome;
import java.util.Scanner;

public class FrasiPalindrome {
    public static void main(String[] args) {
        String stringa = new String();
		Scanner input = new Scanner(System.in);

		stringa = input.nextLine();

		System.out.print(isPalindrome(stringa));

    }

	public static boolean isPalindrome(String stringa){
		int i, j;
		boolean is=true;
		String newStringa = new String();

		stringa = stringa.toLowerCase();
		stringa = EliminatoreSpazi(stringa);

		j=stringa.length()-1;
		i=0;
		while (i<j && is){
			if(stringa.charAt(i)!=stringa.charAt(j)){
				is = false;
			}
			i++; j--;
		}

		return is;
	}

	public static String EliminatoreSpazi(String stringaIn){
		String stringaOut = new String();

		for (int i=stringaIn.length()-1; i>=0; i--){
			if (stringaIn.charAt(i)!=' ') stringaOut = stringaOut + stringaIn.charAt(i);
		}

		return stringaOut;
	}

}
