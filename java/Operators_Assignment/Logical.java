package Operators_Assignment;

public class Logical {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;
       
        System.out.println(a > b && a > c); 
        System.out.println(a < b && a < c);
        System.out.println(a > b && a < c); 

        
        System.out.println(a > b || a > c); 
        System.out.println(a < b || a < c); 
        System.out.println(a < b || a > c); 

 
        System.out.println(!(a > b));     
        System.out.println(!(a < b));    
    }
}