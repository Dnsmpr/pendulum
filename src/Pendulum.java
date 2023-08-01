public final class Pendulum {
    private static final double GRAVITY = 9.82;
    private static final double DAMPING_FACTOR = 0.99;

    private final int radius;
    private final double length;
    private final double omega;
    private double currentAngle;


    public Pendulum(int radius, double length, double initialTheta) {
        this.radius = radius;
        this.length = length;
        this.omega = (Math.sqrt(GRAVITY/length));
        this.currentAngle = initialTheta;
    }

    public double getXCord(double t) {
        return this.length * Math.sin(this.getTheta(t));
    }

    public double getYCord(double t) {
        return - (this.length * Math.cos(this.getTheta(t)));
    }

    public double getTheta(double t) {
        return this.currentAngle * Math.cos(this.omega * t);
    }

    public double getRadius() {
        return this.radius;
    }

    public void applyDamping() {
        this.currentAngle *= DAMPING_FACTOR;
    }


}
