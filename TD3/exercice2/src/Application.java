import classes.*;

import java.util.ArrayList;

/**
 * Classe principale Application
 * @author Samuel CARDOSO
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList();

        personnes.add(new Informaticien("SEN", "Sara", "sen.sara@gmail.com", "0798651463", 4800, "JAVA"));
        personnes.add(new Informaticien("MORPHE", "Louis", "louis.morphe@gmail.com", "0698321499", 3600, "C++"));

        personnes.add(new Responsable("GAITAN", "Anne", "anne.gaitan@gmail.com", "0000000000", 2700, "Informatique"));
        personnes.add(new Responsable("DUPONT", "Frank", "frank.dupont@gmail.com", "", 3105, "Comptabilite"));

        // Affichage des personnes avec les informations de leur salaire
        for (Personne personne : personnes) {
            personne.afficheInfoSalaire();
        }
    }
}