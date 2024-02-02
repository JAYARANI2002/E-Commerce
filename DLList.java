import java.util.*;
public class DLList
{
   Node head,tail;
   class Node
   {
       int data;
       Node next,prev;
       Node(int value)
       {
           data=value;
           next=prev=null;
       }
   }
   DLList()
   {
       head=tail=null;
   }
   public void insertFirst(int data)
   {
       Node newNode=new Node(data);
       newNode.next=head;
       newNode.prev=null;
       if(head!=null)
       {
           head.prev=newNode;
       }
       head=newNode;
   }
   public void insertLast(int data)
   {
       Node newNode=new Node(data);
       newNode.next=null;
       if(head==null)
       {
          head=newNode;
          head.prev=null;
          return;
       }
       Node tail=head;
       while(tail.next!=null)
           tail=tail.next;
       tail.next=newNode;
       newNode.prev=tail;
    }
    public int getSize()
    {
        int size=0;
        Node node=head;
        while(node!=null)
        {
            node=node.next;
            size++;
        }
        return size;
    }
    public void insertPosition(int pos,int data)
    {
        int len=getSize();
        if(pos==0)
        {
            insertFirst(data);
            return;
        }
        else if(pos==len)
        {
            insertLast(data);
            return;
        }
        else
        {
            if(pos>len || pos<0)
            {
                System.out.println("IndexOutOfFound");
                return;
            }
            else
            {
                Node newNode=new Node(data);
                newNode.next=null;
                newNode.prev=null;
                Node posNode=head;
                while(--pos>0)
                {
                     posNode=posNode.next;
                }
                Node nextNode=posNode.next;
                nextNode.prev=newNode;
                newNode.next=posNode;
                posNode.next=newNode;
            }
         }
     }
     public void display()
     {
        Node node=head;
        Node tail=null;
        while(node!=null)
        {
           System.out.print(node.data+" ");
           node=node.next;
        }/*
        System.out.println();
        while(tail!=null)
        {
             System.out.print(tail.data+" ");
             tail=tail.prev;
        }*/
     }
 }
 class DLLImplemtation
 {
     public static void main(String args[])
     {
          DLList ls=new DLList();
          ls.insertFirst(3);
          ls.insertLast(0);
          System.out.println(ls.getSize());
          ls.insertPosition(1,4);
          ls.display();
     }
 }

                 
            
          
   
