package jp.boocamp.desertisland.util;

import java.util.Scanner;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;

public class InputReciever {
    private static final Scanner STDIN = new Scanner(System.in);

    public static int recieveUserSelectedOptionAsNum(SelectOptions<Selectable> options) {
        String inputtedStr = recieveInputtedStr();

        int inputtedNum = validateSelectedOptionStrAsNum(options, inputtedStr);
        return inputtedNum;
    }

    private static int validateSelectedOptionStrAsNum(SelectOptions<Selectable> options, String str) {
        if (!isNum(str)) {
            return recieveUserSelectedOptionAsNum(options);
        }

        int num = parseToInt(str);

        int min = options.minItemNo();
        int max = options.maxItemNo();
        if (!isInRange(min, max, num)) {
            return recieveUserSelectedOptionAsNum(options);
        }
        return num;
    }

    private static boolean isNum(String str) {
        try {
            parseToInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isInRange(int min, int max, int num) {
        return num >= min && num <= max;
    }

    private static int parseToInt(String str) {
        return Integer.parseInt(str);
    }

    private static String recieveInputtedStr() {
        return STDIN.nextLine();
    }
}
