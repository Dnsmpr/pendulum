public class Pendulum {
    private static final double GRAVITY = 9.82;
    private int radius;
    private double length;
    private double amplitude;
    private double omega;

    public Pendulum(int radius, int length, int amplitude) {
        this.radius = radius;
        this.length = length;
        this.amplitude = amplitude;
        this.omega = (Math.sqrt(GRAVITY/length));
    }

    public double getPendulumPosition(double time) {
        return this.amplitude * (Math.cos(this.omega * time));
    }

    public double getPendulumVelocity(double t) {
        return - (this.omega * this.amplitude * Math.sin(this.omega * t));
    }

    public double getPendulumAcceleration(int time) {
        return - (Math.pow(this.omega, 2) * getPendulumPosition(time));
    }



}
