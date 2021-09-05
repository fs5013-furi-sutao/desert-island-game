package jp.boocamp.desertisland;

import jp.boocamp.desertisland.setting.Config;
import jp.boocamp.desertisland.value.Day;

public class App {
    public static void main(String[] args) {
        Day.setSuspendDays(Config.Values.SUPEND_DAYS);
        DesertIsland island = new DesertIsland();
        island.survive();
    }
}
