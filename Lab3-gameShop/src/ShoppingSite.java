public class ShoppingSite {
    public static int totalGameStock;
    private String storeName;
    private static int videoGameCount;
    private VideoGame[] videoGameList;

    public ShoppingSite(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void addVideoGame(VideoGame videoGame){
        totalGameStock += videoGame.getGameStock();
        videoGameList[videoGameCount]=videoGame;
        ShoppingSite.videoGameCount++;
    }
}
