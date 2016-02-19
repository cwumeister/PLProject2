package wu.ui;
import wu.business.Customer;
import wu.business.Employee;
import wu.business.Person;

import java.util.Scanner;


    public class PersonApp {

        public static void print(Person p)
        {
            Console.displayLine("You entered:\n" + p.getDisplayText());
        }

        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            System.out.println("Welcome to the Person Tester application\n");
            Scanner sc = new Scanner(System.in);
            String choice = "y";

            Person p = null;

            while (choice.equalsIgnoreCase("y"))
            {
                System.out.print("Create customer or employee? (c/e) ");
                String cOre = sc.nextLine();
                System.out.println();

                if (cOre.equalsIgnoreCase("c"))
                {
                    Customer c = new Customer();
                    String first = Console.getString("Enter first name: ");
                    c.setFirst(first);

                    String last = Console.getString("Enter last name: ");
                    c.setLast(last);

                    String email = Console.getString("Enter email address: ");
                    c.setEmail(email);

                    String custnum = Console.getString("Customer number: ");
                    c.setCustNum(custnum);

                    p = c;

                }

                else if (cOre.equalsIgnoreCase("e"))
                {
                    Employee e = new Employee();

                    String first = Console.getString("Enter first name: ");
                    e.setFirst(first);

                    String last = Console.getString("Enter last name: ");
                    e.setLast(last);

                    String email = Console.getString("Enter email address: ");
                    e.setEmail(email);

                    String ss = Console.getString("Social security number: ");
                    e.setSs(ss);

                    p = e;

                }

                System.out.println();
                print(p);

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