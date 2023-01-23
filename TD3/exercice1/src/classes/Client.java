package classes;

/**
 * Classe Client qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public class Client extends Personne {

    /**
     * Adresse du client
     */
    private String adresse;

    /**
     * Constructeur par défaut de la classe Client
     */
    public Client() {
        super();
    }

    /**
     * Constructeur de la classe Client avec paramètres
     * @param nom (String) Nom de la Personne
     * @param prenom (String) Prenom de la Personne
     * @param adresse (String) Adresse du Client
     */
    public Client(String nom, String prenom, String adresse) {
        super(nom, prenom);
        this.adresse = adresse;
    }

    /**
     * Accesseur de l'adresse du client
     * @return (String) Adresse du client
     */
    public String getAdresse() {
        return this.adresse;
    }

    /**
     * Modificateur de l'adresse du client
     * @param adresse (String) Nouvelle adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return super.toString() + " Son adresse est : " + this.adresse;
    }
}
