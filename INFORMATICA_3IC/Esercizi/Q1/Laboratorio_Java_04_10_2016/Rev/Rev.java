package rev;
import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        String stringa = new String();
		Scanner input = new Scanner(System.in);

		stringa = input.nextLine();

		System.out.print(Reverse(stringa));
    }

	public static String Reverse (String stringaIn){
		String stringaOut = new String();
		for (int i=stringaIn.length()-1; i>=0; i--){
			stringaOut = stringaOut + stringaIn.charAt(i);
		}

		return stringaOut;
	}

}
