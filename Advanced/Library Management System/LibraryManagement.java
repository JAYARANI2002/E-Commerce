package com.library;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;
public class LibraryManagement
{
  static Connection con;
  static
  {
     try
     {
          con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/library","postgres", "1234");
     }
     catch(Exception e)
     {
          System.out.println("Exception in db connection");
     }
     
  }
    static Scanner sc=new Scanner(System.in);
    static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    public void addBook(Book b)throws Exception
    {
        //sql
        String addBook_query="insert into Book( id , name , author , publisher , genres , publication_year , edition , price , dimension , weight ) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement execute_addBook_query=con.prepareStatement(addBook_query);
        execute_addBook_query.setInt(1,b.getbookId());
        execute_addBook_query.setString(2,b.getbookName());
        execute_addBook_query.setString(3,b.getbookAuthor());
        execute_addBook_query.setString(4,b.getbookPublisher());
        execute_addBook_query.setString(5,b.getbookGenres());
        execute_addBook_query.setInt(6,b.getbookYear());
        execute_addBook_query.setInt(7,b.getbookEdition());
        execute_addBook_query.setDouble(8,b.getbookPrice());
        execute_addBook_query.setDouble(9,b.getbookDimension());
        execute_addBook_query.setDouble(10,b.getbookWeight());
        execute_addBook_query.executeUpdate();
    }
    public void selectBook(String genres)throws Exception
    {
        String selectGenres="select id,name from book where genres=?";
        PreparedStatement execute_selectGenres=con.prepareStatement(selectGenres);
        execute_selectGenres.setString(1,genres);
        System.out.println("id\tname");    
        ResultSet result=execute_selectGenres.executeQuery();
        while(result.next())
        {
            System.out.print(result.getInt(1)+"\t");
            System.out.println(result.getString(2));
        }
    }
    public void addVisitor(Visitors v)throws Exception
    {
        String add_visitor="insert into Visitor(id,name,contact) values (?,?,?)";
        PreparedStatement execute_add_visitor=con.prepareStatement(add_visitor);
        execute_add_visitor.setInt(1,v.getId());
        execute_add_visitor.setString(2,v.getName());
        execute_add_visitor.setString(3,v.getContact());
        execute_add_visitor.executeUpdate();	
   }
   public void displayBooks()throws Exception
   {
       String display_books="select name,author,genres from book";
       PreparedStatement execute_display_books=con.prepareStatement(display_books);
       ResultSet display_result=execute_display_books.executeQuery();
       System.out.println("Name\t\t\tAuthor\t\t\tGenres  ");
       while(display_result.next())
       {
          System.out.print(display_result.getString(1)+"\t\t\t");
          System.out.print(display_result.getString(2)+"\t\t\t");
          System.out.println(display_result.getString(3));
       }
       
   }
   public void borrowBooks(int id)throws Exception
    {
       System.out.println("Borrow Books or not");
       String ans=sc.next();
       if(ans.equalsIgnoreCase("yes"))
       {
                    System.out.println("select the book genres....");
                    String genres=sc.next();
                    selectBook(genres);
                    int bookId=sc.nextInt();
                    System.out.println("Enter the login data");
                    String date=sc.next();
                    Date borrow_date=sdf.parse(date);
                    Calendar cal=Calendar.getInstance();
                    cal.setTime(sdf.parse(date));
                    cal.add(Calendar.DATE,15);
                    String r_date=sdf.format(cal.getTime());
                    Date return_date=sdf.parse(r_date);
                    Borrowing borrower=new Borrowing(bookId,borrow_date,return_date);
                    addBorrower(id,borrower);
                    System.out.println("Return the book before due date :"+r_date);
      }
    }
    public int getBorrowId(int visitorId,int bookId)throws Exception
    {
                 int id=0;
                 String getid="select id from borrower where visitor_id=? and book_id=?";
                 PreparedStatement execute_getid=con.prepareStatement(getid);
                 execute_getid.setInt(1,visitorId);
                 execute_getid.setInt(2,bookId);
                 ResultSet resultOfexecute_getid=execute_getid.executeQuery();
                 if(resultOfexecute_getid.next())
                 {
                      id=resultOfexecute_getid.getInt(1);
                 }
                 return id;
    }
    public void returnBooks(int id)throws Exception
    {
                 System.out.println("Enter the book id");
                 int bookid=sc.nextInt();
                 Date due_date=checkDueDate(bookid);
                 System.out.println("Enter the date - book return");
                 String returndate=sc.next();
                 int borrowing_id=getBorrowId(id,bookid);
                 System.out.println(borrowing_id);
                 Date return_date=sdf.parse(returndate);
                 java.sql.Date returnDate=new java.sql.Date(return_date.getTime());
                 System.out.println("Record id");
                 int record=sc.nextInt();
                 String updateBorrowing="insert into library_borrower(id,borrower_id,return_date) values (?,?,?)";
                 PreparedStatement execute_updateBorrowing=con.prepareStatement(updateBorrowing);
                 execute_updateBorrowing.setInt(1,record);
                 execute_updateBorrowing.setInt(2,borrowing_id);
                 execute_updateBorrowing.setDate(3,returnDate);
                 execute_updateBorrowing.executeUpdate();
                 if(due_date.before(return_date) || due_date.equals(return_date))
                 {
                      System.out.println("book return successfully");
                 }
                 else
                 {
                     System.out.println("Over due");
                 }
    }           
    public java.util.Date checkDueDate(int id)throws Exception
    {
                 String checkduedate="select due_date from borrower where book_id=?";
                 PreparedStatement execute_checkduedate=con.prepareStatement(checkduedate);
                 execute_checkduedate.setInt(1,id);
                 ResultSet resultOfexecute_checkduedate=execute_checkduedate.executeQuery();
                 java.util.Date duedate=null;
                 if(resultOfexecute_checkduedate.next())
                 {
                       duedate=resultOfexecute_checkduedate.getDate(1);
                 }
                 return duedate;
    }
                 
