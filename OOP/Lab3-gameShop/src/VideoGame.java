
public class VideoGame {
    private String gameName;
    private int gamePrice;
    private String gameType;
    private int gameStock;

    public enum gameTypeList{
        Sports("Sports"),
        Strategy("Strategy"),
        Simulation("Simulation"),
        Fighting("Fighting"),
        Adventure("Adventure"),
        Racing("Racing"),
        Puzzle("Puzzle");

        private String gameTypeList;

        gameTypeList(String gameTypeList){
            this.gameTypeList = gameTypeList;
        }

        public String valueOf() {
            return gameTypeList;
        }
    }

    public VideoGame(String gameName, int gamePrice, String gameType, int gameStock) {
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameType = gameType;
        this.gameStock = gameStock;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getGameStock() {
        return gameStock;
    }

    public void setGameStock(int gameStock) {
        this.gameStock = gameStock;
    }
}
