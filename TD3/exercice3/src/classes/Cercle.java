package classes;

import static java.lang.Math.PI;

/**
 * Classe Cercle qui hérite de la classe ABSTRAITE Forme
 * @author Samuel CARDOSO
 */
public class Cercle extends Forme {
    /**
     * Rayon du cercle
     */
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Accesseur du rayon du Cercle
     * @return (double) Rayon du Cercle
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Modificateur du rayon du Cercle
     * @param rayon (double) Nouvelle valeur du rayon
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Méthode qui renvoie la surface du cercle
     * @return (double) Surface du cercle
     */
    @Override
    public double getSurface() {
        return PI * this.rayon * this.rayon;
    }

    @Override
    public String toString() {
        return "Cercle ( rayon " + this.rayon + " cm )";
    }
}
