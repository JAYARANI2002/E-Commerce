package campaigndetails;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
class Camp
{
   String camp_Organizer,camp_Name;
   Date camp_start;
   Date camp_end;
   Camp(String oname,Date cStart,Date cEnd,String camp)
   {
        camp_Organizer=oname;
        camp_Name=camp;
        camp_start=cStart;
        camp_end=cEnd;
   }
   @ Override
   public String toString()
   {     
          return camp_Organizer+" "+camp_Name+" "+camp_start+" "+camp_end;
   }
}
