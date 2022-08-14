package Operators_Assignment;

public class Arithmetic {
    static void Addition(int a, int b){
        System.out.println("sum is: "+ (a+b));
    }
    static void Subraction(int a, int b){
        System.out.println("difference is: " + (a-b));
    }
    static void multiplication(int a, int b){
        System.out.println("product is: "+a*b);
   
}
    static void division(int a, int b){
        System.out.println("division is: "+a/b);
    }
    static void modulo(int a, int b){
        System.out.println("modulo is: "+a%b);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        
        Addition(a, b);
        Subraction(a, b);
        multiplication(a, b);
        division(a, b);
        modulo(a, b);
    }
}
    