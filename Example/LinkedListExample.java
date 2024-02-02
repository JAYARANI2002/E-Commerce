

public class Main
{
	public static void main(String[] args) {
		LinkedListExample l=new LinkedListExample();
		l.addFirst(30);
		l.addLast(50);
		l.display();
	}
}
class Node
{
    int data;
    Node next;
    Node(int a)
    {
        data=a;
        next=null;
    }
}
class LinkedListExample
{
    //Node creation
    Node head,last;
    //Add the element in the begining
    void addFirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void addLast(int data)
    {
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        last=head;
        while(last!=null)
        {
            last=last.next;
        }
        last.next=newNode;
        newNode.next=null;
    }
    //insert at the middle
    void addMiddle(Node pos,int data)
    {
        Node newNode=new Node(data);
        newNode.next=pos.next;
        pos.next=newNode;
        if(pos.next==null)
        {
            System.out.println("add No element");return;
        }
        
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
        }
        temp=temp.next;
    }
}
