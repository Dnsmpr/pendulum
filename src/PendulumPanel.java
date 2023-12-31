import javax.swing.*;
import java.awt.*;

public class PendulumPanel extends JPanel {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    private final Pendulum pendulum;
    private double time = 0;
    private static final double DELTA_TIME = 0.0167;
    private static final int REFRESH_RATE_60HZ = 17;

    public PendulumPanel(Pendulum pendulum) {
        this.pendulum = pendulum;
        new Timer(REFRESH_RATE_60HZ, e -> update()).start();
    }

    private void update() {
        time += DELTA_TIME;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        int endPointX = (int) (HEIGHT/2 + pendulum.getXCord(time));
        int endPointY = (int) (HEIGHT/5 - pendulum.getYCord(time));
        g2d.drawLine(HEIGHT/2, WIDTH/5, endPointX, endPointY);
        g2d.fillOval((int) (endPointX - pendulum.getRadius()/2),
                (int) (endPointY - pendulum.getRadius()/2),
                (int) pendulum.getRadius(),
                (int) pendulum.getRadius());
    }
}
