import classes.Menuisier;
import classes.Personne;
import classes.Plombier;

/**
 * Classe de test des métiers
 */
public class TestMetiers {
    public static void main(String[] argv) {
        Personne[] personnes = new Personne[3];
        personnes[0] = new Menuisier("Paul");
        personnes[1] = new Plombier("Jean");
        personnes[2] = new Menuisier("Adrien");
        for (int i = 0; i < personnes.length; i++)
            System.out.println(personnes[i].toString());
    }
}
