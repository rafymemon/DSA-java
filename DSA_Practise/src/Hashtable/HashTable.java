package Hashtable;

public class HashTable implements Map {
    private Entry[] entries;
    private int size;

    public HashTable(int capacity) {
        entries = new Entry[capacity];
    }

    static class Entry {
        Object key;
        Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key.toString() + "\t" + value.toString();
        }
    }

    private int hash(Object key) {
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    public Object get(Object key) {
        return entries[hash(key)].value;
    }

    public Object put(Object key, Object value) {
        entries[hash(key)] = new Entry(key, value);
        size++;
        return null;
    }

    public Object remove(Object key) {
        int h = hash(key);
        Object value = entries[h].value;
        size--;
        entries[h] = null;
        return value;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null)
                System.out.println(entries[i]);
        }
    }
}