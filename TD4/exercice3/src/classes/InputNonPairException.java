package classes;

/**
 * Classe d'exception InputNonPairException qui étend Exception
 * @author Samuel CARDOSO
 */
public class InputNonPairException extends Exception {

    /**
     * Constructeur de l'exception InputNonPairException avec paramètre
     * @param s (String) Message de l'exception
     */
    public InputNonPairException(String s) {
        super(s);
    }
}
