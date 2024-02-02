public class SuperMarket
{
    public static void main (String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("******************************");
         System.out.println("1. Add Customer");
         System.out.println("2. Add Product");
         System.out.println("3. Shopping...");
         System.out.println("4. Generate Bill");
         System.out.println("5. Exit");
         System.out.println("******************************");
         System.out.println("Enter the choice");
         int choice=sc.nextInt();
         while(choice)
         {
             Management m=new Management();
             case 1:
             {
                  m.addCustomer();
                  break;
             }
             case 2:
             {
                  m.addProduct();
                  break;
             }
             case 3:
             {
                  m.shopProduct();
                  break;
             }
             case 4:
             {
                  m.generateBill();
                  break;
             }
             case 5:
             {
                  System.exit(0);
             }
          }
    }
}
