/*Write a model and manager class for Student.
1.Print out all Subject.
2. Print out all Student Names.
3. Top 5 Students 
4. Passed Students
5. Failed Students
6. List out all subjects with highest mark.*/
package studentdetails;
import java.util.*;
class Manager
{
    //float toppers[]=new float[6];
    int passCount=0;
    int failCount=0;
    public void printSubjects()
    {
         System.out.println("All subjects"+"\n"+"Tamil"+"\n"+"English"+"\n"+"Maths"+"\n"+"Science"+"\n"+"Social Science");
    }
     void topFiveStudents(Students[] student)
    {
        Arrays.sort(student);
        int i;
        for(i=student.length-1;i>=1;i--)
        {
            System.out.println(student[i].getStudentName()+" "+student[i].getStudentTotal());
        }
   }
  
   void passDetails(Students[] student)
   {
     int i;
     for(i=0;i<student.length;i++)
     {
     if(student[i].tamil>35 && student[i].english>35 && student[i].maths>35 && student[i].science>35 && student[i].social_science>35)
     {
           passCount++;
           System.out.println(student[i].getStudentName());
     }
     
   } 
   System.out.println("Pass count= "+passCount);
  }
  void failDetails(Students[] student)
   {
     int i;
     for(i=0;i<student.length;i++)
     {
     if(student[i].tamil<35 || student[i].english<35 || student[i].maths<35 || student[i].science<35 || student[i].social_science<35)
     {
           failCount++;
           System.out.println(student[i].getStudentName());
     }
    }
    System.out.println("FailCount= "+failCount); 
   }
   void highestMark(Students[] student)
   {
     int i;
     float tamil_HighMark=0;
     float english_HighMark=0;
     float maths_HighMark=0;
     float science_HighMark=0;
     float social_HighMark=0;
     for(i=0;i<student.length;i++)
     {
        if(student[i].tamil>tamil_HighMark)
        {
           tamil_HighMark=student[i].tamil;
        }
        if(student[i].english>english_HighMark)
        {
           english_HighMark=student[i].english;
        }
        if(student[i].maths>maths_HighMark)
        {
           maths_HighMark=student[i].maths;
        }
        if(student[i].science>science_HighMark)
        {
          science_HighMark=student[i].science;
        }
        if(student[i].social_science>social_HighMark)
        {
          social_HighMark=student[i].social_science;
        }
     }
        System.out.println("Tamil Highest Mark :"+tamil_HighMark);
        System.out.println("English Highest Mark :"+english_HighMark);
        System.out.println("Maths Highest Mark :"+maths_HighMark);
        System.out.println("Science Highest Mark :"+science_HighMark);
        System.out.println("SocialScience Highest Mark :"+social_HighMark);
    
  }
}
class Students implements Comparable<Students>
{
    private String name;
    float tamil;
    float english;
    float maths;
    float science;
    float social_science;
    float total;
    Students(String name,float tamil,float english,float maths,float science,float social_science)
    {
         this.name=name;
         this.tamil=tamil;
         this.english=english;
         this.maths=maths;
         this.science=science;
         this.social_science=social_science;
         total=tamil+english+maths+science+social_science;
    }
    public String getStudentName()
    {
         return this.name;
    }
    public float getStudentTotal()
    {
         return total;
    }
    public int compareTo(Students s)
     {
      if(total==s.total)
      {
         return 0;
      }
      if(total<s.total)
      {
         return -1;
      }
      return 1;
   }
    
   
}

public class SchoolManagement
{
   public static void main(String[] args)
   {
   Manager manager=new Manager();
   Students[] student=new Students[6];
   int i;
   student[0]=new Students("AAA",96f,90f,97f,96.5f,100f);
   student[1]=new Students("BBB",90f,74f,58f,78.5f,90f);
   student[2]=new Students("CCC",49f,60f,37f,56.5f,70f);
   student[3]=new Students("DDD",73f,60f,47f,46.5f,50f);
   student[4]=new Students("EEE",60f,30f,27f,38.5f,69f);
   student[5]=new Students("FFF",50f,45f,34f,61f,70f);
   
   System.out.println("1.Print out all Subject");
   manager.printSubjects();
   System.out.println("2. Print out all Student Names");
   for(i=0;i<student.length;i++)
   {
       System.out.println(student[i].getStudentName());
   }
   System.out.println("3. Top 5 Students ");
   manager.topFiveStudents(student);
   System.out.println("4. Passed Students");
   manager.passDetails(student);
   System.out.println("5. Failed Students");
   manager.failDetails(student);
   System.out.println("6. List out all subjects with highest mark.");
   manager.highestMark(student);
   }
}
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
