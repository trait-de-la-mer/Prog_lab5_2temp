package Utils;

import Collection.Organization;

import java.util.HashMap;

public class CollectionManager {
    static private int lastId = 0;
    private HashMap<Object, Organization> orgCollection = new HashMap<>();

    public void addElement(Object key, Organization org){
        orgCollection.put(key, org);
    }

    public Integer generateId(){
        return ++lastId;
    }

    //СЮДА НАПИСАТЬ ЗАГРУЗУ В КОЛЛЕКЦИЮ И В КОНСТРУКТОР ЗАСУНУТЬ ЛИБО ФАЙЛ ЛИБО МЕНЕГЕР ФАЙЛОВ
}
