public class Bank
{
    private String name,branch,place,IFSC_Code,email;
    private int pho_no;
    Bank(String name,String branch,String place,String IFSC_Code,String email,int pho_no)
    {
        this.name=name;
        this.branch=branch;
        this.place=place;
        this.IFSC_Code=IFSC_Code;
        this.email=email;
        this.pho_no=pho_no;
    }
    public String getName()
    {
          return name;
    }
    public String getBranch()
    {
          return branch;
    }
    public String getPlace()
    {
          return place;
    }
    public String getIFSC_Code()
    {
          return IFSC_Code;
    }
    public String getEmail()
    {
          return email;
    }
    public int getPh()
    {
          return pho_no;
    }
}
