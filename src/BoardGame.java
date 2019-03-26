import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
            for (String key : playerPieces.keySet()) {
                if(playerPieces.get(key).equals(gamePiece)) {
                    return key;
                }
            }
        }
        return null;
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
        
        if (playerLocations.containsValue(loc)) {
            for (String pl : playerLocations.keySet()) {
                if(playerLocations.get(pl).equals(loc)) {
                    playersAtLoc.add(pl);
                }
            }
        }
        
        
        return playersAtLoc;
    }
    
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
        ArrayList<GamePiece> piecesAtLoc = new ArrayList<GamePiece>();
        
        if (playerLocations.containsValue(loc)) {
            for (String key : playerPieces.keySet()) {
                if(playerPieces.get(key).equals(loc)) {
                    piecesAtLoc.add(playerPieces.get(key));
                }
            }
        }
        
        
        return piecesAtLoc;
        
    }
    
    public Set<String> getPlayers() {
 
        return playerPieces.keySet();
    }
    
    public Set<Location> getPlayerLocations() {
       
        HashSet<Location> playerLocationSet = new HashSet<Location>();
       
        for (String key : playerLocations.keySet()) {
            if (!(playerLocations.keySet().isEmpty())) {
                playerLocationSet.add(playerLocations.get(key));
            } 
        }
        
        
        
        return playerLocationSet;
        
    }
    
    public Set<GamePiece> getPlayerPieces() {
       
        HashSet<GamePiece> playerPieceSet = new HashSet<GamePiece>();
        
        
        for (String key : playerPieces.keySet()) {
            if (!(playerPieces.keySet().isEmpty())) {
                playerPieceSet.add(playerPieces.get(key));
            }
        }
        
        
        
        return playerPieceSet;
        
    }
}


