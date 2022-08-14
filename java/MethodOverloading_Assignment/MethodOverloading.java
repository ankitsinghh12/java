package MethodOverloading_Assignment;

public class MethodOverloading {
    int num1;
    int num2;
    int rollNo;
    String name;

    // 01.Two methods with the same name but different number of parameters of same type
    void method1(int num1) {
        this.num1 = num1;
        System.out.println("1.First number : " + num1);
    }

    void method1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }

    // 02.Two methods with the same name but different number of parameters of different data type
    //same method name one parameter
    void method2(int rollNo) {
        this.rollNo = rollNo;  //Integer
        System.out.println("2.Roll number : " + rollNo);
    }
    //same method name two parameters
    void method2(int rollNo, String name) {
        this.rollNo = rollNo; //Integer
        this.name = name;     //String
        System.out.println("2.Roll number : " + rollNo + " ; " + "Name : " + name);
    }

    // 04.Two methods with the same name and same number of parameters of different type
    //same method name different parameter type
    void method4(int rollNo) {
        this.rollNo = rollNo;  //Integer data type
        System.out.println("4.Roll number : " + rollNo);
    }
    //same method name different parameter type
    void method4(String name) {
        this.name = name;   //String
        System.out.println("4.Name : " + name);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        // 01.Calling the methods from main method
        mo.method1(11);
        mo.method1(10, 20);

        // 02.Calling the methods from main method
        mo.method2(317);
        mo.method2(317, "Sharan");

        // 03.Calling the methods from main method
        mo.method4(317);
        mo.method4("Sharan");
    }
/*
NOTE :
  03. We can not define more than one method with the same name, Order, and type of the arguments.
      It would be a compiler error.

  05. The compiler does not consider the return type while differentiating the overloaded method.
      But you cannot declare two methods with the same signature and different return types.
      It will throw a compile-time error.
 */
}