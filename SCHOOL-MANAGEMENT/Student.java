import java.util.Date;

class Student
{
   private int id;
   private String name,father_name,gender,address,contact;
   private Date dob;
   Student(int id,String name,Date dob,String father_name,String gender,String address,String contact)
   {
       this.id=id;
       this.dob=dob;
       this.name=name;
       this.father_name=father_name;
       this.gender=gender;
       this.address=address;
       this.contact=contact;
   }
   public void setid(int new_id)
   {
       this.id=new_id;
   }
   public int getid()
   {
       return this.id;
   }//
   public void setName(String new_name)
   {
       this.name=new_name;
   }
   public String getName()
   {
       return this.name;
   }//
   public String getFName()
   {
       return this.father_name;
   }
   public void setFname(String new_Fname)
   {
       this.father_name=new_Fname;
   }//
   public Date getDOB()
   {
       return this.dob;
   }
   public void setDOB(Date new_dob)
   {
       this.dob=new_dob;
   }//
   public void setGender(String new_gender)
   {
       this.gender=new_gender;
   }
   public String getGender()
   {
       return this.gender;
   }//
   public void setAddress(String new_address)
   {
       this.address=new_address;
   }
   public String getAddress()
   {
       return this.address;
   }//
   public void setContact(String new_contact)
   {
       this.contact=new_contact;
   }
   public String getContact()
   {
       return this.contact;
   }
}
