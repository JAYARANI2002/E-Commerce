class Shop
{
    int id;
    String name,address,contact;
    Shop(int id,String name,String address,String contact)
    {
         this.id=id;
         this.name=name;
         this.address=address;
         this.contact=contact;
    }
    public String toString()
    {
         return id+" "+name+" "+address+" "+contact;
    }

}
