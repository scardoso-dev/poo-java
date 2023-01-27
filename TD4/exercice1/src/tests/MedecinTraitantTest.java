package tests;

import classes.MedecinTraitant;
import classes.NSSErrorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test de la classe MedecinTraitant
 * @author Samuel CARDOSO
 */
class MedecinTraitantTest {

    /**
     * Test du constructeur MedecinTraitant, gestions des exceptions
     * @throws Exception
     */
    @Test
    public void testMedecinTraitant() throws Exception {

        // Lorsque le NSS est à égal vide avec des espaces
        NSSErrorException exceptionNSS0 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("    ", "DUPONT", "Patrick", "H", "généraliste");
        });
        assertEquals("Le NSS (Numéro de Sécurité Social) ne peut pas être 0 ou vide ! Veuillez renseigner les 15 chiffres", exceptionNSS0.getMessage());

        // Lorsque le NSS est à égal a 0
        NSSErrorException exceptionNSS1 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("0", "DUPONT", "Patrick", "H", "généraliste");
        });
        assertEquals("Le NSS (Numéro de Sécurité Social) ne peut pas être 0 ou vide ! Veuillez renseigner les 15 chiffres", exceptionNSS1.getMessage());

        // Lorsque le NSS ne dispose pas de 15 chiffres
        NSSErrorException exceptionNSS2 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("2", "DUPONT", "Patrick", "H", "généraliste");
        });
        assertEquals( exceptionNSS2.getMessage(), exceptionNSS2.getMessage());

        // ----- //
        NSSErrorException exceptionNSS5 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("19687778914783", "LEBLANC", "Paul", "H", "généraliste");
        });
        assertEquals( "Le NSS (Numéro de Sécurité Social) doit être composé de 15 chiffres\n \t NSS n'a pas 15 chiffres", exceptionNSS5.getMessage());

        // Lorsque que le NSS ne commence pas par 1, alors qu'il s'agit d'un homme
        NSSErrorException exceptionNSS3 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("216877789147834", "DUPONT", "Patrick", "H", "généraliste");
        });
        assertEquals( "Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 1 car il s'agit d'un homme", exceptionNSS3.getMessage());

        // Lorsque que le NSS ne commence pas par 2, alors qu'il s'agit d'une femme
        NSSErrorException exceptionNSS4 = assertThrows(NSSErrorException.class, () -> {
            new MedecinTraitant("116877789147834", "LEBLANC", "Emilie", "F", "généraliste");
        });
        assertEquals( "Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 2 car il s'agit d'une femme", exceptionNSS4.getMessage());

        // Lorsque la civilité est différente de H ou F
        IllegalArgumentException exceptionNSS6 = assertThrows(IllegalArgumentException.class, () -> {
            new MedecinTraitant("196877789147836", "LEBLANC", "Paul", "Homme", "généraliste");
        });
        assertEquals( "Civilite doit être H ou F", exceptionNSS6.getMessage());
    }
}