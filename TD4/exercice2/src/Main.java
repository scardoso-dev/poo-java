import classes.*;

/**
 * Classe Main de l'exercice 2
 * @author Samuel CARDOSO
 */
public class Main {
    public static void main(String[] args) {

        /* ----------------------------------------------------------------------------------------------- */
        /* A. Créer une instance President et deux instances Ministre ;                                    */
        /* ----------------------------------------------------------------------------------------------- */
        President president = new President("MACRON", "Emmanuel", "France");
        Ministre m1 = new Ministre("VALS", "Manuel", "économie");
        Ministre m2 = new Ministre("POUTOU", "Philippe", "défense");

        /* ----------------------------------------------------------------------------------------------- */
        /* B. Stocker ces trois instances dans une collection hétérogène ;                                 */
        /* ----------------------------------------------------------------------------------------------- */
        Personne[] personnes = new Personne[3];
        personnes[0] = president;
        personnes[1] = m1;
        personnes[2] = m2;

        /* ----------------------------------------------------------------------------------------------- */
        /* C. Afficher les informations de chaque instance de cette collection avec la méthode toString() ;*/
        /* ----------------------------------------------------------------------------------------------- */
        System.out.println("Affichage de la collection");
        for (Personne p: personnes) {
            System.out.println("\t"+p);
        }

        /* ----------------------------------------------------------------------------------------------- */
        /* D. Affecter les deux Ministres créés précédemment au President créé précédemment ;              */
        /* ----------------------------------------------------------------------------------------------- */
        m1.setPresident(president);
        m2.setPresident(president);

        /* ----------------------------------------------------------------------------------------------- */
        /* E. Afficher les ministres de ce President en utilisant la methode getMinistre() de la question  */
        /* 1.D et la methode toString() de la classe Ministre                                              */
        /* ----------------------------------------------------------------------------------------------- */
        System.out.println("\nMinistre du président "+president.getPrenom()+" "+president.getNom());
        for (Ministre m: president.getMinistres()) {
            System.out.println("\t"+m);
        }

    }
}