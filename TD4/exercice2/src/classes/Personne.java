package classes;

/**
 * Classe Personne ABSTRAITE
 * @author Samuel CARDOSO
 */
public abstract class Personne {

    /**
     * Dernier identifiant
     */
    private static int lastCurrentId = 0;

    /**
     * Identifiant de la personne
     */
    protected int id;
    /**
     * Nom de la Personne
     */
    protected String nom;

    /**
     * Prénom de la Personne
     */
    protected String prenom;

    /**
     * Constructeur de la classe Personne avec paramètres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     */
    public Personne(String nom, String prenom) {
        this.id = ++lastCurrentId;
        this.nom = nom.toUpperCase();

        // On met la premiere lettre du prénom en majuscule et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;

    }


    /**
     * Accesseur du nom de la personne
     * @return (String) Nom de la personne
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur du prenom de la personne
     * @return (String) Prénom de la personne
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Modificateur du nom de la personne
     * @param nom (String) Nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Modificateur du prénom de la personne
     * @param prenom (String) Nouveau prénom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule et le reste en minuscule
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
        return this.prenom + " " + this.nom;
    }
}
