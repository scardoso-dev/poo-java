package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe Laboratoire
 * @author Samuel CARDOSO
 */
public class Laboratoire {

    /**
     * Dernier identifiant
     */
    private static int lastCurrentId = 0;

    /**
     * Identifiant du laboratoire
     */
    private final int id;

    /**
     * Code du laboratoire
     */
    private String code;

    /**
     * Libelle du laboratoire
     */
    private String libelle;

    /**
     * Chercheurs travaillant dans le laboratoire
     */
    public Set<Chercheur> chercheurs;


    /**
     * Constructeur par défaut de la classe Laboratoire
     */
    public Laboratoire() {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
    }

    /**
     * Constructeur de la classe Laboratoire avec paramètres
     * @param code (String) Code du laboratoire
     * @param libelle (String) Libelle du laboratoire
     */
    public Laboratoire(String code, String libelle) {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
        this.code = code;
        this.libelle = libelle;
        this.chercheurs = new HashSet<>();
    }

    /**
     * Accesseur de l'identifiant du laboratoire
     * @return (String) Identifiant du laboratoire
     */
    public int getId() {
        return id;
    }

    /**
     * Accesseur du code du laboratoire
     * @return (String) Code du laboratoire
     */
    public String getCode() {
        return code;
    }

    /**
     * Accesseur du libelle du laboratoire
     * @return (String) Libelle du laboratoire
     */
    public String getLibelle() {
        return this.libelle;
    }

    /**
     * Modificateur du code du laboratoire
     * @param code Nouveau code du laboratoire
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Modificateur du libelle du laboratoire
     * @param libelle Nouveau libelle du laboratoire
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Laboratoire = "+this.libelle;
    }

}

