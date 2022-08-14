package Loops_Assignment;

import java.util.Scanner;

/* prime numbers can't be divided by other numbers than itself or 1.
    For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. */
public class PrimeNumber {

    static void primeNumber(int n) {
        //initially we set "isPrime" to false
        boolean isPrime = false;
        //Prime numbers are only divisible by 1 and the number itself.
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }
        //Executes if(not true)
        if (!isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number to check if its prime number: ");
        //User Input stores in num
        num = new Scanner(System.in).nextInt();
        //calling method
        primeNumber(num);
    }
}