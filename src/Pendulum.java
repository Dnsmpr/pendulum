public final class Pendulum {
    private static final double GRAVITY = 9.82;
    private final int radius;
    private final double length;
    private final double omega;
    private final double currentAngle;
    private static final double K_STRING = 9.18 * Math.pow(10, -4);
    private static final double K_BOB = 7.24 * Math.pow(10, -4);
    private static final double K_COEFFICIENT = 20 * (K_STRING + K_BOB);

    public Pendulum(int radius, double length, double initialTheta) {
        this.radius = radius;
        this.length = length;
        this.omega = 20 * (Math.sqrt(GRAVITY/length) - ((K_COEFFICIENT * K_COEFFICIENT)/4));
        this.currentAngle = initialTheta;
    }

    public double getXCord(double t) {
        return this.length * Math.sin(this.getTheta(t));
    }

    public double getYCord(double t) {
        return - (this.length * Math.cos(this.getTheta(t)));
    }

    public double getTheta(double t) {
        return this.currentAngle * Math.exp((-K_COEFFICIENT * t)/2) *
                (Math.cos(this.omega * t) + (K_COEFFICIENT/(2 * this.omega)) * Math.sin(this.omega * t));
    }

    public double getRadius() {
        return this.radius;
    }

}
