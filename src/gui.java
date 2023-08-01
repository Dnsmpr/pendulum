import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    private final Pendulum pendulum;
    private double time = 0;
    private static final double DELTA_TIME = 1;
    public gui(Pendulum pendulum) {
        this.pendulum = pendulum;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setName("Pendulum simulation");
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Timer timer = new Timer(150, e -> {
            time += DELTA_TIME;
            repaint();
        });
        timer.start();

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paint(g2d);
        int endPointX = (int) (HEIGHT/2 + pendulum.getXCord(time));
        int endPointY = (int) (HEIGHT/2 - pendulum.getYCord(time));
        g2d.drawLine(HEIGHT/2, WIDTH/2, endPointX, endPointY);
        g2d.drawOval((int) (endPointX - pendulum.getRadius()/2),
                (int) (endPointY - pendulum.getRadius()/2),
                (int) pendulum.getRadius(),
                (int) pendulum.getRadius());
    }

}
