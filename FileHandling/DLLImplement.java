public class DLLImplement
{
	public static void main(String[] args) 
	{
	        DLL l=new DLL();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.display();
		System.out.println("\n pop");
		l.remove();
		l.remove();
		l.display();
		System.out.println("\n operation");
		System.out.println(l.size());
		System.out.println(l.get(1));
		System.out.println(l.get(5));
	}
}
class DLL
{
    Node head,tail;
    int size;
    class Node
    {
        Node next,prev;
        int data;
        Node(int value)
        {
            data=value;
            next=prev=null;
        }
    }
    DLL()
    {
        head=tail=null;
        size=0;
    }
    public void add(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else
        {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=null;
        }
        size++;
    }
    public void remove()
    {
        Node node=tail.prev;
        node.next=null;
        tail=node;
        size--;
    }
    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public int size()
    {
        return size;
    }
    public int get(int index)
    {
         Node node=head;
         if(index<0 || index>size)
         {
              System.out.println("index not found");
              return -1;
         }
         else
         {
             
             for(int i=0;i<index;i++)
             {
                node=node.next;
             }
             return node.data;
         }
    }
}
