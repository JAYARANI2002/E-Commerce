/*
Create a class for storing the details of the Donator like donator name,campaign,payment type,etc.
Create a another class for storing the campaign details like launch date, campaign name, list of donator for that campaign,etc
Create a separate class for processing the data of Campaign class and Donator class..
In the main class, Create a menu type structure to add campaigns, add donations, options to list the campaign and donators
All the input should be given during the run time..
Date should be validated, and when the user donates for a campaign, donation date should be between the launch date and deadline..
*/ 
package campaigndetails;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;

public class CampaignDetails
{
   public static void main(String args[]) throws ParseException  
   {
     SimpleDateFormat fdate=new SimpleDateFormat("dd/MM/yyyy");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the owner name");
     String owner=sc.next();
     System.out.println("Enter the Campaign Organizing starting date");
     Date start=fdate.parse(sc.next());
     System.out.println("Enter the Campaign ending date");
     Date end=fdate.parse(sc.next());
     Process process=new Process(start,end);
     process.createCamp();
     while(true)
     {
       System.out.println("Enter 1:Campaign information");
       System.out.println("Enter 2:Participate");
       System.out.println("Enter 3:Donar List");
       System.out.println("Enter 4:Campaign List");
       System.out.println("Enter 5:Exit from the Program");
       int option=sc.nextInt();
       switch(option)
       {
            case 1:process.showCampList();break;
            case 2:process.getChoice();break;
            case 3:process.showDonatorList();break;
            case 4:process.showCampaignList();break;
            case 5:System.exit(0);break;
            default:
            {
                  System.out.println("Enter correct choice");
            }
         }
       }
    /* if((process.camp1_Amount+process.camp2_Amount+process.camp3_Amount)==process.goal)  
     {
       System.out.println("Goal amount is reached");
     } */
     
    }  
     
}
