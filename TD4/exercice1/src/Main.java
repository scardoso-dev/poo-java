import classes.MedecinTraitant;
import classes.Patient;
import classes.Personne;

import java.util.ArrayList;
import java.util.Set;

/**
 * Classe Main de l'exercice 1
 * @author Samuel CARDOSO
 */
public class Main {
    public static void main(String[] args) throws Exception {

        /* ----------------------------------------------------------------------------------------------- */
        /* A. Créer une instance MedecinTraitant et deux instances Patient.                                */
        /* ----------------------------------------------------------------------------------------------- */
        try {
            MedecinTraitant mt1 = new MedecinTraitant("196877789147834", "DUPONT", "Patrick", "H", "généraliste");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        MedecinTraitant mt1 = new MedecinTraitant("196877789147834", "DUPONT", "Patrick", "H", "généraliste");

        Patient patient1 = new Patient("196884589147834", "HUTZ","Edouard", "H");
        Patient patient2 = new Patient("296721375497124", "HUTZ","Nora", "F");

        /* ----------------------------------------------------------------------------------------------- */
        /* B. Stocker ces trois instances dans une collection hétérogène.                                  */
        /* ----------------------------------------------------------------------------------------------- */
        Personne[] personnes = new Personne[3];
        personnes[0] = mt1;
        personnes[1] = patient1;
        personnes[2] = patient2;

        /* ----------------------------------------------------------------------------------------------- */
        /* C. Afficher les informations de chaque instance de cette collection avec la méthode toString(). */
        /* ----------------------------------------------------------------------------------------------- */
        System.out.println("Affichage collection hétérogène");
        for (Personne p: personnes) {
            System.out.println("\t"+p);
        }

        /* ----------------------------------------------------------------------------------------------- */
        /* D. Affecter les deux patients créés précédemment au medecinTraitant créé précédemment,en        */
        /* utilisant la methode declareMedecinTraitant(m : MedecinTraitant) de la question 2.A.            */
        /* ----------------------------------------------------------------------------------------------- */
        patient1.declareMedecinTraitant(mt1);
        patient2.declareMedecinTraitant(mt1);

        /* ----------------------------------------------------------------------------------------------- */
        /* E. Afficher les patients de ce medecinTraitant en utilisant la methode getPatients() de la      */
        /* question 2.B et la methode toString() de la classe Patient.                                     */
        /* ----------------------------------------------------------------------------------------------- */
        System.out.println("\nPatients du médecin traitant "+ mt1.getCivilite()+ " " + mt1.getPrenom() +" "+ mt1.getNom());
        Set<Patient> patientsMt1 = mt1.getPatients();
        for (Patient patient: patientsMt1) {
            System.out.println("\t"+patient);
        }

    }
}