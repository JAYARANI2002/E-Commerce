import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree<T> 
{ 
    private Node<T> root; 
    public BinaryTree() 
    { 
        root = null; 
    } 
    public void insertNode(T data) 
    { 
       // Create a new node. 
       Node<T> newNode = new Node<T>(data); 
       // If the tree is empty, make the new node the root. 
       if (root == null) 
       {
            root = newNode; 
       } 
       else 
       { 
         // Find the appropriate parent node for the new node. 
         Node<T> parent = findParentNode(data); 
         // If the parent node is null, make the new node the root. 
         if (parent == null) 
         { 
            root = newNode; 
         } 
         else 
         { 
            // If the parent node has a left child, make the new node the left child. 
            if (parent.left == null) 
            { 
               parent.left = newNode;
            }
            else 
            { 
               // If the parent node has a right child, make the new node the right child. 
               parent.right = newNode; 
            }
         } 
       } 
    }
    public void deleteNode(T data) 
    { 
       // Find the node to be deleted. 
       Node<T> nodeToDelete = findNode(data); 
       // If the node to be deleted is the root, make the left child the new root. 
       if (nodeToDelete == root) 
       { 
          root = nodeToDelete.left; 
       }
       else 
       { 
         // Find the parent node of the node to be deleted. 
         Node<T> parent = findParentNode(data); 
         // If the node to be deleted has a left child, make the left child the child of the parent node. 
         if (nodeToDelete.left != null) 
         { 
            parent.left = nodeToDelete.left; 
         }
         else 
         {
             // If the node to be deleted has a right child, make the right child the child of the parent node. 
             parent.right = nodeToDelete.right; 
         } 
       } 
     }
     public Node<T> findNode(T data) 
     { 
       // Start at the root node. 
       Node<T> current = root; 
       // While the current node is not null and the data is not found, continue searching. 
       while (current != null && !current.data.equals(data)) 
       { 
          // If the data is less than the current node's data, move to the left child. 
          if (data.compareTo(current.data) < 0) 
          { 
             current = current.left; 
          }
          else 
          {
             // If the data is greater than the current node's data, move to the right child. 
             current = current.right; 
          }
        } 
        // If the current node is null, the data was not found. 
        if (current == null) 
        { 
           return null; 
        }
        // Return the current node. 
       return current; 
     } 
     public Node<T> findParentNode(T data) 
     {
        // Start at the root node. 
        Node<T> current = root; 
        // While the current node is not null and the data is not found, continue searching. 
        while (current != null && !current.data.equals(data)) 
        { 
           // If the data is less than the current node's data, move to the left child. 
           if (data.compareTo(current.data) < 0) 
           { 
             current = current.left; 
           }
           else 
           {
               // If the data is greater than the current node's data, move to the right child. 
               current = current.right; 
           } 
         }
         // If the current node is null, the data was not found. 
         if (current == null) 
         { 
            return null; 
         }
         // If the current node's data is equal to the data, return the current node. 
         if (current.data.equals(data)) 
         { 
            return current; 
         }
          // If the current node's data is not equal to the data, return the parent node. 
        return current.parent; 
     }
     public void inOrderTraversal() 
     { 
       // Start at the root node. 
       Node<T> current = root; 
       // While the current node is not null, continue printing the data. 
       while (current != null)
       {
             System.out.println(current.left);
             System.out.println(current.data);
             System.out.println(current.right);
             current=current.next;
       }
    }
    
