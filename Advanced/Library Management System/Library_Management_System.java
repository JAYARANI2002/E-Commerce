package com.library;
import java.util.*;
import java.text.*;
public class Library_Management_System
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String args[])throws Exception
   {
     LibraryManagement m=new LibraryManagement();
     while(true)
     {
          System.out.println("--------------------------------");
          System.out.println("1. Add Book");
          System.out.println("2. Borrowers");
          System.out.println("3. Reservation");
          System.out.println("4. Borrower history");
          System.out.println("5. End");
          System.out.println("--------------------------------");
          System.out.println("Enter your choice");
          int n=sc.nextInt();
          switch(n)
          {
              case 1:
              {
                 m.createBook();
                 break;
              }
              case 2:
              
                System.out.println("New user or not");
                String reply=sc.next();
                if(reply.equalsIgnoreCase("yes"))
                {
                    m.createBorrower();
                }
                else
                {
                    System.out.println("Enter the visitor id");
                    int visitorId=sc.nextInt();
                    if(m.checkVisitor(visitorId))
                    {
                        System.out.println("1.Borrow book");
                        System.out.println("2.Return book");
                        System.out.println("Enter the choice");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                            {
                                m.borrowBooks(visitorId);
                                break;
                            }
                            case 2:
                            {
                                  
                                m.returnBooks(visitorId);
                                break;
                            }
                       }
                    }
                    else
                    {
                         System.out.println("create id ");
                         m.createBorrower();
                    }
                         
                 }
                
             break;
             case 3:
             {
                  //m.reserveBooks();
                  break;   
             }
             case 4:
             {
                  System.out.println("Enter the visitor id");
                  int visitorId=sc.nextInt();
                  m.showBorrowingHistory(visitorId);
                  break;    
             }
             case 5:
             {
                  m.close();
                  System.exit(0);
             }  
         }
                   
    }   
     
  }

}
