package wu.ui;
import wu.business.Customer;
import wu.business.Employee;
import wu.business.Person;

import java.util.Scanner;


public class PersonApp {

    public static void print(Person p) {
        Console.displayLine("You entered:\n" + p.getDisplayText());
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Welcome to the Person Tester application\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        Person p = null;

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Create customer or employee? (c/e): ");
            String cOre = sc.nextLine();
            System.out.println();

            if (cOre.equalsIgnoreCase("c")) {
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
            } else if (cOre.equalsIgnoreCase("e")) {
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
