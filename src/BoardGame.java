import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 
 * @author Erin Harrington
 *
 *         Class to represent a board game. The board game consists of several
 *         players (each represented only by their name)moving game pieces to
 *         different locations on the board. Each player has a unique,
 *         associated game piece (i.e. eachplayer has only one game piece, and a
 *         game piece can be assigned to, at most, 1 player).Turns are taken
 *         one-at-a-time in this board game. In the case that two players which
 *         to move at the same time,the contest is resolved by the priority
 *         given to the game pieces associated to the two players.
 */
public class BoardGame
{

    /**
     * Declares two LinkedHashMaps for the player's pieces and player's locations
     */
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;

    /**
     * Default constructor that initializes the two previously declared
     * LinkedHashMaps
     */
    public BoardGame()
    {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }

    /**
     * 
     * @param playerName      Player's name
     * @param gamePiece       Player's desired gamePiece
     * @param initialLocation Player's inital location on the board
     * @return false if there already is a player associated with the game piece
     * 
     *         Method simply adds the player to the game if there isn't already a
     *         player with that piece
     */
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
    {

        boolean pieceCheck = true;

        if (playerPieces.containsValue(gamePiece))
        {
            pieceCheck = false;
        }
        else
        {
            playerPieces.put(playerName, gamePiece);
            playerLocations.put(playerName, initialLocation);
        }

        return pieceCheck;

    }

    /**
     * 
     * @param playerName Player's name
     * @return Returns the game piece associated with the player's name
     */
    public GamePiece getPlayerGamePiece(String playerName)
    {

        return playerPieces.get(playerName);
    }

    /**
     * 
     * @param gamePiece Player's game piece
     * @return Returns the player's name that's associated with a game piece
     */
    public String getPlayerWithGamePiece(GamePiece gamePiece)
    {

        if (playerPieces.containsValue(gamePiece))
        {
            //Iterates through playerPieces map to find appropriate game piece
            for (String key : playerPieces.keySet())
            {
                if (playerPieces.get(key).equals(gamePiece))
                {
                    return key;
                }
            }
        }
        return null;
    }

    /**
     * 
     * @param playerName Player's name
     * @param newLocation Player's new location after moving
     */
    public void movePlayer(String playerName, Location newLocation)
    {
        //Replaces the player's old location with new one
        playerLocations.replace(playerName, newLocation);
    }

    public String[] moveTwoPlayer(String[] playerNames, Location[] newLocations)
    {
        return playerNames;

    }

    /**
     * 
     * @param player Player's name
     * @return Player's location
     */
    public Location getPlayersLocation(String player)
    {
        return playerLocations.get(player);

    }

    /**
     * 
     * @param loc Desired location to find players
     * @return Returns list of players at desired location
     */
    public ArrayList<String> getPlayersAtLocation(Location loc)
    {
        //Initalizes ArrayList of players (strings)
        ArrayList<String> playersAtLoc = new ArrayList<String>();

        //Iterates through playerLocations map to find players from location
        if (playerLocations.containsValue(loc))
        {
            for (String pl : playerLocations.keySet())
            {
                if (playerLocations.get(pl).equals(loc))
                {
                    playersAtLoc.add(pl);
                }
            }
        }

        return playersAtLoc;
    }

    /**
     * 
     * @param loc Desired location to find game pieces
     * @return Returns game pieces from desired location
     */
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
    {
        //Initializes ArrayList of game pieces 
        ArrayList<GamePiece> piecesAtLoc = new ArrayList<GamePiece>();

        //Iterates through playerLocations map to find game pieces from desired location
        if (playerLocations.containsValue(loc))
        {
            for (String key : playerPieces.keySet())
            {
                if (playerPieces.get(key).equals(loc))
                {
                    piecesAtLoc.add(playerPieces.get(key));
                }
            }
        }

        return piecesAtLoc;

    }

    /**
     * 
     * @return All players in game
     */
    public Set<String> getPlayers()
    {

        return playerPieces.keySet();
    }

    /**
     * 
     * @return Returns all locations that players are at
     */
    public Set<Location> getPlayerLocations()
    {

        //Initializes HashSet for the player's locations
        HashSet<Location> playerLocationSet = new HashSet<Location>();

        //Iterates through playerLocations map to return all locations occupied
        for (String key : playerLocations.keySet())
        {
            if (!(playerLocations.keySet().isEmpty()))
            {
                playerLocationSet.add(playerLocations.get(key));
            }
        }

        return playerLocationSet;

    }

    /**
     * 
     * @return Returns all game pieces associated with players
     */
    public Set<GamePiece> getPlayerPieces()
    {

        //Initializes HashSet list of game pieces
        HashSet<GamePiece> playerPieceSet = new HashSet<GamePiece>();

        //Iterates through playerPieces map to return all game pieces being used
        for (String key : playerPieces.keySet())
        {
            if (!(playerPieces.keySet().isEmpty()))
            {
                playerPieceSet.add(playerPieces.get(key));
            }
        }

        return playerPieceSet;

    }
}
