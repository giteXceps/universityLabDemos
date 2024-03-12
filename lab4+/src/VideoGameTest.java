public class VideoGameTest {
    public static void main(String[] args) {
        ShoppingSite shoppingSite = new ShoppingSite("Game Center");

        VideoGame videoGame1 = new VideoGame("The Last Of Us 1",100,VideoGame.gameTypeList.Adventure.valueOf(), 150);
        VideoGame videoGame2 = new VideoGame("NFS Underground ",150,VideoGame.gameTypeList.Racing.valueOf(),100);

        shoppingSite.addVideoGame(videoGame1);
        shoppingSite.addVideoGame(videoGame2);

        System.out.println("Name of the game store: " + shoppingSite.getStoreName());
        System.out.println("Name of the game: " + videoGame1.getGameName());
        System.out.println("Price of the game: $" + videoGame1.getGamePrice());
        System.out.println("Type of the game: " + videoGame1.getGameType());
        System.out.println("Total game stock of the shopping site: " + ShoppingSite.totalGameStock);
    }
}
