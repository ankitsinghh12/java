package Exceptions_Assignment;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        //try block can be followed by one or more catch blocks.
        try {
            int[] a = new int[6];
            //Arithmetic Exception
            a[6] = 10 / 0;
            //ArrayIndexOutOfBounds Exception
            System.out.println(a[10]);
        }
        // Multiple catch blocks
        //Each catch block must contain a different exception handler.
        catch (ArithmeticException e) {
            //throwing exception with your own message
            System.out.println("Arithmetic Exception occurs");
            e.getStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            e.getStackTrace();
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
            e.getStackTrace();
        }
        System.out.println("Main method ended");
    }
    /*
 NOTE :
    1.Try block contains two exceptions. But at a time only one exception occurs
    and its corresponding catch block is executed.
 */
}