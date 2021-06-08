import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanPlayer extends Player{

    private BufferedReader input;

    public HumanPlayer(char counter) {
        super(counter);
        input = new BufferedReader(new InputStreamReader(System.in));
    }


    public int getMove(){
        /* This method gets the human player's move. If the player inputs
         * a non-integer value, a message is printed warning them to
         * only enter integer values. Their counter is placed in column 1
         * to prevent the game from crashing.
         */
        try{
            return Integer.parseInt(input.readLine());
        }
        catch(Exception e){
            System.out.println("Please only enter integer values.");
            System.out.println("Your counter has been placed in column 1 by default.");
            return 1;
        }
    }
}
