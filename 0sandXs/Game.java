
import java.util.ArrayList;

public class Game {
	
	public static void main(String[] args) {
		Game g = new Game();
		g.playGame();
	}
	
	public void playGame() {
		Board board = new Board(3);
		// print board
		View view = new CLIView();
		view.display(board.toString());
		
		ArrayList<Player> players = new ArrayList<>();
		
		players.add(new ComputerPlayer('0'));
		players.add(new HumanPlayer('X'));
		int currentPlayer = 0;
		
		while(true) {
			int x = players.get(currentPlayer).getMove();
			int y = players.get(currentPlayer).getMove();
			// place the token
			board.placeToken(x-1, y-1, players.get(currentPlayer).getToken());
			// print the board
			view.display(board.toString());
			// change player
			currentPlayer = (currentPlayer+1)%players.size();
		}
		
		
	}
	
}
