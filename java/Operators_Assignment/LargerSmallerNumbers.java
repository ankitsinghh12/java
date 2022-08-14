package Operators_Assignment;

public class LargerSmallerNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Java Ternary operators(?,:) is used as one line replacement for if and else statement
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        System.out.println("Smaller Number is " + min);
        System.out.println("Larger Number is " + max);

        //Same logic with if and else statements takes more lines to code
        if (a > b) {
            System.out.println("Larger Number is " + a);
        } else {
            System.out.println("Smaller Number is " + a);
        }
        if (b > a) {
            System.out.println("Larger Number is " + b);
        } else {
            System.out.println("Smaller Number is " + b);
        }
    }
}