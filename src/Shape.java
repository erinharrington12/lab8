/**
 * 
 * @author Erin Harrington
 *
 *Enum to reprsent the shape of a game piece
 */
public enum Shape {

	THIMBLE,
	BOOT,
	RACECAR;
	
    /**
     * @return The enum object's name in lowercase
     */
	public String toString() {
		return this.name().toLowerCase();
		
	}
}
