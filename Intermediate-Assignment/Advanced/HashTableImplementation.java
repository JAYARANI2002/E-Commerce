import java.util.*;
class HashTable<K, V>{

    LinkedList[] buckets;
    int initialCapacity;
    private final float loadFactor;
    private int size;

    public HashTable(int initialCapacity, float loadFactor) 
    {
        this.buckets = new LinkedList[initialCapacity];
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.size = 0;
    }
    public void put(K key, V value) 
    {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];
        Entry<K, V> entry = new Entry<>(key, value);

        if (bucket==null) {
            bucket=new LinkedList<>();
        }

        bucket.add(entry);
        size++;

        if (size / initialCapacity >= loadFactor) {
            rehash();
        }
    }

    public V get(K key) 
    {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.getKey(), key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean containsKey(K key) 
    {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.getKey(), key)) {
                return true;
            }
        }

        return false;
    }

    public void remove(K key) 
    {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (Objects.equals(entry.getKey(), key)) {
                bucket.remove(entry);
                size--;
                break;
            }
        }
    }

    public int size() {
        return size;
    }

    private void rehash() 
    {
        int newCapacity = initialCapacity * 2;
        LinkedList[] newBuckets = new LinkedList[newCapacity];

        for (LinkedList<Entry<K, V>> bucket : buckets) 
        {
          if(bucket!=null)
          {
           for(Entry entry:bucket)
           {
             put(entry.getKey(),entry.getValue());
           }
          }
        }
        buckets = newBuckets;
        initialCapacity = newCapacity;
    }

    private int getBucketIndex(K key) {
        int hash = key.hashCode();
        return hash % buckets.length;
    }
}
class Entry<K, V> 
{
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey()
        {
              return this.key;
        }
        public V getValue()
        {
             return this.value;
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
public class HashTableImplementation
{ 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n"+"Enter the capacity of the hash table with the loadfactor");
        
        HashTable ht = new HashTable(scan.nextInt(),scan.nextFloat());
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
                System.out.println("Enter integer element to insert key[int] ,value[String]");
                ht.put( scan.nextInt() ,scan.next()); 
                break;                          
            case 2 :                  
                System.out.println("Enter Key[integer] element to delete");
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

