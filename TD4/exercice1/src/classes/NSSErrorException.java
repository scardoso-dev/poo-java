package classes;

/**
 * Exception du numéro de sécurité social NSSErrorException qui étend Exception
 * @author Samuel CARDOSO
 */
public class NSSErrorException extends Exception {

    /**
     * Constructeur par défaut
     */
    public NSSErrorException() { super(); }

    /**
     * Constructeur de l'exception NSSErrorException avec paramètres
     * @param s (String) Message de l'exception
     */
    public NSSErrorException(String s) { super(s); }


}
