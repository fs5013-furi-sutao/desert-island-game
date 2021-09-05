package jp.boocamp.desertisland.action.collection.factory;

import jp.boocamp.desertisland.action.collection.SelectOptions;

public class OptionsFactory<E> {
    
    public SelectOptions<E> create() {
        return new SelectOptions<E>();
    }
}
