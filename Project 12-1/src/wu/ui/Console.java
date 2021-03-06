package wu.ui;

import java.util.Scanner;

/**
 * Created by Connie Wu on 2/19/2016.
 */

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine(){
        System.out.println();
    }

    public static void displayLine(String s){
        System.out.println(s);
    }

    public static String getString(String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt){
        int i = 0;
        while (true){
            System.out.print(prompt);
            try{
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static double getDouble(String prompt){
        double d = 0;
        while (true){
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }

        }
        return d;
    }
}
