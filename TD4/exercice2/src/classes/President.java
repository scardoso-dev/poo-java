package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe President qui hérite de classe Personne
 * @author Samuel CARDOSO
 */
public class President extends Personne {

    /**
     * Pays où gouverne le président
     */
    private String pays;

    /**
     * Ministres du président
     */
    public Set<Ministre> ministres;

    /**
     * Constructeur de la classe President avec paramètres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     * @param pays (String) Pays où gouverne le président
     */
    public President(String nom, String prenom, String pays) {
        super(nom, prenom);
        this.pays = pays;
        this.ministres = new HashSet<>();

    }

    /**
     * Acceseur du pays où gouverne le président
     * @return (String) Pays
     */
    public String getPays() {
        return this.pays;
    }

    /**
     * Accesseur des ministres du président
     * @return (Set<Ministre>) Ministres du président
     */
    public Set<Ministre> getMinistres() {
        return this.ministres;
    }

    /**
     * Modificateur du pays où gouverne le président
     * @param pays (String) Nouveau pays
     */
    public void setPays(String pays) {
        this.pays = pays;
    }


    @Override
    public String toString() {
        return "President de "+ this.pays + " est " + super.toString();
    }
}
