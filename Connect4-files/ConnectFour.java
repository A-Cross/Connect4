import java.util.ArrayList;

public class ConnectFour {

    public static void main(String[] args) {
        ConnectFour c4 = new ConnectFour();
        c4.playGame();
    }

    private void playGame(){
        //This method contains the game logic.
        System.out.println("Welcome to Connect 4");
        System.out.println("There are 2 players red and yellow");
        System.out.println("Player 1 is Red, Player 2 is Yellow");
        System.out.println("To play the game type in the number of the column you want to drop you counter in");
        System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
        System.out.println("");

        Board board = new Board(7, 8);
        System.out.println(board.printBoard());
        ArrayList<Player> players = new ArrayList<>();

        /*The human and computer players are instantiated and added to
         * the currentPlayer list. This list is used to determine the
         * order of play.
         */
        players.add(new HumanPlayer('r'));
        players.add(new ComputerPlayer('y'));
        int currentPlayer = 0;
        boolean hasWon = false;

        while (!hasWon){

            int column = players.get(currentPlayer).getMove();
            char counter = players.get(currentPlayer).getCounter();

            board.placeCounter(players.get(currentPlayer).getCounter(), column);

            boolean horizontalWinCheck = board.horizontalWin(counter);
            boolean verticalWinCheck = board.verticalWin(counter);
            boolean backwardDiagonalWinCheck = board.backwardDiagonalWin(counter);
            boolean forwardDiagonalWinCheck = board.forwardDiagonalWin(counter);

            if (horizontalWinCheck || verticalWinCheck || backwardDiagonalWinCheck || forwardDiagonalWinCheck){
                /*This if statement checks if any of the win conditions have been met, and if so, changes hasWon to true,
                 * breaking the while loop and ending the game with a congratulations message printed.
                 */
                hasWon = true;
                System.out.println("Congratulations " + counter + ", you have won the game!");
            }
            else {
                //If no win conditions are met, the next player has their turn.
                currentPlayer = (currentPlayer + 1) % players.size();
            }
            System.out.println(board.printBoard());
        }

    }

}


