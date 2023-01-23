import classes.Chercheur;
import classes.Laboratoire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Laboratoire> laboratoires = new ArrayList();
        laboratoires.add(new Laboratoire("D789C1", "Labo1"));
        laboratoires.add(new Laboratoire("F7KlC5", "Labo2"));

        for (Laboratoire lab : laboratoires) {
            System.out.println(lab);
        }
        System.out.println();

        ArrayList<Chercheur> chercheurs = new ArrayList();
        chercheurs.add(new Chercheur("REYCHMEN", "David", new Date("01/01/2001"), laboratoires.get(0)));
        chercheurs.add(new Chercheur("MADI", "Melissa", new Date("12/07/2006"), laboratoires.get(1)));
        chercheurs.add(new Chercheur("DUCLOS", "Frank", new Date("23/08/1999"), laboratoires.get(0)));

        Collections.sort(chercheurs);

        // Affichage des chercheurs par laboratoire itérativement
        for (int i = 0; i < chercheurs.size(); i++) {
            if (i == 0) {
                System.out.println(chercheurs.get(i).getLaboratoire().getLibelle());
            }
            if(i > 0 && chercheurs.get(i-1).getLaboratoire() != chercheurs.get(i).getLaboratoire()) {
                System.out.println(chercheurs.get(i).getLaboratoire().getLibelle());
            }
            System.out.println("\t"+chercheurs.get(i));

        }
    }
}