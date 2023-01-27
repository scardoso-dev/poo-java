package tests;

import classes.Informaticien;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Test de la classe Informaticien
 */
class InformaticienTest {

    // Initialisation des informaticiens par défaut
    Informaticien defaultInformaticien = new Informaticien("DESCHAMPS", "Paul", 1898.63, "Java");
    Informaticien[] informaticiens = new Informaticien[] {
            new Informaticien("rEYChmEN", "DaVId", 2300, "IA"),
            new Informaticien("Madi", "mEliSSa", 2850, "Analyste"),
    };

    /**
     * Fonction qui vérifie le bon fonctionnement des accesseurs de l'informaticien
     */
    @Test
    public void getters() {
        assertEquals(1, defaultInformaticien.getId());
        assertEquals("DESCHAMPS", defaultInformaticien.getNom());
        assertEquals("David", informaticiens[0].getPrenom());
        assertEquals(2300, informaticiens[0].getSalaire());
        assertEquals("Analyste", informaticiens[1].getSpecialite());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement des modificateurs de l'informaticien
     */
    @Test
    public void setters() {
        Informaticien informaticien = new Informaticien();
        informaticien.setNom("LENOIR");
        informaticien.setPrenom("Richard");
        informaticien.setSalaire(2680);
        informaticien.setSpecialite("Reseaux");

        assertEquals("LENOIR", informaticien.getNom());
        assertEquals("Richard", informaticien.getPrenom());
        assertEquals(2680, informaticien.getSalaire());
        assertEquals("Reseaux", informaticien.getSpecialite());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de la méthode toString() de l'informaticien
     */
    @Test
    public void toStringInformaticien() {
        Informaticien informaticien = new Informaticien("LENOIR", "Richard", 2680, "Reseaux");
        String expected = "Personne{ id : "+ informaticien.getId() + ", nom :" + informaticien.getNom() + ", prenom :" + informaticien.getPrenom() + '}'
                + " Son salaire est de : "+informaticien.getSalaire()
                + " Sa specialite est : "+ informaticien.getSpecialite();
        assertEquals(expected, informaticien.toString());

    }
}