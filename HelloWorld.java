/**
 * HelloWorld - petit programme d'exemple
 *
 * Ce programme affiche quelques messages de confirmation pour
 * expliquer chaque étape lorsqu'il est exécuté.
 *
 * Modifications apportées:
 * - Renommage de la classe pour correspondre au nom du fichier
 *   (HelloWorld) afin d'éviter une erreur de compilation Java.
 * - Ajout de commentaires explicatifs en français.
 * - Ajout de sorties de confirmation : démarrage, informations
 *   sur les arguments, message principal et fin d'exécution.
 */
public class HelloWorld {

    /**
     * Point d'entrée du programme.
     * @param args arguments fournis en ligne de commande (peuvent être vides)
     */
    public static void main(String[] args) {

        // Confirmation : le programme démarre
        System.out.println("[INFO] Démarrage du programme HelloWorld");

        // Affiche le nombre d'arguments reçus (utile pour le debug)
        System.out.println("[INFO] Nombre d'arguments: " + args.length);
        if (args.length > 0) {
            System.out.print("[INFO] Arguments reçus:");
            for (String a : args) {
                System.out.print(" '" + a + "'");
            }
            System.out.println();
        }

        // Message principal
        System.out.println("Hello, Majdi!!!!");

        // Confirmation : fin normale
        System.out.println("[INFO] Exécution terminée avec succès.");
    }

}
