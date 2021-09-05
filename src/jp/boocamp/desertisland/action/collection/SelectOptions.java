package jp.boocamp.desertisland.action.collection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

import jp.boocamp.desertisland.action.base.Selectable;

public class SelectOptions<E> extends AbstractList<E> implements RandomAccess, Cloneable, java.io.Serializable {
    private static final long serialVersionUID = 8683452581122892189L;

    private transient List<Selectable> options;

    public SelectOptions() {
        this.options = new ArrayList<>();
    }

    public SelectOptions<E> append(Selectable option) {
        this.options.add(option);
        return this;
    }

    public void addAll(Selectable[] optionsArray) {
        for (Selectable option : optionsArray) {
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
        // TODO Auto-generated method stub
        return 0;
    }
}
