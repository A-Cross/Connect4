
public class Board {

	private char[][] board;
	
	public Board(int size) {
		board = new char[size][size];
	}
	
	public void placeToken(int x, int y, char token) {
		board[x][y] = token;
	}
	
	public String toString() {
		String toReturn = "";
		for(int i=0; i<board.length; i++) {
			toReturn += ((i+1) + " ");
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j] == '\0') {
					toReturn += (". ");
				}
				else {
					toReturn += (board[i][j] + " ");
				}
			}
			toReturn += "\n";
		}
		toReturn += ("  1 2 3");
		return toReturn;
	}
}
