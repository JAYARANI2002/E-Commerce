import java.util.Date;
class Teacher
{
   private int id,experience;
   private String name;
   private Subject subject;
   private Degree degree;
   private Date doj;
   private Salutation salutation;
   Teacher(int id,Salutation salutation,String name,Degree degree,Subject subject,Date doj,int experience)
   {
       this.id=id;
       this.name=name;
       this.salutation=salutation;
       this.subject=subject;
       this.degree=degree;
       this.doj=doj;
       this.experience=experience;
   }
   public void setSalutation(Salutation new_salutation)
   {
       this.salutation=new_salutation;
   }
   public Salutation getSalutation()
   {
       return this.salutation;
   }
   public void setid(int new_id)
   {
       this.id=new_id;
   }
   public int getid()
   {
       return this.id;
   }
   public void setExperience(int new_Experience)
   {
       this.experience=new_Experience;
   }
   public int getExperience()
   {
       return this.experience;
   }
   public void setName(String new_name)
   {
       this.name=new_name;
   }
   public String getName()
   {
       return this.name;
   }
   public void setSubject(Subject new_subject)
   {
       this.subject=new_subject;
   }
   public Subject getSubject()
   {
       return this.subject;
   }
   public void setDegree(Degree new_degree)
   {
       this.degree=new_degree;
   }
   public Degree getDegree()
   {
       return this.degree;
   }
   public Date getDOJ()
   {
       return this.doj;
   }
   public void setDOJ(Date new_doj)
   {
       this.doj=new_doj;
   }
} 
