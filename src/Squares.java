import javax.swing.JFrame;

public class Squares {

    final static int SIZE = 10;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        SquaresPanel squaresPanel = new SquaresPanel(SIZE);
        frame.add(squaresPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Квадратики");

        frame.setVisible(true);

    }

}
