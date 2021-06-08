import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HumanPlayer extends Player{
	
	private BufferedReader in;
	
	public HumanPlayer(char token) {
		super(token);
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int getMove() {
		try {
			return Integer.parseInt(in.readLine());
		}
		catch(IOException e) {
			return -1;
		}
	}

}
