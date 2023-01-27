package classes;

/**
 * Classe Salarie qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public class Salarie extends Personne {

    /**
     * Salaire du salarié
     */
    protected double salaire;

    /**
     * Constructeur par défaut de la classe Salarie
     */
    public Salarie() {
        super();
    }

    /**
     * Constructeur de la classe Salarie avec paramètres
     * @param nom (String) Nom de la Personne
     * @param prenom (String) Prenom de la Personne
     * @param salaire (double) Salaire du salarie
     */
    public Salarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    /**
     * Accesseur du salaire du salarie
     * @return (double) Salaire
     */
    public double getSalaire() {
        return this.salaire;
    }

    /**
     * Modificateur du salaire du salarie
     * @param salaire (double) Nouveau salaire
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " Son salaire est de : " + this.salaire;
    }

}
