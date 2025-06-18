package Main.Utils;

import Main.Collection.Organization;

import java.time.ZonedDateTime;
import java.util.HashMap;

public class CollectionManager {
    private long lastId = 0;
    private HashMap<String, Organization> orgCollection = new HashMap<>();
    private final ZonedDateTime creationDate = ZonedDateTime.now();

    public void setLastId(long lastId) {
        this.lastId = lastId;
    }

    public long getLastId() {
        return lastId;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setOrgCollection(HashMap<String, Organization> orgCollection) {
        this.orgCollection = orgCollection;
    }

    public void addElement(String key, Organization org){
        orgCollection.put(key, org);
    }

    public void addElement(String key, Organization org, Long id){
        orgCollection.put(key, org);
        orgCollection.get(key).setId(id);
    }

    public void clearCollection(){
        orgCollection.clear();
    }

    public String getCollectionType() {
        return orgCollection.getClass().getName();
    }

    public int getCollectionSyze(){return orgCollection.size();}

    public HashMap<String, Organization> getOrgCollection() {
        return orgCollection;
    }

    public Long generateId(){
        return ++lastId;
    }

    public void printCol(){
        System.out.println(orgCollection);
    }


    //СЮДА НАПИСАТЬ ЗАГРУЗУ В КОЛЛЕКЦИЮ И В КОНСТРУКТОР ЗАСУНУТЬ ЛИБО ФАЙЛ ЛИБО МЕНЕГЕР ФАЙЛОВ
}
