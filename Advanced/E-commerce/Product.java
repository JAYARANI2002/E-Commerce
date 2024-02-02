class Product
{
    private int code;
    private String name;
    private float price;
    Product(){}
    Product(int id,String name,float price)
    {
         code=id;
         this.name=name;
         this.price=price;
    }
    public int getCode()
    {
          return code;
    }
    public String getName()
    {
          return name;
    }
    public float getPrice()
    {
         return price;
    }
    void displayCategory()
     {
         Categories category[]=Categories.values();
         for(Categories c:category)
         {
             System.out.print( "   "+c+"  ,");
         }
         System.out.println();
     }
}
    
    
