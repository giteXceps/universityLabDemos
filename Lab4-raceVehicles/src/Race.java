public class Race {
    public static void main(String[] args) throws Exception {

        Vehicle[] raceCars = new Vehicle[3];

        Vehicle tesla = new Vehicle(0, 200, "Tesla");
        Vehicle togg = new Vehicle(0, 200, "Togg");
        Vehicle yamaha = new Vehicle(0, 180, "Yamaha");

        raceCars[0] = tesla;
        raceCars[1] = togg;
        raceCars[2] = yamaha;

        int runwayLength = 1000;

        boolean isRaceContinue = true;
        Vehicle winner = null;

        while (isRaceContinue) {
            for (Vehicle vehicle : raceCars) {
                int randomSpeedAmount = (int) (Math.random() * 30 + 1);
                vehicle.speedUp(randomSpeedAmount);
                vehicle.showSpeed();

                if (vehicle.getDistance() >= runwayLength) {
                    winner = vehicle;
                    isRaceContinue = false;
                    break;
                }
            }
            System.out.println("\n----------------------------\n");
        }

        if (winner instanceof Automobile) {
            ((Automobile) winner).hornSound();
        }

        if (winner instanceof Motorcycle) {
            ((Motorcycle) winner).frontLift();
        }

        System.out.println("Kazanan arac: " + winner.make);
    }
}
