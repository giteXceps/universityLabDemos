public abstract class Plant implements IPlantActions {
    private String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }

    abstract void grow();

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getGrowthTime() {
        return growthTime;
    }



    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }



    public boolean isHarvestable() {
        return isHarvestable;
    }



    public void setHarvestable(boolean isHarvestable) {
        this.isHarvestable = isHarvestable;
    }
}
