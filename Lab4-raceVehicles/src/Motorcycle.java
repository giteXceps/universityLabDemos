public class Motorcycle extends Vehicle {

    public Motorcycle(int speed, int maxSpeed, String make) {
        super(speed, maxSpeed, make);
        // TODO Auto-generated constructor stub
    }

    public void speedUp() {
        super.speedUp(10);
    }

    public void speedDown() {
        super.speedDown(10);
    }

    void frontLift() {
        System.out.println(make + "marka motosiklet on kaldirirken dustu!");
        setSpeed(0);
    }
}
