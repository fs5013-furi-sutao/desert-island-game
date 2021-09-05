package jp.boocamp.desertisland;

import jp.boocamp.desertisland.action.HearHintAction;
import jp.boocamp.desertisland.action.NoAction;
import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;
import jp.boocamp.desertisland.food.FoodTypes;
import jp.boocamp.desertisland.player.Survivor;
import jp.boocamp.desertisland.value.Day;

public class DesertIsland {
    private Survivor survivor;

    public DesertIsland() {
        this.survivor = new Survivor();
    }

    public void survive() {
        supendOneDay();

        if (Day.isLastDay()) {
            survive();
            return;
        }
    }

    private void supendOneDay() {
        FoodTypes.showAllFoodTypes();
        Selectable selected = hearSelection();
        this.survivor.act(selected);
        
        selected = hearSelectionCaseInAfterHint(selected);
        this.survivor.act(selected);

        Day.supendOneDay();
    }

    private Selectable hearSelection() {
        SelectOptions<Selectable> mainOptions = SelectOptions.generateMainOptions();
        return this.survivor.selectOption(mainOptions);
    }

    private Selectable hearSelectionCaseInAfterHint(Selectable selected) {
        if (selected instanceof HearHintAction) {
            SelectOptions<Selectable> optionsAfterHint = SelectOptions.generateOptionsAfterHint();
            return this.survivor.selectOption(optionsAfterHint);
        }
        return new NoAction();
    }
}
