package classes;

/**
 * Classe Responsable qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public class Responsable extends Personne {

    /**
     * Service du Responsable
     */
    private String service;

    /**
     * Constructeur par défaut de la classe Responsable
     */
    public Responsable() {
        super();
    }

    /**
     * Constructeur de la classe Informaticien avec paramètres
     * @param nom (String) Nom de la Personne
     * @param prenom (String) Prenom de la Personne
     * @param email (String) Email de la Personne
     * @param telephone (String) Telephone de la Personne
     * @param salaire (double) Salaire de la Personne
     * @param service (String) Service du Responsable
     */
    public Responsable(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    /**
     * Accesseur du service du responsable
     * @return (String) Service du responsable
     */
    public String getService() {
        return this.service;
    }

    /**
     * Modificateur du service du responsable
     * @param service (String) Nouveau service
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * Calcule du salaire du responsable, avec une augmentation de 35% par rapport à son salaire normal
     * @return (double) Salaire du responsable
     */
    @Override
    public double calculerSalaire() {
        return this.getSalaire() * 1.35;
    }

    /**
     * Affichage des informations de salaire du responsable
     */
    @Override
    public void afficheInfoSalaire() {
        String res = "Le salaire du responsable "+ this.getNom() + " " + this.getPrenom() + " est : " + this.calculerSalaire() + " son service est : " + this.service;
        System.out.println(res);
    }
}
