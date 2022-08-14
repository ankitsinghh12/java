package Operators_Assignment;

public class Equal_NotEqual {

    public static void main(String[] args) {
        
        // 1st number
        int a = 10;
        
        // 2nd number
        int b = 20;

        // 3rd number
        int c = 30;

        // 4th number
        int d = 30; 

        //equal operator (==)
        if (a == b) {
            System.out.println("Both are numbers equal");
        }else if(a != b){
            // As both are different numbers--> this will be printed
            System.out.println("Both are not equal");
        }
        //not equal operator (!=)
        if (c == d) {
            // As both are Same numbers--> this will be printed
            System.out.println("Both numbers are same");
        }else{
            System.out.println("Both numbers are different");
        }
    }
}