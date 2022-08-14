package Access_Modifiers_Assignment;

public class ProtectedClassFieldsMethod {
    //Protected field
    protected String name;

    //Protected method
    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

//Accessing protected fields and methods from other class in the same package
class protectedClass_03 {
    public static void main(String[] args) {
        //Creating object of ProtectedClassFieldsMethod class.
        ProtectedClassFieldsMethod pc = new ProtectedClassFieldsMethod();
        //Accessing protected field
        pc.name = "Protected Method";
        //Accessing protected method
        pc.protectedMethod();
    }
}