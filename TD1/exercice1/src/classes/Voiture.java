package classes;

public class Voiture {
    private static int lastCurrentId = 0; /* Dernier identifiant de la voiture courante */
    private final int id; /* Identifiant de la voiture */
    private String marque;
    private float vitesse;
    private int puissance;

    /**
     * Constructeur par défaut de la classe Voiture
     */
    public Voiture() {
        lastCurrentId++;
        this.id = lastCurrentId;
    }

    /**
     * Constructeur de la classe Voiture
     * @param marque marque de la voiture
     * @param vitesse vitesse maximale de la voiture
     * @param puissance puissance de la voiture
     */
    public Voiture(String marque, float vitesse, int puissance) {
        lastCurrentId++;
        this.id = lastCurrentId;
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    /**
     * Accesseur de l'identifiant de la voiture
     */
    public int getId() {
        return id;
    }

    /**
     * Accesseur de la marque de la voiture
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Accesseur de la vitesse maximale de la voiture
     */
    public float getVitesse() {
        return vitesse;
    }

    /**
     * Accesseur de la puissance de la voiture
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Modificateur de la marque
     * @param marque Nouvelle marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Modificateur de la vitesse
     * @param vitesse Nouvelle vitesse de la voiture
     */
    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }

    /**
     * Modificateur de la puissance
     * @param puissance Nouvelle puissance de la voiture
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", marque=" + marque +
                ", vitesse=" + vitesse +
                ", puissance=" + puissance;
    }
}