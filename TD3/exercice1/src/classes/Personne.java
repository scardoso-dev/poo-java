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
     * Nom de la personne
     */
    protected String nom;

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
     * @param nom
     * @param prenom
     */
    public Personne(String nom, String prenom) {
        this.id = ++ lastCurrentId;

        this.nom = nom.toUpperCase();

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
     * Modificateur du prenom de la personne
     * @param prenom (String) Nouveau prenom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{ id : "+ this.id + ", nom :" + this.nom + ", prenom :" + this.prenom + '}';
    }
}
