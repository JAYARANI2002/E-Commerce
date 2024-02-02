package com.library;
public class Book
{
   private int bookid,bookpublish_year,bookedition;
   private double bookdimension,bookweight,bookprice;
   private String bookname,bookauthor,bookpublisher,bookgenres;
   Book(int id,int publish_year,int edition,double dimension,double weight,String b_name,String b_author,String b_publisher,String b_genres,double price)
   {
        bookid=id;
        bookpublish_year=publish_year;
        bookedition=edition;
        bookdimension=dimension;
        bookweight=weight;
        bookname=b_name;
        bookauthor=b_author;
        bookpublisher=b_publisher;
        bookgenres=b_genres;
        bookprice=price;
   }
   public void setbookId(int newId)
   {
        bookid=newId;
   }
   public int getbookId()
   {
        return bookid;
   }
   public void setbookYear(int newYear)
   {
       bookpublish_year=newYear;
   }
   public int getbookYear()
   {
       return this.bookpublish_year;
   }
   public void setbookEdition(int newEdition)
   {
        bookedition=newEdition;
   }
   public int getbookEdition()
   {
        return this.bookedition;
   }
   public void setbookDimension(double newDimension)
   {
        bookdimension=newDimension;
   }
   public double getbookDimension()
   {
        return this.bookdimension;
   }
   public void setbookWeight(double newWeight)
   {
        bookweight=newWeight;
   }
   public double getbookWeight()
   {
        return this.bookweight;
   }
   public void setbookPrice(double newPrice)
   {
        bookprice=newPrice;
   }
   public double getbookPrice()
   {
        return this.bookprice;
   }
   public void setbookName(String newName)
   {
        bookname=newName;
   }
   public String getbookName()
   {
        return this.bookname;
   }
   public void setbookAuthor(String newAuthor)
   {
        bookauthor=newAuthor;
   }
   public String getbookAuthor()
   {
        return this.bookauthor;
   }
   public void setbookPublisher(String newPublisher)
   {
        bookpublisher=newPublisher;
   }
   public String getbookPublisher()
   {
        return this.bookpublisher;
   }
   public void setbookGenres(String newGenres)
   {
        bookgenres=newGenres;
   }
   public String getbookGenres()
   {
        return this.bookgenres;
   }
   @Override
   public String toString()
   {
      return this.getbookId()+" " +this.getbookYear()+" "+this.getbookEdition()+" "+this.getbookPrice()+" "+this.getbookName()+" "+this.getbookAuthor()+" "+this.getbookPublisher()+" "+this.getbookGenres();
   }
}
