package Utils;

import Collection.Organization;

import java.util.HashMap;

public class CollectionManager {
    private HashMap<Object, Organization> OrgCollection = new HashMap<>();

    public void addElement(Object key, Organization org){
        OrgCollection.put(key, org);
    }
}
