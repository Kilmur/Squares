import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{

    Field field;

    public ClickListener(Field field) {
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        CellButton parent = (CellButton) ae.getSource();
        int x = parent.x;
        int y = parent.y;

        for(int i=x-1; i<=x+1; i++){
            for(int j=y-1; j<=y+1; j++){
                field.raise(i, j);
            }
        }

    }

}
