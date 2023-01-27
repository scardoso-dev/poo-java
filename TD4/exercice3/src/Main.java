import classes.InputNonPairException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe Main de l'exercice 3
 * @author Samuel CARDOSO
 */
public class Main {

    /**
     * Fonction pour permettre une saisie correcte
     * @return (int) Retourne la saisie sous forme d'entier si la saisie est conforme
     */
    public static int saisieCorrecte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez un entier : ");
        String str = sc.nextLine();
        if (!str.matches("-?\\d+")) {
            throw new InputMismatchException("La saisie doit être un entier !");
        }
        System.out.println("L'entier saisi est : " + str);
        return Integer.parseInt(str);
    }

    /**
     * Fonction de saisie d'un entier pair, avec gestion des exceptions
     * @return (int) Renvoi la saisie sous forme d'entier si elle est conforme
     * @throws InputNonPairException
     */
    public static int saisieIntPair() throws InputNonPairException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez un entier paire : ");
        String str = sc.nextLine();
        if (!str.matches("-?\\d+")) {
            throw new InputMismatchException("La saisie doit être un entier !");
        }
        if (Integer.parseInt(str)%2 != 0) {
            throw new InputNonPairException("Erreur : valeur impair");
        }
        System.out.println("L'entier saisi est : " + str);
        return Integer.parseInt(str);
    }

    /**
     * Deuxième version de la fonction de saisie d'un entier pair, avec gestion des exceptions
     * @return (int) Renvoi la saisie sous forme d'entier si elle est conforme
     */
    public static int saisieIntPair2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez un entier paire : ");
        String str = sc.nextLine();
        if (!str.matches("-?\\d+")) {
            throw new InputMismatchException("La saisie doit être un entier !");
        }
        if (Integer.parseInt(str)%2 != 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("L'entier saisi est : " + str);
        return Integer.parseInt(str);
    }

    /**
     * Fonction qui contient le code nécessaire pour valider la question 1 du TD
     * @return (int) Renvoie la saisie sous forme d'entier si tout est ok, -1 sinon
     */
    public static int question1() {
        System.out.println("Question 1");
        int saisie = -1;
        try {
            saisie = saisieCorrecte();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        while(saisie == -1) {
            System.out.println("Souhaitez-vous effectuer une nouvelle saisie ? y ou n");
            String str = sc.nextLine();
            System.out.println(str);
            if (str.equals("y")) {
                try {
                    saisie = saisieCorrecte();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
        }
        return saisie;
    }

    /**
     * Fonction qui contient le code nécessaire pour valider la question 2 du TD
     * @return (int) Renvoie la saisie sous forme d'entier si tout est ok, -1 sinon
     */
    public static int question2() {
        System.out.println("Question 2");
        int saisie = -1;
        try {
            saisie = saisieIntPair();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        while(saisie == -1) {
            System.out.println("Souhaitez-vous effectuer une nouvelle saisie ? y ou n");
            String str = sc.nextLine();
            System.out.println(str);
            if (str.equals("y")) {
                try {
                    saisie = saisieIntPair();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
        }
        return saisie;
    }

    /**
     * Fonction qui contient le code nécessaire pour valider la question 3 du TD
     * @return (int) Renvoie la saisie sous forme d'entier si tout est ok, -1 sinon
     */
    public static int question3() {
        System.out.println("Question 3");
        int saisie = -1;
        try {
            saisie = saisieIntPair();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        while(saisie == -1) {
            System.out.println("Souhaitez-vous effectuer une nouvelle saisie ? y ou n");
            String str = sc.nextLine();
            System.out.println(str);
            if (str.equals("y")) {
                try {
                    saisie = saisieIntPair2();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
        }
        return saisie;
    }
    public static void main(String[] args) throws InputNonPairException {

        /* ########################################################################################### */
        /* On veut écrire la fonction saisieCorrecte qui permet de saisir correctement un              */
        /* entier. Si l'utilisateur saisit une donnée dont le format n'est pas celui d'un entier, le   */
        /* programme lève l'exception java InputMismatchException qui appartient au package java.util. */
        /* ########################################################################################### */

        /* ------------------------------------------------------------------------------------------- */
        /* Question 1) La fonction saisieCorrecte devra traiter cette erreur en fournissant une        */
        /* solution alternative : Un message d'erreur sera affiché avec la proposition d'effectuer une */
        /* nouvelle saisie.                                                                            */
        /* ------------------------------------------------------------------------------------------- */

        int entier1 = question1();

        /* ------------------------------------------------------------------------------------------- */
        /* Question 2 - L'entier saisi doit être impérativement paire. On demande donc de créer une    */
        /* classe d'exception adaptée à cette erreur, puis de modifier le programme afin de traiter ce */
        /* cas d'erreur.                                                                               */
        /* ------------------------------------------------------------------------------------------- */

        int entier2 = question2();

        /* ------------------------------------------------------------------------------------------- */
        /* Question 3 - Utiliser l'exception prédéfinie IllegalArgumentException pour vérifier que     */
        /* l'entier saisi est paire.                                                                   */
        /* ------------------------------------------------------------------------------------------- */

        int entier3 = question3();
    }
}