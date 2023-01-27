package tests;

import classes.Salarie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Test de la classe Salarie
 */
class SalarieTest {

    // Initialisation des salariés par défaut
    Salarie defaultSalarie = new Salarie("DESCHAMPS", "Paul", 1898.63);
    Salarie[] salaries = new Salarie[] {
            new Salarie("rEYChmEN", "DaVId", 2300),
            new Salarie("Madi", "mEliSSa", 2850),
    };

    /**
     * Fonction qui vérifie le bon fonctionnement des accesseurs du salarie
     */
    @Test
    public void getters() {
        assertEquals(1, defaultSalarie.getId());
        assertEquals("DESCHAMPS", defaultSalarie.getNom());
        assertEquals("David", salaries[0].getPrenom());
        assertEquals(2850, salaries[1].getSalaire());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement des modificateurs du salarie
     */
    @Test
    public void setters() {
        Salarie salarie = new Salarie();
        salarie.setNom("LENOIR");
        salarie.setPrenom("Richard");
        salarie.setSalaire(2680);

        assertEquals("LENOIR", salarie.getNom());
        assertEquals("Richard", salarie.getPrenom());
        assertEquals(2680, salarie.getSalaire());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de la méthode toString() du salarie
     */
    @Test
    public void toStringSalarie() {
        Salarie salarie = new Salarie("LENOIR", "Richard", 2680);
        String expected = "Personne{ id : "+ salarie.getId() + ", nom :" + salarie.getNom() + ", prenom :" + salarie.getPrenom() + '}' + " Son salaire est de : "+ salarie.getSalaire();
        assertEquals(expected, salarie.toString());

    }
}