package classes;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Définition de la classe Livre avec une auto-incrémentation de l'id
 */
public class Livre {
    private static int lastCurrentId = 0; /* Dernier identifiant du livre courant */
    private final int id; /* Identifiant du livre */
    private String titre;
    private String auteur;
    private int prix;

    /**
     * Constructeur de la classe Livre avec des saisies utilisateurs
     */
    public Livre() {
        lastCurrentId++;
        this.id = lastCurrentId;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le titre du livre n°"+lastCurrentId+" : ");
        String titre = sc.nextLine();
        System.out.println("Donner l'auteur du livre n°"+lastCurrentId+" : ");
        String auteur = sc.nextLine();
        System.out.println("Donner le prix du livre n°"+lastCurrentId+" : ");
        String prix = sc.nextLine();

        // tant que la saisie n'est pas un nombre
        while(!prix.matches("^-?\\d+$"))
        {
            System.out.println("Donner le prix du livre n°"+lastCurrentId+" : ");
            prix = sc.nextLine();
        }
        this.titre = titre;
        this.auteur = auteur;
        this.prix = parseInt(prix); // On cast le String to int
    }

    /**
     * Accesseur de l'identifiant du livre
     * @return identifiant du livre (int)
     */
    public int getId() {
        return id;
    }

    /**
     * Accesseur du titre du livre
     * @return titre du livre (String)
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Accesseur de l'auteur du livre
     * @return auteur du livre (string)
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Accesseur du prix du livre
     * @return prix du livre (int)
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Modificateur du titre du livre
     * @param titre (String) Nouveau titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Modificateur de l'auteur du livre
     * @param auteur (String) Nouvel auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * Modificateur du prix du livre
     * @param prix (int) Nouveau prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Le prix du livre " + titre + " de l'auteur " + auteur + " est de : "+ prix +" e";
    }
}