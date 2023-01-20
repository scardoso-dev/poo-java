package tests;

import classes.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
class VoitureTest {
    static Voiture voiture1 = new Voiture("BMW",220.0f, 8);
    static Voiture voiture2 = new Voiture("Ford",200.0f, 6);
    static Voiture voiture3 = new Voiture();

    @Test
    void getId() {
        assertEquals(1, voiture1.getId());
        assertEquals(2, voiture2.getId());
    }

    @Test
    void getMarque() {
        assertEquals("BMW", voiture1.getMarque());
        assertEquals("Ford", voiture2.getMarque());
    }

    @Test
    void getVitesse() {
        assertEquals(220.0f, voiture1.getVitesse());
        assertEquals(200.0f, voiture2.getVitesse());
    }

    @Test
    void getPuissance() {
        assertEquals(8, voiture1.getPuissance());
        assertEquals(6, voiture2.getPuissance());
    }

    @Test
    void setMarque() {
        assertNull(voiture3.getMarque());
        voiture3.setMarque("WMB");
        assertEquals("WMB", voiture3.getMarque());
    }

    @Test
    void setVitesse() {
        assertEquals(0.0f, voiture3.getVitesse());
        voiture3.setVitesse(210.0f);
        assertEquals(210.0f, voiture3.getVitesse());
    }

    @Test
    void setPuissance() {
        assertEquals(0, voiture3.getPuissance());
        voiture3.setPuissance(7);
        assertEquals(7, voiture3.getPuissance());
    }

    @Test
    void testToString() {
        assertEquals("id=1, marque=BMW, vitesse=220.0, puissance=8", voiture1.toString());
        assertEquals("id=2, marque=Ford, vitesse=200.0, puissance=6", voiture2.toString());
        assertEquals("id=3, marque=null, vitesse=0.0, puissance=0", voiture3.toString());
    }
}