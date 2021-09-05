package jp.boocamp.desertisland.util;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;

public class Console {

    public static void showOptions() {
    }

    public static void showOptions(SelectOptions<Selectable> options) {
        int count = 0;
        for (Selectable option : options.options()) {
            System.out.format("%d. %s %n", ++count, option.actionName());
        }
    }

}
