package tests;

import classes.Medecin;
import classes.Specialite;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MedecinTest {
    ArrayList<Specialite> specialitesStatic = new ArrayList();
    Specialite specialiteDefault = new Specialite("Unknow","AUCUNE");

    static Specialite[] specialites = new Specialite[]{new Specialite("Cardio", "Cardiologie"), new Specialite("Neuro", "Neurologie"), new Specialite("Infection", "Infectiologie")};


    static ArrayList<Medecin> medecinsStatic = new ArrayList();

    @Test
    public void Medecin() {
        ArrayList<Medecin> medecins = new ArrayList();
        medecins.add(new Medecin("dUpoNt", "miChEL", "", "", specialiteDefault));
        medecins.add(new Medecin("dUpoNt", "NiCOlaS", "", "", specialiteDefault));
        medecins.add(new Medecin("dUpoNt", "PATRICK", "", "", specialiteDefault));
        medecins.add(new Medecin("dUpoNt", "ERic", "", "", specialiteDefault));

        assertEquals("DUPONT", medecins.get(0).getNom());
        assertEquals("Michel", medecins.get(0).getPrenom());
        assertEquals("Nicolas", medecins.get(1).getPrenom());
        assertEquals("Patrick", medecins.get(2).getPrenom());
    }

    @Test
    public void compareTo() {
        Medecin med1 = new Medecin("dUpoNt", "miChEL", "", "", specialites[0]);
        Medecin med2 = new Medecin("dUpoNt", "NiCOlaS", "", "", specialites[1]);
        Medecin med3 = new Medecin("dUpoNt", "PATRICK", "", "", specialites[2]);
        Medecin med4 = new Medecin("dUpoNt", "ERic", "", "", specialites[0]);

        int compare1 = med1.compareTo(med2); // faux
        int compare2 = med2.compareTo(med3); // faux
        int compare3 = med1.compareTo(med4); // vrai

        assertNotEquals(0, compare1);
        assertNotEquals(0, compare2);
        assertNotEquals(1, compare3);
    }
}