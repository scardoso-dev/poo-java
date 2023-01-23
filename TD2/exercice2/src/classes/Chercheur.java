package classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Classe Chercheur
 * @author Samuel CARDOSO
 */
public class Chercheur implements Comparable<Chercheur> {

    /**
     * Dernier identifiant
     */
    private static int lastCurrentId = 0;

    /**
     * Identifiant du chercheur
     */
    private final int id;

    /**
     * Nom du chercheur
     */
    private String nom;

    /**
     * Prenom du chercheur
     */
    private String prenom;

    /**
     * Date du doctorat du chercheur
     */
    private Date dateDoctorat;

    /**
     * Laboratoire du chercheur
     */
    private Laboratoire laboratoire;


    /**
     * Constructeur par défaut de la classe Chercheur
     */
    public Chercheur() {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
    }

    /**
     * Constructeur de la classe Chercheur avec paramètres
     * @param nom (String) Nom du chercheur
     * @param prenom (String) Prenom du chercheur
     * @param dateDoctorat (Date) Date de doctorat du chercheur
     */
    public Chercheur(String nom, String prenom, Date dateDoctorat, Laboratoire laboratoire) {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;

        this.nom = nom.toUpperCase();

        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
        this.dateDoctorat = dateDoctorat;
        this.laboratoire = laboratoire;
        this.laboratoire.chercheurs.add(this); // Ajout du chercheur dans le tableau des chercheurs de la classe Laboratoire
    }

    /**
     * Accesseur de l'identifiant du chercheur
     * @return (int) Identifiant du chercheur
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accesseur du nom du chercheur
     * @return (String) Nom du chercheur
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur du prenom du chercheur
     * @return (String) Prenom du chercheur
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Accesseur de la date de doctorat du chercheur
     * @return (Date) Date de doctorat du chercheur
     */
    public Date getDateDoctorat() {
        return this.dateDoctorat;
    }

    /**
     * Accesseur du laboratoire où travaille le chercheur
     * @return (Laboratoire) Laboratoire
     */
    public Laboratoire getLaboratoire() {
        return laboratoire;
    }

    /**
     * Modificateur du nom du chercheur
     * @param nom (String) Nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Modificateur du prenom du chercheur
     * @param prenom (String) Nouveau prenom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule, et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    /**
     * Modificateur de la date de doctorat du chercheur
     * @param dateDoctorat (Date) Nouvelle date de doctorat
     */
    public void setDateDoctorat(Date dateDoctorat) {
        this.dateDoctorat = dateDoctorat;
    }


    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Chercheur "+this.nom+" "+ this.prenom+", a obtenu son doctorat le " + dateFormat.format(this.dateDoctorat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    /**
     * Réécriture (polimorphisme de surchage de méthode) de la méthode equals pour vérifier l'équalite entre le chercheur courant et un passé en paramètre
     * @param o (Object)
     * @return (boolean) Retourne vrai si les deux chercheurs sont identiques, faux sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chercheur chercheur = (Chercheur) o;
        return Objects.equals(nom, chercheur.nom) && Objects.equals(prenom, chercheur.prenom);
    }

    @Override
    public int compareTo(Chercheur chercheur) {
        return this.laboratoire.getCode().compareTo(chercheur.laboratoire.getCode());
    }
}
