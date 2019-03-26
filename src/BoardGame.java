import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class BoardGame
{

    
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;
    
    public BoardGame() {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
        
        boolean pieceCheck = true;
        
        if (playerPieces.containsValue(gamePiece)) {
            pieceCheck = false;
        } else {
            playerPieces.put(playerName, gamePiece);
            playerLocations.put(playerName, initialLocation);
        }
        
        return pieceCheck;
        
    }
    
    public GamePiece getPlayerGamePiece(String playerName) {
        
        return playerPieces.get(playerName);
    }
    
    public String getPlayerWithGamePiece(GamePiece gamePiece) {

        if (playerPieces.containsValue(gamePiece)) {
            for (String gp : playerPieces.keySet()) {
                if(playerPieces.get(gp.equals(gamePiece))) {
                    return gp;
                }
            }
        }
        
    }
    
    public void movePlayer(String playerName, Location newLocation) {
        playerLocations.replace(playerName, newLocation);
    }
    
    public String[] moveTwoPlayer(String[] playerNames, Location[] newLocations) {
        return playerNames;
        
    }
    
    public Location getPlayersLocation(String player) {
        return playerLocations.get(player);
        
    }
    
    public ArrayList<String> getPlayersAtLocation(Location loc){
        ArrayList<String> playersAtLoc = new ArrayList<String>();
        
        if (playerLocations.containsKey(loc)) {
            for (String pl : playerLocations.keySet()) {
                
            }
        }
        
        
        return null;
    }
    
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
        return null;
        
    }
    
    public Set<String> getPlayers() {
        return null;
        
    }
    
    public Set<Location> getPlayerLocations() {
        return null;
        
    }
    
    public Set<GamePiece> getPlayerPieces() {
        return null;
        
    }
}


