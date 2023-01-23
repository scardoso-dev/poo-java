import classes.Medecin;
import classes.Specialite;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Specialite> specialites = new ArrayList();
        specialites.add(new Specialite("Cardio", "Cardiologie"));
        specialites.add(new Specialite("Neuro", "Neurologie"));
        specialites.add(new Specialite("Infection", "Infectiologie"));

        for (Specialite spe : specialites) {
            System.out.println(spe);
        }

        ArrayList<Medecin> medecins = new ArrayList();
        medecins.add(new Medecin("REYCHMEN", "David", "", "reychmen@gmail.com", specialites.get(0)));
        medecins.add(new Medecin("MADI", "Melissa", "", "madi@gmail.com", specialites.get(1)));
        medecins.add(new Medecin("DUCLOS", "Frank", "", "duclos@yahoo.fr", specialites.get(0)));

        Collections.sort(medecins);
        // Affichage des médecins par spécialité
        for (Medecin medecin : medecins) {
            System.out.println(medecin);
        }
    }
}