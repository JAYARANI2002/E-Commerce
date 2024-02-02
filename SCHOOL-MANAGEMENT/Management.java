import java.sql.*;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class Management
{
  static Connection con;
  static
  {
     try
     {
          con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/school","postgres", "1234");
     }
     catch(Exception e)
     {
          System.out.println("Exception in db connection");
     }
     
  }
  static  Scanner sc=new Scanner(System.in);
  public void addStudent()throws Exception
  {
           System.out.println("Enter the student details");
           System.out.println("----------");
           System.out.println("Enter the id");
           int id=sc.nextInt();
           System.out.println("Enter the Name");
           String name=sc.next();
           System.out.println("Enter the Father Name");
           String f_name=sc.next();
           System.out.println("Enter the DOB");
           String d=sc.next();
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
           Date date=sdf.parse(d);
           System.out.println("Enter the Gender");
           String gender=sc.next();
           System.out.println("Enter the Address");
           String address=sc.nextLine();
           sc.nextLine();
           System.out.println("Enter the contact");
           String contact=sc.next();
           //System.out.println("Enter the previous class you studied");
           //int last=sc.nextInt();
           
           System.out.println("----------");
           Student stu=new Student(id,name,date,f_name,gender,address,contact);
           addStu_table(stu);
           //selectClass();
  }
  public void addTeacher()throws Exception
  {
           System.out.println("Enter the teacher details");
           System.out.println("-------------------");
           System.out.println("Enter the id");
           int id=sc.nextInt();// 1
           System.out.println("Select the salutation");
           Salutation sal_array[]=Salutation.values();
           for(Salutation sal:sal_array)
           {
               System.out.println(sal);
           }
           int salutation_id=sc.nextInt();// 2
           Salutation salutation=sal_array[salutation_id];
           System.out.println("Enter the Name");
           String name=sc.next();// 3
           System.out.println("Select the Subject [0...4]");
           System.out.println("-----------------");
           Subject sub_array[]=Subject.values();
           for(Subject sub:sub_array)
           {
              System.out.println(sub);
           }
           System.out.println("-----------------");
           System.out.println("enter subject id");
           int subject_id=sc.nextInt();//4
           Subject subject=sub_array[subject_id];
           System.out.println("Select the Degree [0.. 2]");
           Degree deg_array[]=Degree.values();
           System.out.println("-----------------");
           for(Degree deg:deg_array)
           {
                System.out.println(deg);
           }
           System.out.println("-----------------");
           System.out.println("enter the Degree id");
           int deg_id=sc.nextInt();//5
           Degree degree=deg_array[deg_id];
           System.out.println("Enter the experience");
           int experience=sc.nextInt();// 6
           System.out.println("Enter the DOJ");
           String doj=sc.next();// 7
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
           Date date=sdf.parse(doj);
           System.out.println("-------------------");
           Teacher tea=new Teacher(id,salutation,name,degree,subject,date,experience);
           addTeacher_table(tea);
           //addClassTeacher(
  }
  public void addStu_table(Student student)throws Exception
  {
          String sql_Query="insert into student (id,name,dob,fathername,gender,address,contact) values (?,?,?,?,?,?,?);";
          PreparedStatement stmt=con.prepareStatement(sql_Query);
          stmt.setInt(1,student.getid());
          stmt.setString(2,student.getName());
          java.sql.Date date=new java.sql.Date(student.getDOB().getTime());
          stmt.setDate(3,date);
          stmt.setString(4,student.getFName());
          stmt.setString(5,student.getGender());
          stmt.setString(6,student.getAddress());
          stmt.setString(7,student.getContact());
          stmt.executeUpdate();
          System.out.println("The data is inserted");
  }
  public void addTeacher_table(Teacher teacher)throws Exception
  {
          String sql_Query="insert into Teacher(id,name,s_id,degree_id,experience,major_id,doj) values (?,?,?,?,?,?,?);";
          PreparedStatement stmt=con.prepareStatement(sql_Query);
          stmt.setInt(1,teacher.getid());
          stmt.setString(2,teacher.getName());
          int s_id=Salutation.valueOf(teacher.getSalutation().toString()).ordinal()+1;
          stmt.setInt(3,s_id);
          int degree_id=Degree.valueOf(teacher.getDegree().toString()).ordinal()+1;
          stmt.setInt(4,degree_id);
          stmt.setInt(5,teacher.getExperience());
          int subject_id=Subject.valueOf(teacher.getSubject().toString()).ordinal()+1;
          stmt.setInt(6,subject_id);
          java.sql.Date date=new java.sql.Date(teacher.getDOJ().getTime());
          stmt.setDate(7,date);
          stmt.executeUpdate();
          System.out.println("The data is inserted");
  }
  public void addClassDetails()throws Exception
  {
          String sql_Query="insert into class (id,standard,year,sec,status) values(?,?,?,?,?);";
          PreparedStatement stmt=con.prepareStatement(sql_Query);
          System.out.println("Enter the class Details\n enter the id");
          int class_id=sc.nextInt();
          stmt.setInt(1,class_id);
          System.out.println("Enter the standard");
          int standard=sc.nextInt();
          stmt.setInt(2,standard);
          System.out.println("Enter the accademic year");
          stmt.setInt(3,sc.nextInt());
          System.out.println("enter section [A,B,.....F] as 1,2, ...6");
          int section=sc.nextInt();
          stmt.setInt(4,section);
          System.out.println("Enter the status of the class[Active/InActive]");
          boolean status=sc.nextBoolean();
          stmt.setBoolean(5,status);
          stmt.executeUpdate();
          System.out.println("The data is inserted");
          addClass_Student(class_id);
          addSubject_Teacher(class_id,standard,section);
  }
  void addClass_Student(int id)throws Exception
  {
           String add_Student_Query="insert into class_student(id,class_id,student_id) values(?,?,?)";
           PreparedStatement statement=con.prepareStatement(add_Student_Query);
           System.out.println("Enter the id for class_Student table");
           int s_id=sc.nextInt();
           statement.setInt(1,s_id);
           statement.setInt(2,id);
           String display_student="select id,name from student";
           PreparedStatement sql=con.prepareStatement(display_student);
           ResultSet op=sql.executeQuery();
           System.out.println("Student id  Student Name");
           while(op.next())
           {
              System.out.print("    "+op.getInt(1)+"     ");
              System.out.println(op.getString(2));
           }
           System.out.println("enter the student id");
           int stu_id=sc.nextInt();
           statement.setInt(3,stu_id);
           statement.executeUpdate();
           System.out.println("The data is inserted");
  }
  public void addSubject_Teacher(int id,int std,int sec)throws Exception
  { 
          String sql_Query="insert into class_teacher(id,class_id,teacher_id,tamilteacher_id,englishteacher_id,mathsteacher_id, scienceteacher_id,socialteacher_id,no_students) values(?,?,?,?,?,?,?,?,?)"; 
           int tamil_id=0,english_id=0,maths_id=0,science_id=0,social_id=0,total=0;
           if(std>=1 && std <=5)
           {               
                 System.out.println("*****  Select tamil teacher id ***** ");
                 tamil_id=selectTeacher(Degree.UG,Subject.TAMIL); 
                 System.out.println("*****  Select english teacher id *****");  
                 english_id=selectTeacher(Degree.UG,Subject.ENGLISH);
                 System.out.println("*****  Select maths teacher id *****");
                 maths_id=selectTeacher(Degree.UG,Subject.MATHS);
                 System.out.println("*****  Select science teacher id *****");
                 science_id=selectTeacher(Degree.UG,Subject.SCIENCE);
                 System.out.println("*****  Select social teacher id *****");
                 social_id=selectTeacher(Degree.UG,Subject.SOCIAL_SCIENCE); 
           }
           PreparedStatement q1=con.prepareStatement(sql_Query);
           System.out.println("Enter the id class_teacher table");
           q1.setInt(1,sc.nextInt());
           q1.setInt(2,id);
          // ArrayList<Integer> list=new ArrayList<>();
           System.out.println("Enter the class teacher id");
           int teacher_id=sc.nextInt();
           q1.setInt(3,teacher_id);
           q1.setInt(4,tamil_id);
           q1.setInt(5,english_id);
           q1.setInt(6,maths_id);
           q1.setInt(7,science_id);
           q1.setInt(8,social_id);
           String count_Query="select count(id) from class_student where class_id=?";
           PreparedStatement query_statement=con.prepareStatement(count_Query);
           query_statement.setInt(1,id);
           ResultSet output=query_statement.executeQuery();
           if(output.next())
           {
              total=output.getInt(1);
           }
           else
           {
              total=0;
           }
           q1.setInt(9,total);
           q1.executeUpdate();
           System.out.println("The data is inserted");
           /*else if(std>=6 && std <=10)
           {                  
                 select_teacher="select id from teacher where degree_id=(select id from degree where name='PG');";
           } 
           else
           {                  
                 select_teacher="select id from teacher where degree_id=(select id from degree where name='PHD');";
           } */ 
  }    
  public void addExam(Exam exam)throws Exception
  {
          String insert_exam="insert into exam (id,exam_name,month,year) values (?,?,?,?)";
          PreparedStatement insert_exam_query=con.prepareStatement(insert_exam);
          insert_exam_query.setInt(1,exam.getId());
          insert_exam_query.setString(2,exam.getName());
          insert_exam_query.setString(3,exam.getMonth());
          insert_exam_query.setInt(4,exam.getYear());
          insert_exam_query.executeUpdate();
          System.out.println("Exam is added");
  }
           
  public void addStudentMark()throws Exception
  {
          System.out.println("Enter the subject mark of the student");
          String subject_array[]={"Tamil","English","Maths","Science","Social-Science"};
          for(int i=0;i<5;i++)
          {
              String add_mark="insert into subject_mark(id,student_id,exam_id,subject_id,mark) values (?,?,?,?,?)";
              System.out.println("Enter the subject mark table id");
              int table_id=sc.nextInt();
              System.out.println("Enter the student id");
              int student_id=sc.nextInt();
              System.out.println("Enter the exam id");
              int exam_id=sc.nextInt();
              System.out.println("Enter the "+subject_array[i]+" mark");
              int subject_id=i+1;
              System.out.println("Enter the mark he/she scored");
              double mark=sc.nextDouble();
              mark=Math.round(mark);
              PreparedStatement execute_add_mark=con.prepareStatement(add_mark);
              execute_add_mark.setInt(1,table_id);
              execute_add_mark.setInt(2,student_id);
              execute_add_mark.setInt(3,exam_id);
              execute_add_mark.setInt(4,subject_id);
              execute_add_mark.setDouble(5,mark);
              execute_add_mark.executeUpdate();
          }
          System.out.println("The data is inserted");
  }
           
  int selectTeacher(Degree degree,Subject subject)throws Exception
  {
          String select_teacher="select teacher.id,teacher.name,degree.name,major.subject from teacher join major on teacher.major_id=major.id join degree on teacher.degree_id=degree.id where degree.name=? and major.subject=?;";
          PreparedStatement stmt1=con.prepareStatement(select_teacher);
          stmt1.setString(1,degree.toString());
          stmt1.setString(2,subject.toString());
          ResultSet set=stmt1.executeQuery();  
          System.out.println("Id  Name  Degree  Major");
          while(set.next())
          { 
                System.out.print(set.getInt(1)+"  ");
                System.out.print(set.getString(2)+"  ");
                System.out.print(set.getString(3)+"  ");
                System.out.println(set.getString(4));
          }
          System.out.println("select.....");
          int id=sc.nextInt(); 
          return id;
  }                      
  public void showDetails()throws Exception
  {
          System.out.println("____________________");
          System.out.println("1. Student Details");
          System.out.println("2. Teacher Details");
          System.out.println("3. Class Details");
          System.out.println("____________________");
          System.out.println("Enter the choice");
          int choice=sc.nextInt();
          switch(choice)
          {
             case 1:
             {
                 String sql_Query="select student.id,student.name,class.standard,Section.name,class.year from student join class_student on student_id=student.id join class on class.id=class_student.class_id join section on section.id=class.sec order By standard";
                 PreparedStatement stmt=con.prepareStatement(sql_Query);
                 ResultSet rs=stmt.executeQuery();
                 System.out.println("ID\tName\tStd\tSec\tYear");
                 while(rs.next())
                 {
                        System.out.print(rs.getInt(1));
                        System.out.print("\t"+rs.getString(2));
                        System.out.print("\t"+rs.getString(3));
                        System.out.print("\t"+rs.getString(4));
                        System.out.println("\t"+rs.getInt(5));
                 }
                 break;
              }
              case 2:
              {
                  String sql_Query="select teacher.id,salutation.name ||' '|| teacher.name,degree.name,major.subject ,teacher.doj from teacher join salutation on teacher.s_id=salutation.id join degree on degree.id=teacher.degree_id join major on major.id=teacher.major_id;";                  
                 PreparedStatement stmt=con.prepareStatement(sql_Query);
                 ResultSet rs=stmt.executeQuery();
                 System.out.println("ID  Name\tDegree\tMajor\t\tDOJ");
                 while(rs.next())
                 {
                        System.out.print(rs.getInt(1));
                        System.out.print("  "+rs.getString(2)+"\t");
                        System.out.print(rs.getString(3)+"\t");
                        System.out.print(rs.getString(4)+"\t\t");
                        System.out.println(rs.getDate(5));
                 }
                 break;
              }
              case 3:
              {
                 String sql_Query="select class.id,class.";
              }
          } 
   }
   public void closeDB()throws Exception
   {
         con.close();
   }
}
