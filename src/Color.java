/**
 * 
 * @author Erin Harrington
 * 
 * Enum class to represent a color (with rgb values)
 *
 */

public enum Color {

    /**
     * All colors desired with designated rgb values
     */
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255),
	YELLOW(255, 255, 0),
	CYAN(0, 255, 255),
	MAGENTA(255, 0, 255);
	
    /**
     * Private r, g, and b variables
     */
	private int r;
	private int g;
	private int b;
	
	/**
	 * 
	 * @param r Red value
	 * @param g Green value
	 * @param b Blue value
	 * 
	 * Assigns input rgb values
	 */
	private Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * 
	 * @return Red value
	 */
	public int getR() {
		return r;
	}
	
	/**
	 * 
	 * @return Green value
	 */
	public int getG() {
		return g;
	}
	
	/**
	 * 
	 * @return Blue value
	 */
	public int getB() {
		return b;
	}
}
