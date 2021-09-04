public class App {
    public static void main(String[] args) {
        DesertIsland island = new DesertIsland();
        Day day = new Day(Config.Values.SUPEND_DAYS);
        island.survive();
    }
}
