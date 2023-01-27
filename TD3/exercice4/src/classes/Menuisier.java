package classes;

/**
 * Classe Menuisier qui hérite de la classe ABSTRAITE Metier
 * @author Samuel CARDOSO
 */
public class Menuisier extends Personne {

    /**
     * Constructeur de la classe Menuisier
     * @param prenom (String) Prénom de la Personne exerçant le métier Menuisier
     */
    public Menuisier(String prenom) {
        super(prenom);
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " le Menuisier";
    }
}
