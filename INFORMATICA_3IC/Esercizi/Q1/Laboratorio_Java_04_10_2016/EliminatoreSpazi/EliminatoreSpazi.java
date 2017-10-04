package eliminatorespazi;
import java.util.Scanner;

public class EliminatoreSpazi {
    public static void main(String[] args) {
        String stringa = new String();
		Scanner input = new Scanner(System.in);

		stringa = input.nextLine();

		System.out.print(EliminatoreDegliSpazi(stringa));
    }

	public static String EliminatoreDegliSpazi(String stringaIn){
		String stringaOut = new String();
		boolean eliminatore = false;
		int j=0;

		for (int i=0; i<stringaIn.length(); i++){
			if (stringaIn.charAt(i)!=' '){
				stringaOut=stringaOut + stringaIn.charAt(i);
				eliminatore = false;
			} else {
				if (!eliminatore){
					stringaOut=stringaOut + stringaIn.charAt(i);
					eliminatore = true;
				}
			}
		}

		return stringaOut;
	}

}
