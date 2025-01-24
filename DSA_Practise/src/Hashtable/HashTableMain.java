package Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put("pk", new Country("Pakistan", "Urdu", 769000000, 22000000));
        table.put("in", new Country("India", "Hindi", 1200000000, 400000000));
        table.put("PT", new Country("Portugal", "Portugenes", 45000600, 25000000));
        table.put("GB", new Country("Temp", "unknown", 5600000, 4440000));
        table.display();

    }
}