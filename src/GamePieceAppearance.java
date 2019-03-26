/**
 * 
 * @author Erin Harrington
 * 
 * Class to represent the appearance of a game piece (color and shape)
 *
 */

public class GamePieceAppearance {
	
    /**
     * Private color and shape variables
     */
	private Color color;
	private Shape shape;
	
	/**
	 * 
	 * @param color Game piece color
	 * @param shape Game piece shape
	 */
	public GamePieceAppearance(Color color, Shape shape) {
		this.color = color;
		this.shape = shape;
	}
	
	/**
	 * 
	 * @return Game piece color
	 */
	public Color getColor() {
        return color;
		
	}
	
	/**
	 * 
	 * @return Game piece shape
	 */
	public Shape getShape() {
        return shape;
		
	}
}
