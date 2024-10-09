public class Automobile extends Vehicle {

    public Automobile(int speed, int maxSpeed, String make) {
        super(speed, maxSpeed, make);
        // TODO Auto-generated constructor stub
    }

    public void speedUp() {
        super.speedUp(15);
    }

    public void speedDown() {
        super.speedDown(15);
    }

    void hornSound() {
        System.out.println(make + "marka arac korna caliyor!: Dut, dut!");
    }

}
