public class FarmVille {
    public static void main(String[] args) throws Exception {
        Plant tomato = new TomatoPlant();
        Plant carrot = new CarrotPlant();

        Farm myFarm = new Farm();
        myFarm.addPlant(tomato);
        myFarm.addPlant(carrot);
    
        for(int i = 0 ; i < 4 ; i++){
            System.out.printf("Day %d:\n", i+1);
            myFarm.simulateDay();
            System.out.println();
        }
    }
}
