public class Vehicle {
    private double speed;
    protected int maxSpeed;
    protected String make;
    private double distance;

    public Vehicle(int speed, int maxSpeed, String make, double distance) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.make = make;
        this.distance = distance;
    }

    public Vehicle(int speed, int maxSpeed, String make) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.make = make;
    }

    public void speedUp(int amount) {
        double oldSpeed = getSpeed();
        setSpeed(oldSpeed + amount);
        double newSpeed = getSpeed();
        double newDistance = (oldSpeed + newSpeed) / 2;
        setDistance(getDistance() + newDistance);
    }

    public void speedDown(int amount) {
        double oldSpeed = getSpeed();
        setSpeed(oldSpeed - amount);
        double newSpeed = getSpeed();
        double newDistance = (oldSpeed + newSpeed) / 2;
        setDistance(getDistance() + newDistance);
    }

    public void showSpeed() {
        System.out.println(make + " aracinizin hizi: " + getSpeed() + "\nKatettigi mesafe: " + getDistance());
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if (speed < 0) {
            this.speed = 0;
        }
        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
