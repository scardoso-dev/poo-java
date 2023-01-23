package classes;

/**
 * Classe médecin
 * @author Samuel CARDOSO
 */
public class Medecin implements Comparable<Medecin> {

    /**
     * Constructeur par défaut de la classe Medecin
     */
    public Medecin() {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
    }

    /**
     * Constructeur de la classe Medecin avec paramètres
     * @param nom (String) Nom du médecin
     * @param prenom (String) Prenom du médecin
     * @param telephone (String) Téléphone du médecin
     * @param email (String) Email du médecin
     * @param specialite (Specialite) Specialité du médecin
     */
    public Medecin(String nom, String prenom, String telephone, String email, Specialite specialite) {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
        this.nom = nom.toUpperCase();

        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);

        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.specialite = specialite;

    }

    /**
     * Dernier identifiant
     */
    private static int lastCurrentId = 0;

    /**
     * Identifiant du médecin
     */
    private final int id;

    /**
     * Nom du médecin
     */
    private String nom;

    /**
     * Prénom du médecin
     */
    private String prenom;

    /**
     * Téléphone du médecin
     */
    private String telephone;

    /**
     * Email du médecin
     */
    private String email;

    /**
     * Specialité du médecin
     */
    private Specialite specialite;

    /**
     * Accesseur de l'identifiant
     * @return (int) Identifiant du médecin
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accesseur du nom
     * @return (String) Nom du médecin
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur du prenom
     * @return (String) Prénom du médecin
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Accesseur du téléphone
     * @return (String) Téléphone du médecin
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Accesseur de l'email
     * @return (String) Email du médecin
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Modificateur du nom du médecin
     * @param nom (String) Nouveau nom
     */
    public void setNom(String nom ) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Modificateur du prenom du médecin
     * @param prenom (String) Nouveau prenom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    /**
     * Modificateur du téléphone du médecin
     * @param telephone (String) Nouveau telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Modificateur de l'email du médecin
     * @param email (String) Nouvel email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Méthode toString de la classe Médecin
     * @return (String) Médecin sous forme de chaîne de caractères
     */
    public String toString() {
        return "id="+this.id+", nom="+this.nom+ ", prenom="+this.prenom+ ", telephone="+this.telephone +", email="+this.email+ ", specialite="+this.specialite.getLibelle();
    }

   @Override
    public int compareTo(Medecin med) {
        return this.specialite.getLibelle().compareTo(med.specialite.getLibelle());
    }


}