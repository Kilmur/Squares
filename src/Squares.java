import javax.swing.JFrame;

public class Squares {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        SquaresPanel squaresPanel = new SquaresPanel();
        frame.add(squaresPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Квадратики");

        frame.setVisible(true);

    }

}
