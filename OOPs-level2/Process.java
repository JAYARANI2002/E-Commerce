package campaigndetails;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
class Process
{
   Scanner sc=new Scanner(System.in);
   SimpleDateFormat fdate=new SimpleDateFormat("dd/MM/yyyy");
   static int count=0;
   Date launching;
   Date deadline,ldate;
   String status;
   String campType;
   static int id=0;
   Donator donarList[];
   Campaign campaignList[];
   Camp campList[];
   final double goal=100000;
   static int donarCount=0;
   static int campaignCount=0;
   int campCount;
   Donator[] donar;
   double camp1_Amount=0;
   double camp2_Amount=0;
   double camp3_Amount=0;
   Process(Date start,Date end)
   {   
           donarList = new Donator[100];
           campList=new Camp[10];
           campaignList =new Campaign[20];
           launching=start;
           deadline=end;
   }
   void getChoice() throws ParseException 
   {
        System.out.println("Enter your choice 1 or 2");
        int choice=sc.nextInt();
        if(choice==1)
        {
           System.out.println("PARTICIPATE AS A DONATOR");
           addDetails();
        }
        else
        {
            System.out.println("PARTICIPATE AS A CAMPAIGN TEAM MEMBER");
            participateCampaign();
        }
    }
    String  campaignStatus(Date date)
    {
       Date campDate=date;
       if(campDate.compareTo(launching)>0 && campDate.compareTo(deadline)<0)
       {
         
          status="Ongoing Campaign";
          return status;
       }
       else if(campDate.compareTo(launching)<0 && campDate.compareTo(deadline)<0)
       {
         
          status="wait for Campaign";
          return status;
       }
       else
       {
          status="Completed Campaign";
          return status;
       }
    }
    public void addDetails() throws ParseException  
    {
         System.out.println("Enter your Name to participate in the program");
         String name=sc.next();
         System.out.println("select Campaign details enter 1 or 2 or 3");
         int choice=sc. nextInt();
         String typeOfCamp=selectCampaign(choice);
         System.out.println(typeOfCamp);
         showCamp(typeOfCamp);
         System.out.println("Enter your login date in this format dd/MM/yyyy");
         String ldate=sc.next();
         Date logindate=fdate.parse(ldate);
         String status=campaignStatus(logindate);
         if(status.equalsIgnoreCase("ongoing campaign")){
         System.out.println("select option "+name);
         System.out.println("Enter your valid proof details");
         int id=count++;
         double amount;
         String emailid,phoneNo,paymentType;
         System.out.println("Enter your PhoneNo");
         phoneNo=sc.next();
         while(phoneNo.length()!=10)
         {
             System.out.println("Enter the valid phone number");
             System.out.println("Enter your PhoneNo");
             phoneNo=sc.next();
         }
         System.out.println("Enter your Email-Id");
         emailid=sc.next();
         while(!emailid.endsWith("@gmail.com"))
         {
             System.out.println("Enter your Email-Id");
             emailid=sc.next();
         }
         String permission=paymentAllow(campList,typeOfCamp,logindate); 
         System.out.println(permission);  
         if(permission.equalsIgnoreCase("valid"))
         {
              System.out.println("Enter your paymentType");
              paymentType=sc.next();
              amountTransaction(paymentType);
              System.out.println("Enter your amount");
              amount=sc.nextDouble();
              if(typeOfCamp.equalsIgnoreCase("Cancer"))
              {
                    camp1_Amount+=amount;
              }  
              if(typeOfCamp.equalsIgnoreCase("Children"))
              {
                  camp2_Amount+=amount;
              } 
              if(typeOfCamp.equalsIgnoreCase("AnimalWelfare"))
              {
                  camp3_Amount+=amount;
              }  
         donarList[donarCount]=new Donator(name,id,logindate,emailid,phoneNo,typeOfCamp,paymentType,amount);
         donarCount++;
         System.out.println("===============you are added as a donar==================");
         System.out.println("------------------------------------------------------------------------------------");
        }
        else if (permission.equalsIgnoreCase("invalid"))
        {
           System.out.println("select camp");
        }
      }
      
         else
        {
           System.out.println("=========please select next camp!!!!!!========");
        }
    }
    public String paymentAllow(Camp c[],String type,Date date)

