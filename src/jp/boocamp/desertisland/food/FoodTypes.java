package jp.boocamp.desertisland.food;
public enum FoodTypes {
    SNAKE("毒蛇", 15, 30, "毒蛇の毒に負けた… "), 
    CANNED_FOOD("漂流物（缶詰）", 30, 50, "歯では開けられなかった。歯が全部折れて出血死…"),
    DRIFTWOOD("流木", 8, 20, "バイキンだらけだった…"), 
    FALLEN_LEAVES("落ち葉", 5, 20, "口の中の水分を全部持っていかれた…"),
    MUSHROOM("毒々しいキノコ", 10, 30, "笑いが止まらず疲れて死んだ…"), 
    COLORFUL_FRUITS("カラフルフルーツ", 5, 30, "種が喉に詰まった…"),;

    private static final String HANKAKU_SPACE = " ";
    private static final int ZENKAKU_BYTE = 2;
    private static final int MAX_ZENKAKU_NAME_LENGTH;
    private final String name;
    private final int dangerRate;
    private final int recoveryValue;
    private final String deathReason;

    static {
        MAX_ZENKAKU_NAME_LENGTH = getMaxZenkakuNameLength();
    }

    private FoodTypes(String name, int dangerRate, int recoveryValue, String deathReason) {
        this.name = name;
        this.dangerRate = dangerRate;
        this.recoveryValue = recoveryValue;
        this.deathReason = deathReason;
    }

    public static void showAllFoodTypes() {
        System.out.println("食べ物一覧: ");
        for (FoodTypes type : FoodTypes.values()) {
            int bufferSize = MAX_ZENKAKU_NAME_LENGTH - type.name.length() * ZENKAKU_BYTE; 
            System.out.format(":: 品名: %s%s, 危険度: %2d%%, 回復量: %2d, 死因: %s %n", 
                type.name, 
                generateBuffer(bufferSize),
                type.dangerRate, 
                type.recoveryValue, 
                type.deathReason);
        }

    }

    private static int getMaxZenkakuNameLength() {
        int maxLength = 0;
        for (FoodTypes type : FoodTypes.values()) {
            if (type.name.length() > maxLength) {
                maxLength = type.name.length();
            }
        }
        return maxLength * ZENKAKU_BYTE;
    }

    private static String generateBuffer(int bufferSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bufferSize; i++) {
            sb.append(HANKAKU_SPACE);
        }
        return sb.toString();
    }
}