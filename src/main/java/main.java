/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the order amount? ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.printf("What is the state? ");
        String st = sc.nextLine();
        double t = 0;
        System.out.printf("%s",st);
        if(Objects.equals(st, "WI"))
            t = .055;
        System.out.printf("The subtotal is $%.2f.\n" +
             "The tax is $%.2f.\n" +
             "The total is $%.2f.", a, t*a, t*a+a);
    }
}