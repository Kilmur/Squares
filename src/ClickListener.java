import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClickListener implements ActionListener{

    Field field;
    SquaresPanel owner;
    public ClickListener(SquaresPanel owner, Field field) {
        this.owner = owner;
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        CellButton parent = (CellButton) event.getSource();
        int x = parent.x;
        int y = parent.y;
        for(int i=x-1; i<=x+1; i++){
            for(int j=y-1; j<=y+1; j++){
                field.nextState(i, j);
            }
        }
        owner.updateButtonColors(x, y);
        if(field.isWin()) {
            String[] options = {"New game", "Exit"};
            int answer = JOptionPane.showOptionDialog(
                    owner, "You solved it! Do you want to continue?", "Congratulations!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]
                    );
            if(answer == JOptionPane.OK_OPTION) {
                field.generate();
                owner.updateButtonColors();
            } else {
                System.exit(0);
            }
        }
    }
}
