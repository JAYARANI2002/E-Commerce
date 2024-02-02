public class HashTableImplementation
{
	public static void main(String[] args) {
	    HashTable ht=new HashTable(2,0.75f);
	    ht.put("one","j");
	    ht.put("two","a");
	    ht.put("three","y");
	    ht.put("1","2");
	    ht.put("2","3");
	    ht.put("3","2");
	    ht.put("4","1");
	    ht.delete("4");
	    ht.display();
	    System.out.println(ht.size());
	}
}
class HashTable
{
    class Node
    {
        String key,value;
        Node next;
    }
    int capacity,count;
    float fillratio;
    Node[] table;
    HashTable(int capacity,float fillratio)
    {
        this.capacity=capacity;
        this.fillratio=fillratio;
        if(capacity<=0)
        {
           System.out.println("not a validate capacity");
        }
        table=new Node[capacity];
    }
    public int size()
    {
        return count;
    }
    public int hash(String key)
    {
        return (Math.abs( key.hashCode()))%table.length;
    }
    public void put(String key,String value)
    {
        int index=hash(key);
        Node newEntry=table[index];
        while(newEntry!=null)
        {
            if(newEntry.key.equals(key))
            {
                break;
            }
            newEntry=newEntry.next;
        }
        if(newEntry!=null)
        {
            newEntry.value=value;
        }
        else
        {
            if(count>=fillratio*table.length)
             {
                rehash();
                index=hash(key);
             }
            Node newEntryNode=new Node();
            newEntryNode.key=key;
            newEntryNode.value=value;
            newEntryNode.next=table[index];
            table[index]=newEntryNode;
            count++;
        }
       
    }
    public void rehash()
    {
        Node newTable[]=new Node[2*table.length];
        for(int i=0;i<table.length;i++)
        {
            Node temp=table[i];
            while(temp!=null)
            {
                Node nextNode=temp.next;
                int newindex=(Math.abs( temp.key.hashCode()))%newTable.length;
                temp.next=newTable[newindex];
                newTable[newindex]=temp;
                temp=nextNode;
            }
        }
        table=newTable;
    }
    public void delete(String key)
    {
        int index=hash(key);
        if(table[index]==null)
        {
            return;
        }
        if(table[index].key.equals(key))
        {
            table[index]=table[index].next;
            count--;
            return;
        }
    }
    public void display()
    {
        for(int i=0;i<table.length;i++)
        {
            Node temp=table[i];
            while(temp!=null)
            {
                System.out.println("table "+i+" key:"+temp.key+" value:"+temp.value);
                temp=temp.next;
            }
        }
    }
}
