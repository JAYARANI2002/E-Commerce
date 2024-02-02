//Implement a binary tree data structure in Java using either an array or a linked list. The tree should have methods for inserting, deleting, and searching for nodes.
import java.util.*;
class LinkedListNode
{
    int value;
    LinkedListNode next,prev;
    LinkedListNode(int value)
    {
         this.value=value;
         next=null;
         prev=null;
    }
}
class BinaryTreeNode
{
   int key;
   BinaryTreeNode left;
   BinaryTreeNode right;
   BinaryTreeNode(int key)
   {
       this.key=key;
       left=right=null;
   }
}
class BinaryTree
{
    LinkedListNode head;
    BinaryTreeNode root;
    void push(int data)
    {
        LinkedListNode newNode=new LinkedListNode(data);
        newNode.next=head;
        newNode.prev=null;
        head=newNode;
    }
    //list=tree.OutputTree(tree.root);
    BinaryTreeNode OutputTree(BinaryTreeNode node)
    { 
      LinkedList<BinaryTreeNode> list=new LinkedList<>();   
      if(head==null)
      {
         node=null;
         return null;
      }
      node=new BinaryTreeNode(head.value);
      list.add(node);
      head=head.next;
      while(head!=null)
      {
           BinaryTreeNode root=list.peek();
           BinaryTreeNode leftChild = null, rightChild = null;
           leftChild = new BinaryTreeNode(head.value);
           list.add(leftChild);
           head = head.next;
           if (head != null) 
           {
                rightChild = new BinaryTreeNode(head.value);
                list.add(rightChild);
                head = head.next;
           }
           root.left = leftChild;
           root.right = rightChild;
           list.poll();
     }
     return node;
   }
   public void display()
   {
     LinkedListNode current=head; 
     if(head==null)
     {
          System.out.println("Tree is empty");
          return ;
     }
     while(current!=null)
     {
         System.out.print(current.value+" ");
         current=current.next;
     }
     System.out.println();
   }
   public void delete(int val)
   {
       LinkedListNode temp=head;
       if(head==null)
       {
          System.out.println("Tree is empty");
          return;
       }
       while(temp.value==val & temp!=null)
       {
           head=temp.next;
       }   
       //if(temp!=null &    
       return ;
   }
   public boolean search(int val)
   {
       LinkedListNode temp=head;
       boolean found=false;
       if(head==null)
       {
          System.out.println("Tree is empty");
       }
       while(temp.value==val & temp!=null)
       {
           found=true;
       }
       return found;
   }
        
}
public class BinaryTreeImplementation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        BinaryTreeNode node=null;
        while(true)
        {
            System.out.println("***********\n1.insert\n2.delete\n3.search\n4.display\n5.exit\n***********");
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            switch(n)
            {
                 case 1:
                 {
                    System.out.println("Enter the element value");
                    int value=sc.nextInt();
                    tree.push(value);
                    break;
                 }
                 case 2:
                 {
                    System.out.println("Enter the node value to delete");
                    int value=sc.nextInt();
                    tree.delete(value);
                    break;
                 }
                 case 3:
                 {
                    System.out.println("Enter the node value to search");
                    int value=sc.nextInt();
                    tree.search(value);
                    break;
                 }     
                 case 4:
                 {
                       tree.display();
                       break;
                 } 
                 case 5:
                 {
                    System.exit(0);
                 }           
           }       
        }
    }
}
