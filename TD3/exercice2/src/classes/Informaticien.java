package classes;

/**
 * Classe Informaticien qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public class Informaticien extends Personne {

    /**
     * Specialite de l'informaticien
     */
    private String specialite;

    /**
     * Constructeur par défaut de la classe Informaticien
     */
    public Informaticien() {
        super();
    }

    /**
     * Constructeur de la classe Informaticien avec paramètres
     * @param nom (String) Nom de la Personne
     * @param prenom (String) Prenom de la Personne
     * @param email (String) Email de la Personne
     * @param telephone (String) Telephone de la Personne
     * @param salaire (double) Salaire de la Personne
     * @param specialite (String) Specialite de l'informaticien
     */
    public Informaticien(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    /**
     * Accesseur de la spécialité de l'informaticien
     * @return (String) Spécialité de l'informaticien
     */
    public String getSpecialite() {
        return this.specialite;
    }

    /**
     * Modificateur de la spécialité de l'informaticien
     * @param specialite (String) Nouvelle spécialité
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }


    /**
     * Calcule du salaire de l'informaticien, avec une augmentation de 20% par rapport à son salaire normal
     * @return (double) Salaire de l'informaticien
     */
    @Override
    public double calculerSalaire() {
        return this.getSalaire() * 1.2;
    }

    /**
     * Affichage des informations de salaire de l'informaticien
     */
    @Override
    public void afficheInfoSalaire() {
        String res = "Le salaire de l'informaticien "+ this.getNom() + " " + this.getPrenom() + " est : " + this.calculerSalaire() + " sa specialite : " + this.specialite;
        System.out.println(res);
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " Sa specialite est : " + this.specialite;
    }
}
