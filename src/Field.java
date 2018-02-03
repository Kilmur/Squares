
public class Field {
	private int nStates;
	private int[][] field;

	public Field(int size, int nStates) {
		this.nStates = nStates;
		this.field = new int[size][size];
	}

	public int getState(int x, int y) {
		return this.field[x][y];
	}

	public void nextState(int x, int y) {
		this.field[x][y] = (this.field[x][y] + 1) % this.nStates;
	}
}
