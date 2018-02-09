import java.awt.GridLayout;

import javax.swing.JFrame;

public class Squares {

    final static int SIZE = 10;
    final static int N_STATES = 5;
    final static int DIFFICULTY = 10; // количество псевдонажатий для генерации случайного поля

    public static void main(String[] args) {

        JFrame frame = new JFrame("Квадратики");
        frame.setSize(400, 400);

        SquaresPanel squaresPanel = new SquaresPanel(SIZE, N_STATES, DIFFICULTY);
        squaresPanel.setLayout(new GridLayout(SIZE, SIZE));

        frame.add(squaresPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
