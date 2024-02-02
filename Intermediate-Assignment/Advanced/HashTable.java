import java.util.List;
import java.util.Objects;
class HashTable<K, V> {

    private final List<LinkedList<Entry<K, V>>> buckets;
    private final int initialCapacity;
    private final float loadFactor;
    private int size;

    public HashTable(int initialCapacity, float loadFactor) {
        this.buckets = new LinkedList[initialCapacity];
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.size = 0;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        Entry<K, V> entry = new Entry<>(key, value);

        if (bucket.contains(entry)) {
            bucket.remove(entry);
        }

        bucket.add(entry);
        size++;

        if (size / initialCapacity >= loadFactor) {
            rehash();
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.key, key)) {
                return entry.value;
            }
        }

        return null;
    }

    public boolean containsKey(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.key, key)) {
                return true;
            }
        }

        return false;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.key, key)) {
                bucket.remove(entry);
                size--;
                break;
            }
        }
    }

    public int size() {
        return size;
    }

    private void rehash() {
        int newCapacity = initialCapacity * 2;
        List<LinkedList<Entry<K, V>>> newBuckets = new LinkedList[newCapacity];

        for (Entry<K, V> entry : buckets) {
            int newIndex = getBucketIndex(entry.key, newCapacity);
            newBuckets[newIndex].add(entry);
        }

        buckets = newBuckets;
        initialCapacity = newCapacity;
    }

    private int getBucketIndex(K key) {
        int hash = key.hashCode();
        return hash % buckets.length;
    }

    private static class Entry<K, V> {

        final K key;
        final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Entry<K, V> entry = (Entry<K, V>) o;
            return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return "{" + key + ", " + value + "}";
        }
    }
}
public class HashTableImplementation
{ 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        HashTable ht = new HashTable(11,0.75);
        while(true)   
        {
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. search");
            System.out.println("4. display");
            System.out.println("5. exit");
            int choice = scan.nextInt();             
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                ht.put( scan.nextInt() ); 
                break;                          
            case 2 :                  
                System.out.println("Enter integer element to delete");
                ht.remove( scan.nextInt() ); 
                break;
           case 3:
                System.out.println("Enter the element to search");
                System.out.println(containsKey(scan.nextInt()));
            case 4:
                System.out.println(ht);
                break; 
            case 5:
                System.exit(0);       
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }  
             
       }
    }
 
}
}

