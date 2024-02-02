//Stack implementation using aray
import java.util.Scanner;
class Stack
{
    int array[]=new int[10];
    int top;
    Stack()
    {
        this.top =-1;
    }

    // Using this function we will be pushing elements into the stack
    public void push(int x) 
    {
        array[++top]=x;
        if (top>array.length) 
        {
            System.out.print("\nHeap Overflow");
        }
    }

    // Using this function we will be checking whether the stack is empty or not
    public boolean isEmpty()
    {
        return top == -1;
    }

    // using this function we will return the top element of the stack
    public void peek()
    {

        if (!isEmpty()) {
            System.out.println("Top of the element: "+ array[top]);
        }
        else 
        {
            System.out.println("Stack is empty");
        }
    }

    // Using this function we will pop the top element of the stack
    public void pop() 
    {

        if (top == -1) {
            System.out.print("\nStack Underflow");
        }
        int last=array[top];
        top--;
        System.out.println(last);
    }

    // this function will be used to display the items of the stack
    public void display()
    {

        if (top == -1) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else
        {
            for(int i=0;i<=top;i++)
            {

                System.out.print(array[i]+" ");
            }
        }
    }
}

class StackImplementation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack stk = new Stack();
        while(true)
        {
           System.out.println("Select the operation");
           System.out.println(" 1. Add the element in the stack");
           System.out.println(" 2. display the stack");
           System.out.println(" 3. Top of the element");
           System.out.println(" 4. delete the top ");
           System.out.println(" 5. Exit");
           int n=sc.nextInt();
           switch(n)
           { 
              case 1:
              {
                System.out.println("add a element");
                int element=sc.nextInt();
                stk.push(element);
                break;
              }
              case 2:stk.display();break;
              case 3:stk.peek();break;
              case 4:stk.pop();break;
              case 5:System.exit(0);
              default:System.out.println("Give correct number");
           }
        }
    }
}
