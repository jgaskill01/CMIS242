import java.util.ArrayList;
import java.util.List;

/**
 * Steam Deck Driver class
 *
 * Creates the object and runs the add/get methods for the games.
 *
 * @author Andrew Shavatt, Edited by Jacob Gaskill (CMIS 242/7380) 03/25/2023
 */
public class UpdatedSteamDeckDriver {

    /**
     * Program entrypoint
     *
     * @param args (NOT USED!) Program arguments.
     */
    public static void main(String[] args) {
        // Create an instance of the Steam Deck.
        UpdatedSteamDeck ownedSteamDeck = new UpdatedSteamDeck(new ArrayList<>(), "Andrew");
        UpdatedSteamDeck unownedSteamDeck = new UpdatedSteamDeck();

        // List the games, to show that it's empty
        System.out.println("Initial Steam Decks:");
        System.out.println(ownedSteamDeck.toString());
        System.out.println(unownedSteamDeck.toString());

        // Add a few games
        ownedSteamDeck.addGame("Elden Ring");
        ownedSteamDeck.addGame("Dark Souls 3");
        ownedSteamDeck.addGame("Monster Hunter World");

        // This game will print an error message to the console
        ownedSteamDeck.addGame("");

        // Set a new owner for the unowned Steam Deck and make sure it set properly
        unownedSteamDeck.setOwner("Bob");
        System.out.printf("The unowned Steam Deck has been claimed by: %s\n", unownedSteamDeck.getOwner());
        unownedSteamDeck.setSteamDeckId(unownedSteamDeck.generateId());

        // Set new games and check to make sure they're set properly
        List<String> newGames = new ArrayList<String>();
        newGames.add("Sons of the Forest");
        newGames.add("Nier Automata");
        newGames.add("Final Fantasy 15");
        unownedSteamDeck.setGames(newGames);
        System.out.printf("The following games have been added to Bob's Steam Deck: %s\n",
                String.join(", ", unownedSteamDeck.getGames()));

        // List the added games
        System.out.println("\nFinal Steam Decks:");
        System.out.println(ownedSteamDeck.toString());
        System.out.println(unownedSteamDeck.toString());
    }
}
