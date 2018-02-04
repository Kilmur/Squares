import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Squares {

    final static int SIZE = 10;
    final static int N_STATES = 5;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Квадратики");
        frame.setSize(400, 400);

        SquaresPanel squaresPanel = new SquaresPanel(SIZE, N_STATES);
        squaresPanel.fillPanel(squaresPanel);
        squaresPanel.setLayout(new GridLayout(SIZE, SIZE));


        frame.add(squaresPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
