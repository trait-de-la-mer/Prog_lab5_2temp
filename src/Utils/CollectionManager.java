package Utils;

import Collection.Organization;

import java.util.HashMap;

public class CollectionManager {
    static private long lastId = 0;
    private final HashMap<Object, Organization> orgCollection = new HashMap<>();

    public void addElement(String key, Organization org){
        orgCollection.put(key, org);
    }

    public void clearCollection(){
        orgCollection.clear();
    }

    public HashMap<Object, Organization> getOrgCollection() {
        return orgCollection;
    }

    public static Long generateId(){
        return ++lastId;
    }

    public void printCol(){
        System.out.println(orgCollection);
    }


    //СЮДА НАПИСАТЬ ЗАГРУЗУ В КОЛЛЕКЦИЮ И В КОНСТРУКТОР ЗАСУНУТЬ ЛИБО ФАЙЛ ЛИБО МЕНЕГЕР ФАЙЛОВ
}
