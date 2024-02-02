import java.sql.*;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class School_Program
{

   public static void main(String args[]) throws Exception 
   {
       System.out.println("1. Student Admission");
       System.out.println("2. Teacher Details");
       System.out.println("3. Show Details");
       System.out.println("4. Class Details");
       System.out.println("5. Add Exam");
       System.out.println("6. Add Student mark Details");
       System.out.println("7. Quit");
       Management m=new Management();
       while(true)
       {
          System.out.println("Enter your choice");
          Scanner sc=new Scanner(System.in);
          int c=sc.nextInt();
          switch(c)
          {
             case 1:
                  m.addStudent();
                  break;
             case 2:
                  m.addTeacher();
                  break;
             case 3:
                  m.showDetails();
                  break;
             case 4:
                  m.addClassDetails();
                  break;
             case 7:
                  m.closeDB();
                  System.out.println("DB connection closed");
                  System.exit(0);
             case 5:
                  System.out.println("Enter the Exam Table id");
                  int exam_id=sc.nextInt();
                  System.out.println("Enter the exam month [january,feb.....]");
                  String month=sc.next();
                  System.out.println("Enter the exam year [2023,2022.....]");
                  int year=sc.nextInt();
                  System.out.println("Enter the exam name Monthly,Quaterly...");
                  String exam_Name=sc.next();
                  Exam exam=new Exam(exam_id,month,year,exam_Name);
                  m.addExam(exam); 
                  break;
             case 6:
                  m.addStudentMark();
                  break;
             default:
                  System.out.println("Enter the correct choice");
         }
      } 
   }
}

 
