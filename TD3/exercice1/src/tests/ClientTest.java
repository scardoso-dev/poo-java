package tests;

import classes.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Test de la classe Client
 * @author Samuel CARDOSO
 */
class ClientTest {

    // Initialisation des clients par défaut
    Client defaultClient = new Client("DESCHAMPS", "Paul", "Paris 11e");
    Client[] clients = new Client[] {
            new Client("rEYChmEN", "DaVId", "Pontoise"),
            new Client("Madi", "mEliSSa", "Lyon"),
    };

    /**
     * Fonction qui vérifie le bon fonctionnement des accesseurs du client
     */
    @Test
    public void getters() {
        assertEquals(5, defaultClient.getId());
        assertEquals("DESCHAMPS", defaultClient.getNom());
        assertEquals("David", clients[0].getPrenom());
        assertEquals("Lyon", clients[1].getAdresse());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement des modificateurs du client
     */
    @Test
    public void setters() {
        Client client = new Client();
        client.setNom("LENOIR");
        client.setPrenom("Richard");
        client.setAdresse("Paris 3e");

        assertEquals("LENOIR", client.getNom());
        assertEquals("Richard", client.getPrenom());
        assertEquals("Paris 3e", client.getAdresse());
    }

    /**
     * Fonction qui vérifie le bon fonctionnement de la méthode toString() du client
     */
    @Test
    public void toStringClient() {
        Client client = new Client("LENOIR", "Richard", "Paris 3e");
        String expected = "Personne{ id : "+ client.getId() + ", nom :" + client.getNom() + ", prenom :" + client.getPrenom() + '}' + " Son adresse est : "+ client.getAdresse();
        assertEquals(expected, client.toString());

    }
}