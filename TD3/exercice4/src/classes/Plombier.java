package classes;

/**
 * Classe Plombier qui hérite de la classe ABSTRAITE Metier
 * @author Samuel CARDOSO
 */
public class Plombier extends Personne {

    /**
     * Constructeur de la classe Plombier
     * @param prenom (String) Prénom de la Personne exerçant le métier Plombier
     */
    public Plombier(String prenom) {
        super(prenom);
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " le Plombier";
    }
}
