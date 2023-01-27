package classes;

/**
 * Constructeur de la classe ABSTRAITE Metier qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public abstract class Metier extends Personne {

    /**
     * Constructeur de la classe Metier
     * @param prenom (String) Prénom de la Personne exerçant un métier quelconque
     */
    public Metier(String prenom) {
        super(prenom);
    }
    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */

    @Override
    public String toString() {
        return super.toString();
    }
}
