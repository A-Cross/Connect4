import java.util.Random;

public class ComputerPlayer extends Player{
	
	private Random rand;

	public ComputerPlayer(char token) {
		super(token);
		rand = new Random();
	}
	
	public int getMove() {
		return (rand.nextInt(3)+1);
	}
}
