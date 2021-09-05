package jp.boocamp.desertisland.action.define;

public enum ActionTypes {
    EAT("食べる"), 
    NOT_EAT("食べない"), 
    HEAR_HINT("ヒント"), 
    NOTHING("何もしない"), ;

    private final String actionName;

    private ActionTypes(String actionName) {
        this.actionName = actionName;
    }

    public String actionName() {
        return this.actionName;
    }
}
