package Loops_Assignment;
import java.util.Scanner;

public class EvenAndOddNumbers {

    static void evenNumbers(int n) {
        System.out.println("These are Even Numbers from 0 to " + n);
        //loop executes until the condition becomes false
        for (int i = 1; i <= n; i++) {
            //using equal operator ( == )
            //If it is divided by 2,leaves remainder 0 then it is even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    static void oddNumbers(int n) {
        System.out.println("\nThese are Odd Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            // using not equal operator( != )
            // If the remainder is not equal to 0 then given number is odd number
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        //input stored in num
        num = sc.nextInt();
        //Even Numbers method
        evenNumbers(num);
        //Even Numbers method
        oddNumbers(num);
    }
}
