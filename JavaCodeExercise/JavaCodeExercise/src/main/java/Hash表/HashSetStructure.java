package Hash表;

import java.util.LinkedList;
import java.util.Map;

public class HashSetStructure<K,V> {


}

class SimpleHashTable<K, V> {
    private static final int INITIAL_CAPACITY = 16; // 初始容量
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public SimpleHashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // 哈希函数，将键映射到数组索引
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void insert(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        // 产生了hash的冲突
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V find(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];

        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];

        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    list.remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
