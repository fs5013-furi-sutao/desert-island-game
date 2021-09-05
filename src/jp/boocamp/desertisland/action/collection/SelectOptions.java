package jp.boocamp.desertisland.action.collection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

import jp.boocamp.desertisland.action.EatAction;
import jp.boocamp.desertisland.action.HearHintAction;
import jp.boocamp.desertisland.action.NotEatAction;
import jp.boocamp.desertisland.action.base.Selectable;

public class SelectOptions<E> extends AbstractList<E> {
    private static final int MIN_ITEM_NO = 1;
    private List<E> options;

    public SelectOptions() {
        this.options = new ArrayList<>();
    }

    public static SelectOptions<Selectable> create() {
        return new SelectOptions<Selectable>();
    }

    public List<E> options() {
        return this.options;
    }

    public SelectOptions<E> append(E option) {
        this.options.add(option);
        return this;
    }

    public void addAll(E[] optionsArray) {
        for (E option : optionsArray) {
            this.options.add(option);
        }
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return this.options.size();
    }

    public int minItemNo() {
        return MIN_ITEM_NO;
    }

    public int maxItemNo() {
        return size();
    }

    public String itemNoMinToMax() {
        return String.format("%d ～ %d", minItemNo(), maxItemNo());
    }

    public static SelectOptions<Selectable> generateMainOptions() {
        return create()
            .append(new EatAction())
            .append(new NotEatAction())
            .append(new HearHintAction());
    }

    public static SelectOptions<Selectable> generateOptionsAfterHint() {
        return create()
            .append(new EatAction())
            .append(new NotEatAction());
    }

	public Selectable itemNoParseToOption(int itemNo) {
		return (Selectable) this.options.get(itemNo - 1);
	}
}
