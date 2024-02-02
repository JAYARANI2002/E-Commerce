class Product
{
   int id;
   String name;
   flaot price;
   Product(int id,String name,float price)
   {
       this.id=id;
       this.name=name;
       this.price=price;
   }
   public String toString()
   {
       return id+" "+name+" "+price;
   }
}
