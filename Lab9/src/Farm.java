import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;
    private int day;

    public Farm(){
        plants = new ArrayList<Plant>();
        this.day = 1;
    }

    public void addPlant(Plant p){
        plants.add(p);
    }

    public void simulateDay(){
        System.out.println("Day " + this.day);
        this.day++;
        if(plants.isEmpty()){
            System.out.println("There is no plant!");
        }else{
            for(Plant plant : plants){
                plant.water();
                plant.grow();
                plant.harvest();
            }
        }
        System.out.println("-------------------------------------------------\n");
    }
}
