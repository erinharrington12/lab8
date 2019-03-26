package lab8;

public enum Color {

	RED,
	GREEN,
	BLUE,
	YELLOW,
	CYAN,
	MAGENTA
	
	private int r;
	private int g;
	private int b;
	
	private Color(int r, int g, int b) {
		
	}
	
	public int getR() {
		return r;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}
}
