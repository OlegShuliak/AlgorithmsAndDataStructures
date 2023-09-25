package Seminar4;

import java.util.Iterator;

public class HashMapIterator implements Iterator<HashMap.Entity> {
    private HashMap hashMap;
    private int counter;

    public void HashMapIterator(HashMap hashMap) {
        this.hashMap = hashMap;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < hashMap.getSize();
    }

    @Override
    public HashMap.Entity next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return hashMap.getEntity(counter);
    }

}
