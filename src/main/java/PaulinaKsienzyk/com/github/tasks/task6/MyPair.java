package PaulinaKsienzyk.com.github.tasks.task5;
public class MyPair<K, V> {

    private final K key;
    private final V value;

    public MyPair(K firstItem, V secondItem) {
        if (firstItem == null || secondItem == null) {
            throw new NullPointerException("Items cannot be nulls");
        }
        this.key = firstItem;
        this.value = secondItem;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
