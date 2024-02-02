class Customer
{
    private int id;
    private String name,contact,address;
    Customer(int id,String name,String contact,String address)
    {
       this.id=id;
       this.name=name;
       this.contact=contact;
       this.address=address;
    }
    public int getId()
    {
       return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getContact()
    {
        return this.contact;
    }
    public String getAddress()
    {
         return this.address;
    }
    public String toString()
    {
        return id+ " " +name+" "+ contact+ " " +address;
    }
}
