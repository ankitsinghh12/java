package JAVA_Basics;

public class LocalGlobalVariable {
    
    int a = 10;

    void Localvariable(){
        int a = 5;
        System.out.println(a);
    }

    public static void main(String[] args){
        LocalGlobalVariable obj = new LocalGlobalVariable();

        // Printing instance variable 
        System.out.println(obj.a);

        // Printing LocalVariable declared in the method
        obj.Localvariable(); 

    }
}
