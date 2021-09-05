package jp.boocamp.desertisland.player;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;

public class Survivor {
    private static final int MAX_HP = 100;
    private static final int INIT_HP = 50;
    private int hp;

    public Survivor() {
        this.hp = INIT_HP;
    }

    public Selectable selectOption(SelectOptions<Selectable> mainOptions) {
        return null;
    }

    public void act(Selectable selected) {
        selected.act();
    }
}