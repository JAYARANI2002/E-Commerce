package com.library;
import java.sql.*;
import java.util.Scanner;
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

    public void addBook(Book b)throws Exception
    {
        //sql
        String addBook_query="insert into Book( id , name , author , publisher , genres , publication_year , edition , price , dimension , weight ) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement execute_addBook_query=con.prepareStatement(addBook_query);
        execute_addBook_query.setInt(1,b.getId());
        execute_addBook_query.setString(2,b.getName());
        execute_addBook_query.setString(3,b.getAuthor());
        execute_addBook_query.setString(4,b.getPublisher());
        execute_addBook_query.setString(5,b.getGenres());
        execute_addBook_query.setInt(6,b.getYear());
        execute_addBook_query.setInt(7,b.getEdition());
        execute_addBook_query.setFloat(8,b.getPrice());
        execute_addBook_query.setFloat(9,b.getDimension());
        execute_addBook_query.setFloat(10,b.getWeight());
        execute_addBook_query.executeUpdate();
    }
}
