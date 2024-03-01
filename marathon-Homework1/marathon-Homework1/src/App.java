public class App {
    public static void main(String[] args) throws Exception {
        String names[] = { "Kadir", "Gokhan", "Hakan", "Suzan", "Pinar", "Mehmet", "Ali", "Emel", "Firat", "James",
                "Jale", "Ersin", "Deniz", "Gözde", "Anil", "Burak" };
        int scores[] = { 341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265 };
        Marathon marathon = new Marathon(names, scores);
        MarathonManager marathonManager = new MarathonManager();
        System.out.println(marathonManager.first());
    }
}
