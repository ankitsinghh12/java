package Interfaces_Assignment;

public interface InterfacePublicFieldsMethod {
    //all the fields are public, static and final by default
    int num = 111; //values assigned

    public void myMethod();
}

//Implemented interface to a class
class Ankit08 implements InterfacePublicFieldsMethod {
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }

    //main method
    public static void main(String[] args) {
        Ankit08 j = new Ankit08();
        //printing the values of the interface fields
        System.out.println(num);
        //calling the interface methods
        j.myMethod();
    }
}
