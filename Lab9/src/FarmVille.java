public class FarmVille {
    public static void main(String[] args) throws Exception {
        Plant tomato = new TomatoPlant();
        Plant carrot = new CarrotPlant();

        Farm farm = new Farm();
        farm.addPlant(carrot);
        farm.addPlant(tomato); 

        farm.simulateDay();
        farm.simulateDay();
        farm.simulateDay();
    }
}
