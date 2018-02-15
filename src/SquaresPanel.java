import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class SquaresPanel extends JPanel {
    private static final long serialVersionUID = 8666701455261624276L;
    int size;
    int nStates;
    Color[] stateColors;
    private CellButton[][] buttons;
    Field field;

    public SquaresPanel(int size, int nStates, int difficulty) {
        this.size = size;
        stateColors = new Color[]{
                Color.WHITE, Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.PINK, Color.GRAY, Color.BLACK
                };
        this.nStates = nStates;
        if(nStates > stateColors.length) {
            this.nStates = stateColors.length;
        }
        field = new Field(this.size, this.nStates, difficulty);
        setLayout(new GridLayout(this.size, this.size));
        buttons = new CellButton[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                CellButton button = new CellButton(i, j);
                button.setOpaque(true);
                buttons[i][j] = button;
                add(button);
            }
        }
        ClickListener listener = new ClickListener(this, field);
        for(int i=1; i<size-1; i++) {
            for(int j=1; j<size-1; j++) {
                buttons[i][j].addActionListener(listener);
            }
        }
        updateButtonColors();
    }

    public void updateButtonColors() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                Color state = stateColors[field.getState(i, j)];
                buttons[i][j].setBackground(state);
            }
        }
    }

    public void updateButtonColors(int x, int y) {
        for(int i=x-1; i<=x+1; i++) {
            for(int j=y-1; j<=y+1; j++) {
                Color state = stateColors[field.getState(i, j)];
                buttons[i][j].setBackground(state);
            }
        }
    }
}
