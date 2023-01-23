package tests;

import classes.Chercheur;
import classes.Laboratoire;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChercheurTest {

    /**
     * Fonction qui permet de formmater la date
     * @param dateToformated (Date) Date à formatter
     * @return (String) La date formmaté
     */
    public String formatDate(Date dateToformated) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dateToformated);
    }

    // Initialisation du laboratoire par défault et de la liste des chercheurs
    Laboratoire defaultLaboratoire = new Laboratoire("0000", "default");
    Chercheur[] chercheurs = new Chercheur[] {
            new Chercheur("rEYChmEN", "DaVId", new Date("01/01/2001"), defaultLaboratoire),
            new Chercheur("Madi", "mEliSSa", new Date("12/07/2006"), defaultLaboratoire),
            new Chercheur("duclos", "frAnK", new Date("23/08/1999"), defaultLaboratoire),
            new Chercheur("duclos", "frAnK", new Date("23/08/1999"), defaultLaboratoire)

    };

    /**
     * Fonction qui vérifie le bon fonctionnement de l'accesseur de l'ID d'un chercheur
     */
    @Test
    public void testGetId() {
        assertEquals(1, chercheurs[0].getId());
        assertEquals(2, chercheurs[1].getId());
        assertEquals(3, chercheurs[2].getId());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de l'accesseur du nom d'un chercheur
     */
    @Test
    public void testGetNom() {
        assertEquals("REYCHMEN", chercheurs[0].getNom());
        assertEquals("MADI", chercheurs[1].getNom());
        assertEquals("DUCLOS", chercheurs[2].getNom());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de l'accesseur du prenom d'un chercheur
     */
    @Test
    public void testGetPrenom() {
        assertEquals("David", chercheurs[0].getPrenom());
        assertEquals("Melissa", chercheurs[1].getPrenom());
        assertEquals("Frank", chercheurs[2].getPrenom());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de l'accesseur de la date d'obtention du doctorat d'un chercheur
     */
    @Test
    public void testGetDateDoctorat() {
        assertEquals("01/01/2001", formatDate(chercheurs[0].getDateDoctorat()));
        assertEquals("07/12/2006", formatDate(chercheurs[1].getDateDoctorat()));
        assertEquals("08/11/2000", formatDate(chercheurs[2].getDateDoctorat()));
    }

    /**
     * Fonction qui vérifie le bon fonctionnement des modificateurs nom, prénom et date de doctorat d'un chercheur
     */
    @Test
    public void testSetters() {
        Chercheur chercheur = new Chercheur();

        chercheur.setNom("UnKNOW");
        assertEquals("UNKNOW", chercheur.getNom());

        chercheur.setPrenom("MIcHel");
        assertEquals("Michel", chercheur.getPrenom());

        chercheur.setDateDoctorat(new Date("01/01/2005"));
        assertEquals("01/01/2005", formatDate(chercheur.getDateDoctorat()));
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de la méthode equals de la classe chercheur
     */
    @Test
    public void testEquals() {
        boolean compare1 = chercheurs[0].equals(chercheurs[1]); // faux
        boolean compare2 = chercheurs[1].equals(chercheurs[1]); // vrai
        boolean compare3 = chercheurs[2].equals(chercheurs[3]); // vrai

        assertEquals(false, compare1);
        assertEquals(true, compare2);
        assertEquals(true, compare3);
    }
}