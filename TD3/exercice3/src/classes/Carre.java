package classes;

/**
 * Classe Carre qui hérite de la classe ABSTRAITE Forme
 * @author Samuel CARDOSO
 */
public class Carre extends Forme {

    /**
     * Côté du carré
     */
    private double cote;

    /**
     * Constructeur de la classe Carre
     * @param cote
     */
    public Carre(double cote) {
        this.cote = cote;
    }

    /**
     * Accesseur du côté du Carre
     * @return (double) Côté du Carre
     */
    public double getCote() {
        return cote;
    }

    /**
     * Modificateur du côté du Carre
     * @param cote (double) Nouvelle valeur du côté
     */
    public void setCote(double cote) {
        this.cote = cote;
    }

    /**
     * Méthode qui renvoie la surface du carré
     * @return (double) Surface du carré
     */
    @Override
    public double getSurface() {
        return this.cote * this.cote;
    }


    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return "Carre ( coté " + this.cote + " cm )";
    }
}
