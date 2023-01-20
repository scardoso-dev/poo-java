package tests;

import classes.Livre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivreTest {
    private final PrintStream standardOut = System.out; // backup System.out pour le restaurer plus tard
    private final InputStream sysInBackup = System.in; // backup System.in pour le restaurer plus tard
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor, true));
    }

    /**
     * Fonction qui permet de mocker les saisies utilisateurs avant l'exécution d'une fonction ou d'une procédure
     * @param inputs String[] Tableau contenant les inputs à mocker
     */
    public void mockedInputs(String[] inputs) {
        StringBuilder simulatedUserInput = new StringBuilder();
        for (String input : inputs) {
            simulatedUserInput.append(input.concat(System.getProperty("line.separator")));
        }
        System.setIn(new ByteArrayInputStream(simulatedUserInput.toString().getBytes()));
    }

    /**
     * Fonction qui permet LA saisie utilisateur avant l'exécution d'une fonction ou d'une procédure
     * @param input String Saisie utilisateur à mocker
     */
    public void mockedInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
    @Test
    public void Livre() {
        mockedInputs(new String[]{"Mon livre", "MOI", "90"});
        Livre livre1 = new Livre();

        mockedInputs(new String[]{"Un autre livre", "Unknow", "41"});
        Livre livre2 = new Livre();

        // Vérification que l'on ne peut pas saisir une chaîne de caractères pour le prix
        mockedInputs(new String[]{"Livre 3", "Personne", "prix", "autre prix", "gratuit", "35"});
        Livre livre3 = new Livre();

        // réinitialisation de System.in et System.out à leur état initial
        System.setIn(sysInBackup);
        System.setOut(standardOut);

        assertEquals("Le prix du livre Mon livre de l'auteur MOI est de : 90 e", livre1.toString());
        assertEquals("Le prix du livre Un autre livre de l'auteur Unknow est de : 41 e", livre2.toString());
        assertEquals("Le prix du livre Livre 3 de l'auteur Personne est de : 35 e", livre3.toString());

    }
}