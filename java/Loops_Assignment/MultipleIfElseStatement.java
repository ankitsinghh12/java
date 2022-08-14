package Loops_Assignment;

public class MultipleIfElseStatement {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        // Executes if a is greater than b & c
        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");

        }
        // Executes if b is greater than a & c
        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }
        // Executes if both a & b are smaller than c
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}