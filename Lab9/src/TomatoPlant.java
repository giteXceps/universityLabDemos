public class TomatoPlant extends Plant {
    private int waterLevel;

    public TomatoPlant() {
        super("Tomato", 3);
        this.waterLevel = 0;
    }

    public void harvest() {
        if (isHarvestable()) {
            System.out.println(getName() + " plant is ready to harvest!");
            System.out.println(getName() + " plant harvested!");
        } else {
            System.out.println(getName() + " plant is not ready to harvest yet!");
        }
    }

    public void grow() {
        System.out.println(getName() + " plant is growing. Growth time: " + this.waterLevel + "/" + getGrowthTime());
    }

    public void water() {
        this.waterLevel++;
        if (waterLevel == getGrowthTime()) {
            setHarvestable(true);
        }
    }
}
