class Board{
    private final int DIMENSION = 3;
    private final char EMPTY = '_';
    private char[][] grid;

    public Board(){
        this.grid = new char[DIMENSION][DIMENSION];
        for(int i = 0; i < DIMENSION; i++){
            this.grid[i] = new char[DIMENSION];
            for(int j = 0; j < DIMENSION; j++){
                this.grid[i][j] = EMPTY;
            }
        }
    }

    public void show() {
        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){
                System.out.printf("%s ", this.grid[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isFull(){
        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){
                if(this.grid[i][j] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isTicTacToe(char token) {
        int[] horizontals = {0, 0, 0};
        int[] verticals = {0, 0, 0};
        int diagonal = 0;
        int opposite = 0;

        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){
                if(this.grid[i][j] == token){
                    horizontals[i]++;
                    verticals[j]++;
                    if(i == j){
                        diagonal++;
                    }
                    if(i + j == DIMENSION - 1){
                        opposite++;
                    }
                }
            }
        }
        if(diagonal == DIMENSION || opposite == DIMENSION){
            return true;
        }
        for(int i = 0; i < DIMENSION; i++){
            if(horizontals[i] == DIMENSION || verticals[i] == DIMENSION){
                return true;
            }
        }
        return false;
    }

    public void setToken(char token, Coordinate coordinate){
        this.grid[coordinate.getRow()][coordinate.getColumn()] = token;
    }
}