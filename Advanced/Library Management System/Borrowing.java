package com.library;
import java.util.*;
class Borrowing
{
    int id;
    Date checkIn_date,checkOut_date;
    Borrowing(int book_id,Date checkIn_date,Date checkOut_date)
    {
      id=book_id;
      this.checkIn_date=checkIn_date;
      this.checkOut_date=checkOut_date;
    }
    public int getbook_id()
    {
        return id;
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
