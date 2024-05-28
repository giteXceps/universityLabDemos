public class CarrotPlant extends Plant{
    private int waterLevel;
    
    public CarrotPlant() {
        super("Carrot", 5);
        this.waterLevel = 0;
    }

    @Override
    void grow() {
        System.out.println(getName() + "Plant is growing. Growth time:" + this.waterLevel + "/" + getGrowthTime());
    }

    @Override
    public void water() {
        this.waterLevel++;
        if(this.waterLevel == getGrowthTime()){
            setHarvestable(true);
        }
    }

    @Override
    public void harvest() {
        if(isHarvestable()){
            System.out.println(getName() + "Plant is ready to harvest.");
            System.out.println(getName() + "Plant has been harvested!");
           }else{
            System.out.println(getName() + "Plant is not ready to harvest yet.");
           }
    }

}
