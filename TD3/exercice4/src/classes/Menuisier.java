package classes;

/**
 * Classe Menuisier qui hérite de la classe ABSTRAITE Metier
 * @author Samuel CARDOSO
 */
public class Menuisier extends Metier {

    /**
     * Constructeur de la classe Menuisier
     * @param prenom (String) Prénom de la Personne exerçant le métier Menuisier
     */
    public Menuisier(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " le Menuisier";
    }
}
