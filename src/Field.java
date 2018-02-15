import java.util.Random;

public class Field {
    private int nStates;
    private int[][] field;
    private int size;
    private int difficulty;

    public Field(int size, int nStates, int difficulty) {
        this.nStates = nStates;
        this.field = new int[size][size];
        this.size = size;
        this.difficulty = difficulty;
        generate();
    }

    public int getState(int x, int y) {
        return field[x][y];
    }

    public void nextState(int x, int y) {
        field[x][y] = (field[x][y] + 1) % nStates;
    }

    public void previousState(int x, int y) {
        field[x][y] = (field[x][y] + nStates - 1) % nStates;
    }

    public boolean isWin() {
        for(int x=0; x<size; x++) {
            for(int y=0; y<size; y++) {
                if(field[x][y] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void generate() {
        Random random = new Random();
        int x, y;
        for(int s=0; s<difficulty; s++) {
            x = random.nextInt(size-1) + 1;
            y = random.nextInt(size-2) + 1;
            for(int i=x-1; i<=x+1; i++) {
                for(int j=y-1; j<=y+1; j++) {
                    previousState(i, j);
                }
            }
        }
    }
}
