package jp.boocamp.desertisland.player;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;
import jp.boocamp.desertisland.util.Console;
import jp.boocamp.desertisland.util.InputReciever;

public class Survivor {
    private static final int MAX_HP = 100;
    private static final int INIT_HP = 50;
    private int hp;

    public Survivor() {
        this.hp = INIT_HP;
    }

    public Selectable selectOption(SelectOptions<Selectable> options) {
        Console.showOptions(options);
        System.out.format("何をしますか ( %s ) : ", options.itemNoMinToMax());
        int itemNo = InputReciever.recieveUserSelectedOptionAsNum(options);
        return options.itemNoParseToOption(itemNo);
    }

    public void act(Selectable selected) {
        selected.act(); 
    }
}