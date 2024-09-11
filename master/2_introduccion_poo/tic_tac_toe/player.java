class Player{
    private char token;

    public Player(char token){
        this.token = token;
    }

    public char getToken(){
        return this.token;
    }

    public void place(Board board) {
        Coordinate coordinate = new Coordinate();
        System.out.printf("'%s' is playing...", this.token);
        coordinate.read();
        board.setToken(this.token, coordinate);
    }

    public boolean win(Board board){
        return board.isTicTacToe(this.token);
    }
}