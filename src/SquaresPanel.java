import javax.swing.JPanel;

public class SquaresPanel extends JPanel {
	private static final long serialVersionUID = 8666701455261624276L;
	int size;
	private CellButton[][] buttons;
	
	public SquaresPanel(int size) {
		this.size = size;
		this.buttons = new CellButton[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				this.buttons[i][j] = new CellButton(i, j);
			}
		}
	}
}
