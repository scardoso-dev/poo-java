import classes.Client;
import classes.Informaticien;
import classes.Personne;
import classes.Salarie;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList();
        personnes.add(new Client("OBAKA", "Med", "Paris 11e"));
        personnes.add(new Client("ALSENY", "Thomas", "Pontoise"));

        personnes.add(new Salarie("DOUK", "Daniel", 2000));
        personnes.add(new Salarie("NGOYE", "Roland", 2500));

        personnes.add(new Informaticien("KENBY", "Kevin", 3700, "JAVA"));
        personnes.add(new Informaticien("MAGASSOUBA", "Chick", 3000, "Base de donnees"));

        // Affichage des personnes avec leurs informations
        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}