package jp.boocamp.desertisland.action;

import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.define.ActionTypes;

public class NotEatAction implements Selectable {

    @Override
    public void act() {
        System.out.format("act()=%s %n", actionName());
    }

    @Override
    public String actionName() {
        return ActionTypes.NOT_EAT.actionName();
    }
    
}