    { 
       Camp cp[]=c;
       Date tdate=date;
       String cname=type;
       String p_permission="";
       for(int i=0;i<c.length;i++)
       {
          if((c[i].camp_Name).equalsIgnoreCase(cname))
          {
                Date startDonate=c[i].camp_start;
                Date endDonate=c[i].camp_end;
                System.out.println("Your selected camp is "+cname+"please donate your amount from "+startDonate +" to "+endDonate);
                if(tdate.compareTo(startDonate)>0 && tdate.compareTo(endDonate)<0)
                {
                  p_permission+="valid";
                }
                else if(tdate.compareTo(startDonate)==0 && tdate.compareTo(endDonate)==0)
                {
                  p_permission+="valid";
                }
                else
                {
                    p_permission+="invalid";
                }
           }

         } 
         return p_permission;
             
    } 
    public String selectCampaign(int choice)
    {
          int ch=choice;
          if(ch==1)
          {
                 campType="Cancer";
          }
          else if(ch==2)
          {
                 campType="Children";
          }
          else if(ch==3)
          {
                 campType="AnimalWelfare";
          }
          else
          {
             System.out.println("Select correct campaign");
          }
          return campType;
    }
    public void amountTransaction(String type)
    {
        String ptype=type;
        if(ptype.equalsIgnoreCase("online"))
        {
            System.out.println("Select the online platform");
            selectPlatform();
        }
        if(ptype.equalsIgnoreCase("cash"))
        {
            System.out.println("Type of Cash Delivary");
            selectMode();
        }
    }
     void selectPlatform()
     {
        System.out.println("select platform");
        String platform=sc.next();
        System.out.println("select bank");
        String bank=sc.next();
        System.out.println("Enter card no");
        String cardNo=sc.next();
    } 
     void selectMode()
     {
        System.out.println("select Mode of Transaction");//card cash check
        String mode=sc.next();
        if(mode.equalsIgnoreCase("card"))
        {
            System.out.println("select bank");
            String bank=sc.next();
            System.out.println("Enter card no");
            String cardNo=sc.next();
        }
        if(mode.equalsIgnoreCase("check") || (mode.equalsIgnoreCase("cash")))
        {
            return ;
        }
        
    }
    public void participateCampaign() throws ParseException  
    {
      String name,emailid,phoneNo,paymentType,campWork;
      System.out.println("Enter your name");
      name=sc.next();
      ++id;
      System.out.println("Enter your PhoneNo");
      phoneNo=sc.next();
      System.out.println("Enter your Email-Id");
      emailid=sc.next();
      System.out.println("Enter your work");
      campWork=sc.next();
      campaignList[campaignCount]=new Campaign(name,id,emailid,phoneNo);
      System.out.println("------------------------------------------------------------------------------------");
      campaignCount++;
      return ;          
     
    }
    public void createCamp() throws ParseException  
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter count create Campaign ");
      campCount=sc.nextInt();
      for(int i=0;i<campCount;i++)
      {
            System.out.print("Enter the Organizer name                ");
            String orgaName=sc.next();
            System.out.print("Campaign Organizing Time-Starting date  ");
            String cstart=sc.next();
            Date campStart=fdate.parse(cstart);
            System.out.print("Campaign Organizing Time-End date       ");
            String cend=sc.next();
            Date campEnd=fdate.parse(cend);
            System.out.print("Enter your Campaign name :              ");
            String camp=sc.next();
            campList[i]=new Camp(orgaName,campStart,campEnd,camp);
            System.out.println("------------------------------------------------------------------------------------");

      }
    }
    void showCampList()
    {
       if(campList.length==0)
       {
          System.out.println("-------No such camp!!!!---------");
       }
       else
       {  
          int i;
          for(i=0;i<campCount;i++)
          {
             System.out.println(campList[i].toString());
             System.out.println("------------------------------------------------------------------------------------");
          }
       }
    }
    void showCamp(String campN)
    {
          int i;
          String ctype=campN;
          for(i=0;i<campCount;i++)
          {
             if(ctype.equals(campList[i].camp_Name))
             {
                System.out.println(campList[i].toString());
                System.out.println("------------------------------------------------------------------------------------");
             }
          }
    }
    void showCampaignList()
    {
       int i;
       if(campaignList.length==0)
       {
          System.out.println("Add Campaign");
       }
       else
       {
          for(i=0;i<campaignCount;i++)
          {
             System.out.println(campaignList[i].toString());
             System.out.println("------------------------------------------------------------------------------------");
          }
       }
    }
    void showDonatorList()
    {
       int i;
       if(donarList.length==0)
       {
          System.out.println("Add Donar");
       }
       else
       {
          for(i=0;i<donarCount;i++)
          {
             System.out.println(donarList[i].toString());
             System.out.println("------------------------------------------------------------------------------------");
          }
      }
    }  
}
