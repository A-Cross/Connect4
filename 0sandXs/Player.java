

public abstract class Player {
	
	private char token;

	public Player(char token) {
		this.token = token;
	}
	
	abstract int getMove();
	
	public char getToken() {
		return token;
	}
}
