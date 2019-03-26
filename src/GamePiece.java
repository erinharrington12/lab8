/**
 * 
 * @author Erin Harrington
 * 
 *         Enum to represent the game pieces available in a board game. Each
 *         game piece has a color and a shape (represented by a
 *         GamePieceAppearance object) and move priority (the piece with the
 *         lowest priority value gets to move first,turns are taken in priority
 *         value order (increasing)).Each constant represents a game piece that
 *         a player might choose to use in the board game.
 *
 */

public enum GamePiece
{
    /**
     * Enum constant game pieces with associated color, shape and priority
     */
    RED_RACER((new GamePieceAppearance(Color.RED, Shape.RACECAR)), 0),
    BLUE_RACER((new GamePieceAppearance(Color.BLUE, Shape.RACECAR)), 2),
    MAGENTA_RACER((new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR)), 1),
    RED_THIMBLE((new GamePieceAppearance(Color.RED, Shape.THIMBLE)), 10),
    BLUE_BOOT((new GamePieceAppearance(Color.BLUE, Shape.BOOT)), 5),
    GREEN_BOOT((new GamePieceAppearance(Color.GREEN, Shape.BOOT)), 8),
    YELLOW_BOOT((new GamePieceAppearance(Color.YELLOW, Shape.BOOT)), 7);

    /**
     * Private appearance and priority variables
     */
    private GamePieceAppearance appearance;
    private int priority;

    /**
     * 
     * @param appearance Game piece appearance
     * @param priority   Game piece priority (who moves first)
     */
    private GamePiece(GamePieceAppearance appearance, int priority)
    {

        this.appearance = appearance;
        this.priority = priority;
    }

    /**
     * 
     * @return Game piece appearance color
     */
    public Color getColor()
    {
        return appearance.getColor();
    }

    /**
     * 
     * @return Game piece appearance shape
     */
    public Shape getShape()
    {
        return appearance.getShape();
    }

    /**
     * 
     * @param a First player's game piece
     * @param b Second player's game piece
     * @return Returns who move first, based on priority (lowest number has higher
     *         priority)
     */
    public GamePiece movesFirst(GamePiece a, GamePiece b)
    {
        // Compares both player's game pieces
        if (a.priority < b.priority)
        {
            return a;

        }
        else
        {
            return b;
        }
    }

    /**
     * toString method with A string of the format "%s: a %s %s with priority %d",
     * with replacements in order:
     * (1) The name of the enum constant (e.g.BLUE_RACER)
     * (2) The name of the game piece's color
     * (3) The name of the game piece's shape
     * (4) The priority value of the game piece
     */
    public String toString()
    {
        return String.format("%s: a %s %s with priority %d", this.name(), this.getColor(), this.getShape(),
                this.priority);
    }
}
