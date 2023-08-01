import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    public gui(PendulumPanel pendulumPanel) {
        this.add(pendulumPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setName("Pendulum simulation");
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
