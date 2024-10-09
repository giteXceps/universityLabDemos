public class Race {
    public static void main(String[] args) {
        Vehicle tesla = new Automobile(0, 200, "Tesla");
        Vehicle togg = new Automobile(0, 200, "TOGG");
        Vehicle yamaha = new Motorcycle(0, 200, "Yamaha");

        Vehicle[] raceCars = new Vehicle[3];
        raceCars[0] = tesla;
        raceCars[1] = togg;
        raceCars[2] = yamaha;

        int runwayLength = 1000;

        boolean isRaseContinue = true;
        Vehicle winner = null;

        while (isRaseContinue) {
            for (Vehicle vehicle : raceCars) {
                int randomSpeedAmount = (int) (Math.random() * 30) + 1;
                vehicle.speedUp(randomSpeedAmount);
                vehicle.showSpeed();

                if (vehicle.getDistance() >= runwayLength) {
                    winner = vehicle;
                    isRaseContinue = false;
                    break;
                }
            }
            System.out.println("------------");
        }

        if (winner instanceof Automobile)
            ((Automobile) winner).hornSound();

        if (winner instanceof Motorcycle)
            ((Motorcycle) winner).frontLift();

        System.out.println("Kazanan araç: " + winner.make);
    }

}