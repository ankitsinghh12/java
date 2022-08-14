package JAVA_Basics;

public class PrintingName {

    static String name;
    String printName(String name){
        System.out.println(name);
        return name;
    }

    public static void main(String[] args){
        name = "Ankit Singh";

        // Creating obj for the class "PrintingName"
        PrintingName obj = new PrintingName();

        // This will call printName method which will print name="Ankit Singh" as we pass the name through the object
        obj.printName("Ankit Singh");

    }
}
