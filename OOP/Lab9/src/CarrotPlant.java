public class CarrotPlant extends Plant {
    private int waterLevel;

    public CarrotPlant() {
        super("Carrot", 5);
        this.waterLevel = 0;
    }

    public void water() {
        this.waterLevel++;
        if(this.waterLevel == getGrowthTime()){
            setHarvestable(true);
        }
    }

    public void harvest() {
        if(isHarvestable()){
            System.out.println(getName() + " plant is ready to harvest!");
            System.out.println(getName() + " plant harvested!");
        } else{
            System.out.println(getName() + " plant is not ready to harvest yet!");
        }
    }

    public void grow() {
        System.out.println(getName() + " plant is growing. Growth time:" + this.waterLevel + "/" + getGrowthTime());
    }
}
