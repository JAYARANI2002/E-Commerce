import java.sql.*;
import java.util.Date;
import java.text.*;
public class JDBC_connectivity
{
    public static void main(String args[])throws Exception
    {
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school","postgres", "1234");
       //Statement str= c.createStatement();
         /*     String query="select * from student ";//select
       ResultSet rs = str.executeQuery(query);
       while(rs.next())
       {
           int id=rs.getInt("id");
           String name=rs.getString("name");
           Date dob=rs.getDate("dob");
           System.out.println(" Student Id : "+id+"\n"+" Student Name : "+name+"\n"+" Student DOB :"+dob);
       }*/
       SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
       Date d=f.parse("2001-09-09");
       Student s=new Student(32,"Sathya","Ganesh",d,"female","qws street","63692040453");
       System.out.println(s.getDOB());
       java.sql.Date date=new java.sql.Date(d.getTime());
       System.out.println(date);
       String query="insert into student (id,name,dob,fathername,gender,address,contact) values (?,?,?,?,?,?,?);";
       PreparedStatement stmt=c.prepareStatement(query);
       stmt.setInt(1,1);
       stmt.setString(2,"Kani");
       stmt.setDate(3,date.valueOf("2002-08-12"));
       stmt.setString(4,"Gobi");
       stmt.setString(5,"male");
       stmt.setString(6,"carb street");
       stmt.setString(7,"12343662543");
       stmt.executeUpdate(query);
       System.out.println("The data is inserted");
       c.close();
    }
}

