public abstract class Plant implements IPlantActions {
    private String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant (String name, int growthTime){
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }

    public void setHarvestable(boolean isHarvestable){
        this.isHarvestable = isHarvestable;
    }

    public boolean isHarvestable(){
        return this.isHarvestable;
    }

    public void setGrowthTime(int growthTime){
        this.growthTime = growthTime;
    }

    public int getGrowthTime(){
        return growthTime;
    }

    public String getName(){
        return name;
    }

    public abstract void grow();
}
