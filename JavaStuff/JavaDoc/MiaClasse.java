/* Questo commento scritto in testa al programma non segue
 * la sintassi javadoc e sara' ignorato
 */

/**
 * @author  Cognome Nome
 * @version 1.00
 * @since   2015/11/03
 */

/**
 *
 * Commenti generali sulla classe MiaClasse: classe di esempio.
 */
public class MiaClasse {

    /**
     * Commenti sulla variabile miaVariabile: un intero qualsiasi. Notare il
     * riferimento incrociato al metodo mioMetodo...
     *
     * @see MiaClasse#mioMetodo
     */
    protected int miaVariabile;

/**
	
	@param x
	@param y
	@return 
	*/
    public int mioMetodo(int x, int y) {
        miaVariabile = x;
        return x;
    }

    /**
     * Commenti sul costruttore: costruisce oggetto con miaVariabile a zero.
     */
    public MiaClasse() {
        miaVariabile = 0;
    }
}
