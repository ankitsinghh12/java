package Loops_Assignment;

import java.util.Scanner;
/* An Armstrong number is a positive m-digit number that is equal to
    the sum of the mth powers of their digits. */
public class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        int r, result = 0;
        //assigning n to a temp variable
        int temp = n;
        //loop executes when the condition is true
        while (n != 0) {
            r = n % 10;
            /* LOGIC : power of r for each individual and add those numbers
            eg: 153 = 1^3 + 5^3 + 3^3 ==> 1 + 125 + 27 ==> 153 */
            result += (r * r * r);
            n = n / 10;
        }
        //returns if orig and result are equal
        return temp == result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        //User Input stored in num
        int num = new Scanner(System.in).nextInt();
        //if(true)
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        /* The first few Armstrong numbers between 0 to 999 are
            1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407. */
    }
}