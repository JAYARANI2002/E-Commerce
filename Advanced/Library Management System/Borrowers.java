package com.library;
import java.util.*;
class Borrowing
{
    static int count=1000;
    ArrayList<Visitors> visitors;
    Book book;
    Date checkIn_date,checkOut_date;
    Borrowers(int book_id,Date checkIn_date,Date checkOut_date)
    {
      this.checkIn_date=checkIn_date;
      this.checkOut_date=checkOut_date;
    }
    public int getborrower_id()
    {
        return visitors.getID();
    }
    public int getbook_id()
    {
        return book.getbookId();
    }
    public Date getcheckIn_date()
    {
       return checkIn_date;
    }
    public Date getcheckOut_date()
    {
       return checkOut_date;
    }
}
