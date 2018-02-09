import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WinnerWindow {

    Field field;

    public WinnerWindow(Field field){
        this.field = field;
    }

    public void createWindow(){

        final JFrame winnerFrame = new JFrame("Победа");
        winnerFrame.setSize(300, 90);
        winnerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        winnerFrame.add(panel);

        JLabel label = new JLabel("Поздравляем! Вы победили!");
        JButton btnNewGame = new JButton("Начать заново");
        JButton btnExit = new JButton("Выход");

        panel.add(label);
        panel.add(btnNewGame);
        panel.add(btnExit);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.generate();
                winnerFrame.dispose();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        winnerFrame.setVisible(true);
    }
}
