package classes;

/**
 * Classe Personne
 * @author Samuel CARDOSO
 */
public class Personne {

    /**
     * Dernier identifiant
     */
    protected static int lastCurrentId;

    /**
     * Identifiant de la personne
     */
    protected final int id;

    /**
     * Prénom de la personne
     */
    protected String prenom;

    /**
     * Constructeur par défault de la classe Personne
     */
    public Personne() {
        this.id = ++ lastCurrentId;
    }

    /**
     * Constructeur de la classe Personne avec paramètres
     * @param prenom (String) Prenom de la Personne
     */
    public Personne(String prenom) {
        this.id = ++ lastCurrentId;

        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    /**
     * Accesseur de l'identifiant du chercheur
     * @return (int) Identifiant du chercheur
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accesseur du prenom de la personne
     * @return (String) Prénom de la personne
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Modificateur du prenom de la personne
     * @param prenom (String) Nouveau prenom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return "Je suis " + this.prenom;
    }
}
