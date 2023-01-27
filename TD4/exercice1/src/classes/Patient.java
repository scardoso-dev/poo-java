package classes;

/**
 * Classe Patient qui hérite de Personne
 * @author Samuel CARDOSO
 */
public class Patient extends Personne {

    /**
     * Médecin traitant du patient
     */
    private MedecinTraitant medecinTraitant;


    /**
     * Constructeur de la classe Personne avec paramètres
     * @param nss (String) Numéro de sécurité sociale qui doit comporter 15 chiffres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     * @param civilite (String) Civilité de la personne (H ou F)
     * @throws Exception
     */
    public Patient(String nss, String nom, String prenom, String civilite) throws Exception {
        super(nss, nom, prenom, civilite);
    }

    /**
     * Accesseur du médecin traitant du patient
     * @return (MedecinTraitant) Médecin traitant du patient
     */
    public MedecinTraitant getMedecinTraitant() {
        return this.medecinTraitant;
    }

    /**
     * Modificateur du médecin traitant du patient
     * @param medecinTraitant (MedecinTraitant) Nouveau médecin traitant
     */
    public void setMedecinTraitant(MedecinTraitant medecinTraitant) {
        this.medecinTraitant = medecinTraitant;
    }

    /**
     * Méthode qui permet au patient de déclarer son médecin traitant
     * @param m (MedecinTraitant) Médecin traitant à affecter au patient
     * @throws Exception
     */
    public void declareMedecinTraitant(MedecinTraitant m) throws Exception {
        if (this.medecinTraitant != null) {
            throw new Exception("Le patient possède déjà un médecin traitant");
        }
        this.medecinTraitant = m;
        this.medecinTraitant.patients.add(this); // Ajout du patient dans le tableau des patients de la classe MedecinTraitant
    }

}
