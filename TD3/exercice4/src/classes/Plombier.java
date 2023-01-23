package classes;

/**
 * Classe Plombier qui hérite de la classe ABSTRAITE Metier
 * @author Samuel CARDOSO
 */
public class Plombier extends Metier {

    /**
     * Constructeur de la classe Plombier
     * @param prenom (String) Prénom de la Personne exerçant le métier Plombier
     */
    public Plombier(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " le Plombier";
    }
}
