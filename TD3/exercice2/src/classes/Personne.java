package classes;

/**
 * Classe Personne
 * @author Samuel CARDOSO
 */
public abstract class Personne {

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
     * Email de la personne
     */
    protected String email;

    /**
     * Telephone de la personne
     */
    protected String telephone;

    /**
     * Salaire de la personne
     */
    protected double salaire;

    /**
     * Constructeur par défault de la classe Personne
     */
    public Personne() {
        this.id = ++ lastCurrentId;
    }

    /**
     * Constructeur de la classe Personne avec paramètres
     * @param nom (String) Nom de la Personne
     * @param prenom (String) Prénom de la Personne
     * @param email (String) Email de la Personne
     * @param telephone (String) Téléphone de la Personne
     * @param salaire (Double) Salaire de la personne
     */
    public Personne(String nom, String prenom, String email, String telephone, double salaire) {
        this.id = ++ lastCurrentId;

        this.nom = nom.toUpperCase();

        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;

        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
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
     * Accesseur de l'email de la personne
     * @return (String) Email de la personne
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Accesseur du téléphone de la personne
     * @return (String) Téléphone de la personne
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Accesseur du salaire de la personne
     * @return (double) Salaire de la personne
     */
    public double getSalaire() {
        return this.salaire;
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

    /**
     * Modificateur de l'email de la personne
     * @param email (String) Nouvel email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modificateur du téléphone de la personne
     * @param telephone (String) Nouveau téléphone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Modificateur du salaire de la personne
     * @param salaire (double) Nouveau salaire
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    /**
     * Méthode qui calcule le salaire selon la Personne
     * @return (double) Salaire de la personne
     */
    public abstract double calculerSalaire();

    /**
     * Méthode qui affiche les infos de salaire selon la personne
     */
    public abstract void afficheInfoSalaire();

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return "Personne{ " +
                "id : "+ this.id +
                ", nom : " + this.nom +
                ", prenom :" + this.prenom +
                ", email : " + this.email +
                ", telephone : " + this.telephone +
                ", salaire de base : " + this.salaire +
                '}';
    }
}
