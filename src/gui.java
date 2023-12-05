import javax.swing.*;
import java.awt.*;

public class gui {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;

    public gui(PendulumPanel pendulumPanel) {
        JFrame frame = new JFrame("Pendulum Simulation");
        frame.add(pendulumPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
