package com.library;
import java.util.*;
public class Visitors
{
    int id; 
    private String name,address,contact;
    Visitors(int id,String name,String contact)
    {
       this.id=id;
       this.name=name;
       this.contact=contact;
    }
   public void setName(String newName)
   {
        name=newName;
   }
   public String getName()
   {
        return this.name;
   }
   public void setContact(String newContact)
   {
        contact=newContact;
   }
   public String getContact()
   {
        return this.contact;
   }
   public void setId(int newId)
   {
        this.id=newId;
   }
   public int getId()
   {
        return id;
   }
}
