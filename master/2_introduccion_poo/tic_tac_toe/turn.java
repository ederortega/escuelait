class Turn{
    private int index;

    public Turn(){
        this.index = 0;
    }

    public int who(){
        return this.index;
    }

    public int oposite(){
        return (this.index + 1) % 2;
    }

    public void shift(){
        this.index = (this.index + 1) % 2;
    }
}