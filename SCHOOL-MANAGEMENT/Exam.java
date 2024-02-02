class Exam
{
   private int id,year;
   private String name,month;
   Exam(int id,String month,int year,String name)
   {
        this.id=id;
        this.month=month;
        this.year=year;
        this.name=name;
   }
   public int getId()
   {
       return this.id;
   }
   public String getName()
   {
        return this.name;
   }
   public String getMonth()
   {
       return this.month;
   }
   public int getYear()
   {
       return this.year;
   }
}
   
