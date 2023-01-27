package classes;

/**
 * Classe Chat
 * @author Samuel CARDOSO
 */
public class Chat {
    /**
     * Nom du Chat
     */
    private String nom;

    /**
     * Nombre de puces
     */
    private int nombrePuces;

    /**
     * Constructeur de la classe Chat avec paramètres
     * @param nom (String) Nom du Chat
     * @param nombrePuces (int) Nombre de puces
     */
    public Chat(String nom, int nombrePuces) {
        if (nom == null || nom.equals("")) {
            throw new IllegalArgumentException("Le nom du chat ne peut être nulle");
        }
        if (nombrePuces < 0) {
            throw new IllegalArgumentException("nombre negatif de puces !");
        }
        // On met la premiere lettre du prénom en majuscule et le reste en minuscule
        nom = nom.toLowerCase();
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        this.nom = nom;

        this.nombrePuces = nombrePuces;
    }

    /**
     * Accesseur du nom du Chat
     * @return (String) Nom du Chat
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur du nombre de puces
     * @return (int) Nombre de puces
     */
    public int getNombrePuces() {
        return this.nombrePuces;
    }

    /**
     * Modificateur du nom du Chat
     * @param nom (String) Nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Modificateur du nombre de puces
     * @param nombrePuces (int) Nouveau nombre de puces
     */
    public void setNombrePuces(int nombrePuces) {
        this.nombrePuces = nombrePuces;
    }
}
