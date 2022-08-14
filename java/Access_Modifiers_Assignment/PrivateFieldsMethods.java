package Access_Modifiers_Assignment;

public class PrivateFieldsMethods {
    //private fields
    private String name = "Sharan";
    private int age = 21;

    //private method
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    //main method
    public static void main(String[] args) {
        PrivateFieldsMethods obj = new PrivateFieldsMethods();
        //Printing the fields in main method
        System.out.println(obj.age);
        System.out.println(obj.name);
        //Calling the private method in main method
        obj.pvtMethod();
    }
    // NOTE : A subclass does not inherit the private members of its parent class
}