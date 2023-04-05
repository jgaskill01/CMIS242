import java.util.ArrayList;
import java.util.List;

/**
 * Steam Deck
 *
 * An object representing a steam deck console.
 *
 * @author Andrew Shavatt, Edited by Jacob Gaskill (CMIS 242/7380) 03/25/2023
 */
public class UpdatedSteamDeck {
    private List<String> games;
    private String owner;
    private int steamDeckId;

    public UpdatedSteamDeck() {
        this.games = new ArrayList<String>();
        this.owner = "N/A";
    }

    public UpdatedSteamDeck(List<String> games, String owner) {
        this.games = games;
        this.owner = owner;
    }

    public UpdatedSteamDeck(List<String> games, String owner, int steamDeckId){
        this.games = games;
        this.owner = owner;
        this.steamDeckId = steamDeckId;
    }

    /**
     * Add a game to the Steam Deck.
     *
     * @param title Title of the game to add, must not be empty.
     */
    public void addGame(String title) {
        // Stop driver from adding an empty game title.
        if (!title.isEmpty()) {
            this.games.add(title);
        } else {
            System.out.println("No game title specified!\n");
        }
    }

    /**
     * List all games currently installed on the Steam Deck.
     *
     * @return A list of game titles.
     */
    public List<String> getGames() {
        return this.games;
    }

    /**
     * Set the list of games all at once.
     *
     * @param games A list of game titles.
     */
    public void setGames(List<String> games) {
        this.games = games;
    }

    /**
     * Get the current owner of the Steam Deck.
     *
     * @return The Steam Deck owner.
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Set the new owner of the Steam Deck.
     *
     * @param owner New owner of the Steam Deck.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSteamDeckId(int steamDeckId){
        this.steamDeckId = steamDeckId;
    }

    public int getSteamDeckId(){
        return this.steamDeckId;
    }

    public int generateId(){
        int id = 0;
        if (this.owner.equalsIgnoreCase(this.owner)){
            id = id + 1;
        } else {
            return id;
        }
        return id;
    }

    public String toString() {
        return String.format("The Steam Deck owned by \"%s\" (%s) has %d games: %s",
                this.owner, this.steamDeckId, this.games.size(), this.games.size() == 0 ? "None" : String.join(", ", this.games));
    }
}