import classes.Livre;

public class Main {
    public static void main(String[] args) {
        // Tableau contenant des livres
        Livre[] livres = {new Livre()};

        // Parcours du tableau livres à l'aide d'un foreach pour afficher chaque livre
        for (Livre livre : livres) {
            System.out.println(livre);
        }
        System.out.println("Le nombre de livres est de "+livres.length+"\n");
    }
}