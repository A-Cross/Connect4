public abstract class Player {

    //This counter represents the player on the board
    private char counter;

    public Player (char counter){
        this.counter = counter;
    }

    //Each subclass has it's own getMove method
    abstract int getMove();

    public char getCounter(){
        return counter;
    }
}
