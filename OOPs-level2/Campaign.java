package campaigndetails;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
class Campaign
{
    String OwnerName;
    String campaignName,campaignEmail,campaignPhone;
    int campaignId;
    double fund;
    double poolfund;
    Campaign(String name,int id,String mail,String phoneNo)
    {
     campaignName=name;
     campaignId=id;
     campaignEmail=mail;
     campaignPhone=phoneNo;
   }
   public String getName()
   {
       return campaignName;
   }
   public int getId()
   {
       return campaignId;
   }
   public String getEmail()
   {
       return campaignEmail;
   }
   public String getphone()
   {
       return campaignPhone;
   }
   public void displayCampaign()
   {
       System.out.println("Donar Name:  "+this.getName()+"\n" +"Donar Id:  "+this.getId()+"\n" +"Donar Email:  "+this.getEmail()+"\n"+"Donar Phone No:  "+this.getphone());
   }

    
}
