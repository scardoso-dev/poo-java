package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe MedecinTraitant qui hérite de Personne
 * @author Samuel CARDOSO
 */
public class MedecinTraitant extends Personne {
    /**
     * Spécialité du médecin traitant
     */
    private String specialite;

    /**
     * Liste des patients du médecin traitant
     */
    public Set<Patient> patients;


    /**
     * Constructeur de la classe Personne avec paramètres
     * @param nss (String) Numéro de sécurité sociale qui doit comporter 15 chiffres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     * @param civilite (String) Civilité de la personne (H ou F)
     * @param specialite (String) Spécialité du médecin traitant
     * @throws Exception
     */
    public MedecinTraitant(String nss, String nom, String prenom, String civilite, String specialite) throws Exception {
        super(nss, nom, prenom, civilite);
        this.specialite = specialite;
        this.patients = new HashSet<>();

    }

    /**
     * Accesseur de la spécialité du médecin traitant
     * @return (String) Spécialité du médecin traitant
     */
    public String getSpecialite() {
        return this.specialite;
    }

    /**
     * Accesseur des patients du médecin traitant
     * @return (Set<Patien>) Patients du médecin traitant
     */
    public Set<Patient> getPatients() {
        return this.patients;
    }

    /**
     * Modificateur de la spécialité du médecin traitant
     * @param specialite (String) Nouvelle spécialité
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + ", médecin traitant avec pour spécialité : " + this.specialite;
    }
}
