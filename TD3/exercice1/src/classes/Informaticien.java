package classes;

/**
 * Classe Informaticien qui hérite de la classe Salarie
 * @author Samuel CARDOSO
 */
public class Informaticien extends Salarie {

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
     * @param specialite (String) Specialite de l'informaticien
     */
    public Informaticien(String nom, String prenom, double salaire, String specialite) {
        super(nom, prenom, salaire);
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
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " Sa specialite est : " + this.specialite;
    }
}
