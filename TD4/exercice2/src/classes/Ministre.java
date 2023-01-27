package classes;

/**
 * Classe Ministre qui hérite de la classe Personne
 * @author Samuel CARDOSO
 */
public class Ministre extends Personne {

    /**
     * Domaine du ministre
     */
    private String domaine;

    /**
     * Président du ministre
     */
    private President president;

    /**
     * Constructeur de la classe President avec paramètres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     * @param domaine (String) Domaine du ministre
     * @throws IllegalArgumentException
     */
    public Ministre(String nom, String prenom, String domaine) throws IllegalArgumentException {
        super(nom, prenom);
        if (domaine.equals("")) {
            throw new IllegalArgumentException("Renseignez un domaine pour le ministre");
        }
        this.domaine = domaine;
    }

    /**
     * Accesseur du domaine du ministre
     * @return (String) Domaine du ministre
     */
    public String getDomaine() {
        return this.domaine;
    }

    /**
     * Accesseur du président du ministre
     * @return (President) Président du ministre
     */
    public President getPresident() {
        return this.president;
    }

    /**
     * Modificateur du domaine du ministre
     * @param domaine (String) Nouveau domaine du ministre
     */
    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    /**
     * Modificateur du président du ministre
     * @param president (President) Nouveau président du ministre
     */
    public void setPresident(President president) {
        this.president = president;
        this.president.ministres.add(this); // Ajout du ministre dans le tableau des ministres de la classe President
    }

    @Override
    public String toString() {
        return "Ministre "+ this.nom + " " + this.prenom + ", son domaine est " + this.domaine;
    }
}
