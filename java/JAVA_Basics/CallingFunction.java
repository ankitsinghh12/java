package JAVA_Basics;

public class CallingFunction {

    // FUNCTION THAT PRINTS THE NAME
    // as the method is static, main function can call it.
    static void printName(){
        System.out.println("Name is: Ankit Singh");
    }
    public static void main(String[] args){
        printName();
    }
}
