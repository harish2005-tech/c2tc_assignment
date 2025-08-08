package ACTIVITY;

import java.util.Scanner;

public class ACTIVITY {

    public static void main(String args[]) {
       try(Scanner scan = new Scanner(System.in)){ 
        System.out.println("Enter your name:");
        String n = scan.nextLine();
        System.out.println("Hello " + n);
        scan.close();
       }
    }
}