import classes.Voiture;

public class Main {
    public static void main(String[] args) {
        // Tableau contenant des voitures
        Voiture[] voitures = {new Voiture("DACIA",220.0f, 8), new Voiture("Mercede-Benz",200.0f, 6), new Voiture()};
        voitures[2].setMarque("Audi");
        voitures[2].setVitesse(240.0f);
        voitures[2].setPuissance(8);

        // Parcours du tableau voitures à l'aide d'un foreach pour afficher chaque voiture
        for (Voiture voiture : voitures) {
            System.out.println(voiture);
        }
        System.out.println("Le nombre de voitures est de "+voitures.length+"\n");
    }
}