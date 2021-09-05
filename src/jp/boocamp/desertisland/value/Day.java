package jp.boocamp.desertisland.value;

import jp.boocamp.desertisland.setting.Config;

public class Day {
    public static final int START_DAY = Config.Values.START_DAY;
    public static int current;
    public static int last;

    static {
        current = START_DAY;
    }

    public static void supendOneDay() {
        current++;
    }

    public static boolean isLastDay() {
        return current == last;
    }

    public static void setSuspendDays(int supendDays) {
        last = supendDays;
    }
}
