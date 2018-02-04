
import javax.swing.JPanel;

public class SquaresPanel extends JPanel {
	private static final long serialVersionUID = 8666701455261624276L;
	int size;
	int nStates;
	private CellButton[][] buttons;
	Field field = new Field(size, nStates);
	ClickListener clickListener = new ClickListener(field);

	public SquaresPanel(int size, int nStates) {
		this.size = size;
		this.nStates = nStates;
	}

	public void fillPanel(SquaresPanel squaresPanel){
	    buttons = new CellButton[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                buttons[i][j] = new CellButton(i, j);
                buttons[i][j].addActionListener(clickListener);
                squaresPanel.add(buttons[i][j]);

            }
        }
	}
}
