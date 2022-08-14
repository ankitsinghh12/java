package Loops_Assignment;

import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner num = new Scanner(System.in);
        //inputs are stored in a,b,c.
        System.out.print("Enter First Number : ");
        a = num.nextInt();
        System.out.print("Enter Second Number : ");
        b = num.nextInt();
        System.out.print("Enter Third Number : ");
        c = num.nextInt();

        //Executes if a is largest
        if ((a > b) && (a > c)) {
            System.out.println("The Largest Number is : " + a);
        }
        //Executes if b is largest
        else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number is : " + b);
        }
        //Executes if a,b are not largest
        else {
            System.out.println("The Largest Number is : " + c);
        }
    }
}