import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;
    
    public Farm(){
        plants = new ArrayList<Plant>();
    }

    public void simulateDay(){
        if(plants.isEmpty()){
            System.out.println("There is no plant in your farm!");
        } else {
            for(Plant plant : plants){
                plant.water();
                plant.grow();
                plant.harvest();
            }
        }
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }
}
