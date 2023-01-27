package tests;

import classes.Ministre;
import classes.President;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test de la classe Ministre
 * @author Samuel CARDOSO
 */
class MinistreTest {

    /**
     * Test du constructeur Ministre
     */
    @Test
    public void testMinistre() {
        // Exception si aucun domaine n'est renseigné
        President president = new President("MACRON", "Emmanuel", "France");
        IllegalArgumentException exceptionNSS1 = assertThrows(IllegalArgumentException.class, () -> {
            new Ministre("VALS", "Manuel", "");
        });
        assertEquals("Renseignez un domaine pour le ministre", exceptionNSS1.getMessage());
    }

}