class Management
{
   static customer_id=0;
   ArrayList<Customer> customer=new ArrayList<>();
   ArrayList<Product> product=new ArrayList<>();
   ArrayList<Bill> bill=new ArrayList<>();
   public void addCustomer()
   {
       System.out.println("Enter the customer name");
       String name=sc.nextLine();
       System.out.println("Enter the customer contact number");
       String contact=sc.next();
       validateContact(contact);
       System.out.println("Enter the customer residence details");
       String address=sc.next();sc.nextLine();
       check_Customer(contact);
       if(customer.size()==0)
       {
           customer_id++;
           Customer shop_customer=new Customer(customer_id,name,contact,address);
           customer.add(shop_customer);
       }
       else
       {
           Iterator iterate=customer.iterator();
           while(iterate.next())
           {
               if(customer.getContact()==contact)
               {
                   
   }
   public Customer check_Customer(String mobileNo)
   {
       if(mobileNo.equals(
   public void validateContact(String contact)
   {
       long number=Long.parseLong(contact);
       while(true)
       {
              if(Math.round(Math.log10(number))==10)
              {
                 break;
              }
              else
              {
                  System.out.println("Enter the customer contact number");
                  contact=sc.next();
              }
       }
   }     
