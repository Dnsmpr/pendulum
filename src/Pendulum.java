public final class Pendulum {
    private static final double GRAVITY = 9.82;
    private final int radius;
    private final double length;
    private final double omega;
    private final double initialTheta;

    public Pendulum(int radius, double length, double initialTheta) {
        this.radius = radius;
        this.length = length;
        this.omega = (Math.sqrt(GRAVITY/length));
        this.initialTheta = initialTheta;
    }

    public double getXCord(double t) {
        return this.length * Math.sin(this.getTheta(t));
    }

    public double getYCord(double t) {
        return - (this.length * Math.cos(this.getTheta(t)));
    }

    public double getTheta(double t) {
        return this.initialTheta * Math.cos(this.omega * t);
    }

    public double getRadius() {
        return this.radius;
    }

}
