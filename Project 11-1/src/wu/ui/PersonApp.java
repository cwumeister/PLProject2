package wu.ui;
import wu.business.Customer;
import wu.business.Employee;
import wu.business.Person;

import java.util.Scanner;


    public class PersonApp {

        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            System.out.println("Welcome to the Person App\n");
            Scanner sc = new Scanner(System.in);
            String choice = "y";

            while (choice.equalsIgnoreCase("y"))
            {
                System.out.print("Create customer or employee? (c/e) ");
                String cOre = sc.nextLine();

                if (cOre.equalsIgnoreCase("c"))
                {
                    String first = Console.getString("Enter first name: ");
                    String last = Console.getString("Enter last name: ");
                    String email = Console.getString("Enter email: ");
                    String custnum = Console.getString("Enter customer number: ");

                    System.out.println(first + last+ email+ custnum);

                }

                else if (cOre.equalsIgnoreCase("e"))
                {
                    String first = Console.getString("Enter first name: ");
                    String last = Console.getString("Enter last name: ");
                    String email = Console.getString("Enter email: ");
                    String custnum = Console.getString("Enter social security: ");

                }

                System.out.print("\nContinue? (y/n): ");
                choice = sc.nextLine();
                System.out.println();
            }

        }
    }

/*   System.out.print("\nEnter first name: ");
                    String first = sc.nextLine();
                    c.setFirst(first);

                    System.out.print("Enter last: ");
                    String last = sc.nextLine();
                    c.setLast(last);

                    System.out.print("Enter email address: ");
                    String email = sc.nextLine();
                    c.setEmail(email);

                    System.out.print("Customer number: ");
                    String cust = sc.nextLine();
                    c.setCustNum(cust);

                    System.out.println("\nYou entered:\nName: "+first+" "+last+"\nEmail: "+email+"\nCustomer number: "+cust);

                    Employee one

                    System.out.println(first + last+ email+ custnum);

                    System.out.print("Social security number: ");
                    String social = sc.nextLine();

                    System.out.println("\nYou entered:\nName: "+first+" "+last+"\nEmail: "+email+"\nSocial security number: "+social);

*/