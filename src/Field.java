public class Field {
    private int nStates;
    private int[][] field;
    private int size;
    SquaresPanel squaresPanel;
    private int difficulty;

    public Field(int size, int nStates, SquaresPanel squaresPanel, int difficulty) {
        this.nStates = nStates;
        this.field = new int[size][size];
        this.size = size;
        this.squaresPanel = squaresPanel;
        this.difficulty = difficulty;
    }

    public int getState(int x, int y) {
        return this.field[x][y];
    }

    public void nextState(int x, int y) {
        this.field[x][y] = (this.field[x][y] + 1) % this.nStates;
    }

    public void isWin(){
        boolean c = true;
        for(int x=0; x<size; x++){
            for(int y=0; y<size; y++){
                if(field[x][y]==field[0][0]){
                    continue;
                }else{
                    c = false;
                    break;
                }
            }
            if(!c){break;}
        }
        if(c){
            WinnerWindow winnerWindow = new WinnerWindow(this);
            winnerWindow.createWindow();
        }
    }

    public void generate(){
        int x;
        int y;
        for(int s =0; s<difficulty; s++){
            x = (int) ((Math.random()) * (size-2))+1;
            y = (int) ((Math.random()) * (size-2))+1;
            for(int i=x-1; i<=x+1; i++){
                for(int j=y-1; j<=y+1; j++){
                    this.nextState(i, j);
                }
            }
        }
        squaresPanel.updateButtonColors();


    }
}
