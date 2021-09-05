package jp.boocamp.desertisland;

import jp.boocamp.desertisland.action.EatAction;
import jp.boocamp.desertisland.action.HearHintAction;
import jp.boocamp.desertisland.action.NoAction;
import jp.boocamp.desertisland.action.NotEatAction;
import jp.boocamp.desertisland.action.base.Selectable;
import jp.boocamp.desertisland.action.collection.SelectOptions;
import jp.boocamp.desertisland.action.collection.factory.OptionsFactory;
import jp.boocamp.desertisland.food.FoodTypes;
import jp.boocamp.desertisland.player.Survivor;
import jp.boocamp.desertisland.value.Day;

public class DesertIsland {
    private Survivor survivor;
    private OptionsFactory<Selectable> optionFactory;

    public DesertIsland() {
        this.survivor = new Survivor();
        this.optionFactory = new OptionsFactory<>();
    }

    public void survive() {
        FoodTypes.showAllFoodTypes();
        supendOneDay();

        if (Day.isLastDay()) {
            survive();
            return;
        }
    }

    private void supendOneDay() {
        Selectable selected = hearSelection();
        this.survivor.act(selected);
        
        selected = hearSelectionCaseInAfterHint(selected);
        this.survivor.act(selected);

        Day.supendOneDay();
    }

    private Selectable hearSelection() {
        SelectOptions<Selectable> mainOptions = generateMainOptions();
        return this.survivor.selectOption(mainOptions);
    }

    private Selectable hearSelectionCaseInAfterHint(Selectable selected) {
        if (selected instanceof HearHintAction) {
            SelectOptions<Selectable> optionsAfterHint = generateOptionsAfterHint();
            return this.survivor.selectOption(optionsAfterHint);
        }
        return new NoAction();
    }

    private SelectOptions<Selectable> generateMainOptions() {
        return this.optionFactory.create()
            .append(new EatAction())
            .append(new NotEatAction())
            .append(new HearHintAction());
    }

    private SelectOptions<Selectable> generateOptionsAfterHint() {
        return this.optionFactory.create()
            .append(new EatAction())
            .append(new NotEatAction());
    }
}
