import javax.swing.*;
import java.awt.*;

public class PendulumPanel extends JPanel {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    private final Pendulum pendulum;
    private double time = 0;
    private static final double DELTA_TIME = 1;

    public PendulumPanel(Pendulum pendulum) {
        this.pendulum = pendulum;

        Timer timer = new Timer(17, e -> {
            time += DELTA_TIME;
            repaint();
        });
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        int endPointX = (int) (HEIGHT/2 + pendulum.getXCord(time));
        int endPointY = (int) (HEIGHT/2 - pendulum.getYCord(time));
        g2d.drawLine(HEIGHT/2, WIDTH/2, endPointX, endPointY);
        g2d.fillOval((int) (endPointX - pendulum.getRadius()/2),
                (int) (endPointY - pendulum.getRadius()/2),
                (int) pendulum.getRadius(),
                (int) pendulum.getRadius());
    }
}
