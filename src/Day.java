

public class Day {
    public static final int START_DAY = Config.Values.START_DAY;
    public int current;
    public int last;

    public Day(int supendDays) {
        this.current = START_DAY;
        this.last = supendDays;
    }

}
