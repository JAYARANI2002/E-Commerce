import java.util.Scanner;
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
     public void displayProduct(String category)
     {
          
          
     }
     public void getProductDetails()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the code");
         int code=sc.nextInt();
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the price");
         float price=sc.nextFloat();
         Product product=new Product(code,name,price);
         
     }
    
    