    public void createBook()throws Exception
    {
                 System.out.println("Enter the Book id");
                 int book_id=sc.nextInt();
                 System.out.println("Enter the Book name");
                 String book_name=sc.next();
                 System.out.println("Enter the Book author");
                 String book_author=sc.next();
                 System.out.println("Enter the Book publisher");
                 String book_publisher=sc.next();
                 System.out.println("Enter the Book genres");
                 String book_genres=sc.next();
                 System.out.println("Enter the Book price");
                 double book_price=sc.nextDouble();
                 System.out.println("Enter the Book publish year");
                 int book_publishyear=sc.nextInt();
                 System.out.println("Enter the Book edition");
                 int book_edition=sc.nextInt();
                 System.out.println("Enter the Book dimension");
                 double book_dimension=sc.nextDouble();
                 System.out.println("Enter the Book weight");
                 double book_weight=sc.nextDouble();
                 addBook(new Book(book_id,book_publishyear,book_edition,book_dimension,book_weight,book_name,book_author,book_publisher,book_genres,book_price));
    }
    public void createBorrower()throws Exception
    {
                    System.out.println("Enter the name");
                    String name=sc.next();
                    System.out.println("Enter the phone number");
                    String ph=sc.next();
                    System.out.println("Enter the ID");
                    int id=sc.nextInt();
                    System.out.println("Your new id : xxxx"+id);
                    addVisitor(new Visitors(id,name,ph));
                    displayBooks();
    }
    public boolean checkVisitor(int id)
    {
        try
        {
             String check_visitor="select * from visitor where id=?";
             PreparedStatement execute_check_visitor=con.prepareStatement(check_visitor);
             execute_check_visitor.setInt(1,id);
             ResultSet resultOfcheck_visitor=execute_check_visitor.executeQuery();
             return resultOfcheck_visitor.next();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
             
   public void addBorrower(int id,Borrowing borrower)throws Exception
   {
       System.out.println("Table id");
       int table_id=sc.nextInt();
       String addBorrower="insert into borrower(id,visitor_id,book_id,borrow_date,due_date) VALUES (?,?,?,?,?)";
       PreparedStatement execute_addBorrower=con.prepareStatement(addBorrower);
       execute_addBorrower.setInt(1,table_id);
       execute_addBorrower.setInt(2,id);
       execute_addBorrower.setInt(3,borrower.getbook_id());
       java.sql.Date borrow_date=new java.sql.Date(borrower.getcheckIn_date().getTime());
       java.sql.Date return_date=new java.sql.Date(borrower.getcheckOut_date().getTime());
       execute_addBorrower.setDate(4,borrow_date);
       execute_addBorrower.setDate(5,return_date);
       execute_addBorrower.executeUpdate();
   }
   public void showBorrowingHistory(int id)throws Exception
   {
       String displayBorrowingHistory="select visitor.name,book.name,borrower.borrow_date,library_borrower.return_date from visitor join borrower on visitor.id=borrower.visitor_id join book on book.id=borrower.book_id join library_borrower on library_borrower.borrower_id=borrower.id where visitor.id=?";
       PreparedStatement execute_displayBorrowingHistory=con.prepareStatement(displayBorrowingHistory);
       execute_displayBorrowingHistory.setInt(1,id);
       ResultSet resultOfexecute_displayBorrowingHistory=execute_displayBorrowingHistory.executeQuery();
       System.out.println("NAME                            BOOK                       BORROW               RETURN\n\n");
       while(resultOfexecute_displayBorrowingHistory.next())
       {
             System.out.print(resultOfexecute_displayBorrowingHistory.getString(1)+"                            ");
             System.out.print(resultOfexecute_displayBorrowingHistory.getString(2)+"                  ");
             System.out.print(resultOfexecute_displayBorrowingHistory.getDate(3)+"                       ");
             System.out.println(resultOfexecute_displayBorrowingHistory.getDate(4)+"                     ");
       }
   }
   public void close()throws Exception
   {
         con.close();
         System.out.println("Connection closed");
   }
       
}
