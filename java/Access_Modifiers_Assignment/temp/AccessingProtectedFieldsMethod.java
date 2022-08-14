package Access_Modifiers_Assignment.temp;

import Access_Modifiers_Assignment.ProtectedClassFieldsMethod;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {

    public static void main(String[] args) {
        //Creating object of AccessingProtectedFieldsMethod
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();
        //Accessing protected field
        sub.name = "Protected Method in SubClass";
        //Accessing protected method
        sub.protectedMethod();
    }
    /* NOTE :
             - protected member can be access within the package and
                outside the package but within the child classes */
}
