
class TicTacToe {
	
    private Board board;
    private final Player[] players;
    private final Turn turn;

    public TicTacToe(){
        this.board = new Board();
        this.players = new Player[2];
        this.players[0] = new Player('X');
        this.players[1] = new Player('O');
        this.turn = new Turn();
    }

    public void play(){
        do{
            this.board.show();
            this.players[this.turn.who()].place(this.board);
            this.turn.shift();
        }while(!this.board.isFull() && !this.players[this.turn.oposite()].win(this.board));
       this.result();
    }

    private void result(){
        this.board.show();
        if(this.players[this.turn.oposite()].win(this.board)){
            System.out.printf("Token %s wins!!!", this.players[this.turn.oposite()].getToken());
        }
        else{
            System.out.println("Draw!");
        }
    }

	public static void main(String[] args) {
        new TicTacToe().play();
    }
}
