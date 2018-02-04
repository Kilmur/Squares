import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
