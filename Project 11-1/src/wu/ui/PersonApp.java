package wu.ui;

import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Welcome to the Person App");
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            System.out.print("Create customer or employee? (c/e) ");
            String cOre = sc.nextLine();

            if (cOre.equalsIgnoreCase("c"))
            {
                System.out.print("\nEnter first name: ");
                String first = sc.nextLine();

                System.out.print("Enter last: ");
                String last = sc.nextLine();

                System.out.print("Enter email address: ");
                String email = sc.nextLine();

                System.out.print("Customer number: ");
                String cust = sc.nextLine();

                System.out.println("\nYou entered:\nName: "+first+" "+last+"\nEmail: "+email+"\nCustomer number: "+cust);

            }
            else if (cOre.equalsIgnoreCase("e"))
            {
                System.out.print("\nEnter first name: ");
                String first = sc.nextLine();

                System.out.print("Enter last: ");
                String last = sc.nextLine();

                System.out.print("Enter email address: ");
                String email = sc.nextLine();

                System.out.print("Social security number: ");
                String social = sc.nextLine();

                System.out.println("\nYou entered:\nName: "+first+" "+last+"\nEmail: "+email+"\nSocial security number: "+social);
            }



            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }

    }
}
