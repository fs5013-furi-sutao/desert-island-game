package jp.boocamp.desertisland.action;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.define.ActionTypes;

public class NoAction implements Selectable {

    @Override
    public void act() {
        System.out.format("act()=%s %n", actionName());
    }

    @Override
    public String actionName() {
        return ActionTypes.NOTHING.actionName();
    }
    
}
