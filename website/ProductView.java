import java.util.Scanner;
public class ProductView
{
                            while(true)
                            {
                                System.out.println(" _________________________");
                                System.out.println("|1. purchase              |");
                                System.out.println("|2. cancel                |");
                                System.out.println("|3. return                |");
                                System.out.println("|_________________________|");
                                System.out.println("\n\n Enter the choice");
                                int opinion=sc.nextInt();
                                switch(opinion)
                                {
                                     case 1:
                                     {
                                         System.out.println("Search the category");
                                         new Product().displayCategory();
                                         String category=sc.next();
                                         purchaseProduct();
                                         break;
                                     }
                                }
                            }
