import java.util.Scanner;

public class Coordinate {
    private final int MAXIMUM_VALUE = 2;
    private int row;
    private int column;

    public Coordinate(){
        this.row = 0;
        this.column = 0;
    }

    public Coordinate(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void read(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        this.row = this.readValidValue("row");
        this.column = this.readValidValue("column");
    }

    private int readValidValue(String key){
        Scanner in = new Scanner(System.in);
        int value;
        do{
            System.out.printf("Type %s [0..2]: ", key);
            value = in.nextInt();
        }while(value < 0 || value > MAXIMUM_VALUE);
        return value;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }
}
