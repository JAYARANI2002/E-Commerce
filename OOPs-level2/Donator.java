package campaigndetails;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
class Donator
{
   private String donator_name,donator_email,donator_phone,donator_paymentType;
   private int donator_id;
   private Date donator_date;
   private double donator_amount;
   private String donator_camp;
   Donator(String name,int id,Date date,String emailId,String phoneNo,String typeOfCamp,String paymentType,double amount)
   {
     donator_name=name;
     donator_id=id;
     donator_date=date;
     donator_email=emailId;
     donator_phone=phoneNo;
     donator_camp=typeOfCamp;
     donator_amount=amount;
     donator_paymentType=paymentType;
   }
   public String getName()
   {
       return donator_name;
   }
   public int getId()
   {
       return donator_id;
   }
   public Date getDate()
   {
       return donator_date;
   }
   public String getEmail()
   {
       return donator_email;
   }
   public String getphone()
   {
       return donator_phone;
   }  
   public double getAmount()
   {
       return donator_amount;
   }
   public String getPaymentType()
   {
       return donator_paymentType;
   }
   public String getCamp()
   {
       return donator_camp;
   }
   public String toString()
   {
       return this.getName()+" " +this.getId()+"  " +this.getDate()+" "+this.getEmail()+" "+this.getphone()+" "+this.getCamp()+" "+this.getPaymentType()+" "+this.getAmount();
              //System.out.println("Donar Name:  "+this.getName()+"\n" +"Donar Id:  "+this.getId()+"\n" +"Donar Email:  "+this.getEmail()+"\n"+"Donar Phone No:  "+this.getphone());
   }  
}
