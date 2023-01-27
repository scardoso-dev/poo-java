import classes.Chat;

/**
 * Classe Main de l'exercice 4
 * @author Samuel CARDOSO
 */
public class Main {

    /**
     * Fonction qui gère l'instanciation de la classe Chat
     * @param nom (String) Nom du Chat
     * @param nombrePuces (int) Nombre de puces du Chat
     * @return (Chat) Renvoie l'instance Chat si tout s'est bien déroulé, null sinon
     */
    public static Chat createChat(String nom, int nombrePuces) {
        Chat chat = null;
        try {
            chat = new Chat(nom, nombrePuces);
        } catch (Exception e) {
            System.out.println("\tMauvaise saisie ! "+e);
        }
        if (chat != null) {
            if (chat.getNombrePuces() > 1) {
                System.out.println("\tle voici : " + chat.getNom() + " a " + chat.getNombrePuces() + " puces.");
            }
            else if (chat.getNombrePuces() == 1) {
                System.out.println("\tle voici : " + chat.getNom() + " a " + chat.getNombrePuces() + " puce.");
            }
        }
        return chat;
    }
    public static void main(String[] args) {
        Chat[] chats = new Chat[3];
        System.out.println("Création d'un premier chat");
        chats[0] = createChat("Lily", 4);
        System.out.println("Création d'un second chat");
        chats[1] = createChat("Prune", -3);
        System.out.println("Création d'un troisième chat");
        chats[2] = createChat("Prune", 1);

        System.out.println("\n");
        System.out.println("Création d'un second chat");
        chats[1] = createChat("", 1);
        System.out.println("Création d'un second chat");
        chats[1] = createChat(null, 1);
    }
}