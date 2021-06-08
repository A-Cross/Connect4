public class Board {//Interface to get character???

    private char board[][];

    public Board(int rows, int columns) {
        //Instantiates the connect four board.
        board = new char[rows][columns];
    }

    public String printBoard() {
        /*This method will be used to print the connect four board.
        * Each point on the board is checked to see if one of the
        * player counters has been placed, and if so, adds the
        * correct character to the string. Otherwise, it adds an empty space.
        * The string is returned and used to print the board.
        */
        String boardPrint = "";
        for (int i = 0; i < board.length - 1; i++) {
            boardPrint += ("|");
            for (int j = 0; j < board[i].length - 1; j++) {
                if (board[i][j] == '\0') {
                    boardPrint += "   |";
                }
                else if (board[i][j] == 'y' || board[i][j] == 'r') {
                    boardPrint += (" " + board[i][j] + " |");
                }
            }
            boardPrint += "\n";
        }
        boardPrint += ("  1   2   3   4   5   6   7");
        return boardPrint;
    }

    public void placeCounter(char counter, int column) {
        /*The player and column parameters are used to place the
        * player's counter. The player parameter is used to check
        * which counter to place. The column parameter is used to see
        * which column the player wants to put their token.
        */
        for (int i = board.length - 2; i >= 0; i--) {
            Character ch = Character.MIN_VALUE;
            if (board[i][column - 1] == ch) {
                board[i][column - 1] = counter;
                break;
            }
        }
    }

    public boolean horizontalWin(char counter) {
        /*Checks if there are four counters in a row in the horizontal
        * direction. If so, returns a true value; if not, returns a false
        * value.
         */
        boolean horiWin = false;

        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[0].length - 1; j++) {
                if (board[i][j] == counter
                        && board[i][j+1] == counter
                        && board[i][j+2] == counter
                        && board[i][j+3] == counter){

                    horiWin = true;
                }
            }
        }
        return horiWin;
    }

    public boolean verticalWin(char counter){
        /*Checks if there are four counters in a row in the vertical
         * direction. If so, returns a true value; if not, returns a false
         * value.
         */
        boolean vertWin = false;

        for(int i=0; i<board.length - 1; i++){
            for(int j=0; j<board[0].length - 1; j++){
                if (board[i][j] == counter
                        && board[i+1][j] == counter
                        && board[i+2][j] == counter
                        && board[i+3][j] == counter){

                    vertWin = true;
                }
            }
        }
        return vertWin;
    }

    public boolean backwardDiagonalWin(char counter){
        /*Checks if there are four counters in a row in the backwards diagonal
         * (\) direction. If so, returns a true value; if not, returns a false
         * value.
         */
        boolean bDiagWin = false;

        for(int i=0; i<board.length - 1; i++){
            for(int j=0; j<board[0].length - 1; j++){
                if(board[i][j] == counter
                        && board[i+1][j+1] == counter
                        && board[i+2][j+2] == counter
                        && board[i+3][j+3] == counter){

                    bDiagWin = true;
                }
            }
        }
        return bDiagWin;
    }

    public boolean forwardDiagonalWin(char counter){
        /*Checks if there are four counters in a row in the forwards diagonal
         * (/) direction. If so, returns a true value; if not, returns a false
         * value.
         */
        boolean fDiagWin = false;

        for(int i=1; i<board.length - 1; i++){
            for(int j=0; j<board[0].length - 1; j++){
                if(board[i][j] == counter
                        && board[i-1][j+1] == counter
                        && board[i-2][j+2] == counter
                        && board[i-3][j+3] == counter){

                    fDiagWin = true;
                }
            }
        }
        return fDiagWin;
    }
}



