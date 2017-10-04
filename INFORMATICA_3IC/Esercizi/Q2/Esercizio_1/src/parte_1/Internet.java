package parte_1;

/**
 @author pietro.cappellato
 */
public class Internet {

	public static String email(String nome, String cognome, String dominio) {
		return nome.toLowerCase().charAt(0) + "." + cognome.toLowerCase() + "@" + dominio.toLowerCase();
	}

	public static String homepage(String cognome, String dominio) {
		return "http://" + dominio.toLowerCase() + "/~" + cognome.toLowerCase();
	}

	public static String userID(String nome, String cognome) {
		if (cognome.length() >= 7) {
			return nome.toLowerCase() + cognome.toLowerCase().substring(0, 7);
		} else {
			return nome.toLowerCase() + cognome.toLowerCase();
		}
	}

	public static String password(String nome, String cognome) {
		String password = "";
                cognome.toLowerCase();
                nome.toLowerCase();
		if (cognome.length() >= 3) {
			password += cognome.substring(0, 3);
		} else {
			password += cognome;
		}
		if (nome.length() >= 3) {
			password += nome.substring(nome.length() - 3, nome.length());
		} else {
			password += nome;
		}
		return password;
	}
}
