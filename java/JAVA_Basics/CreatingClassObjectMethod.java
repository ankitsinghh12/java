package JAVA_Basics;

class CreatingClassObjectMethod{
    
    void myMethod(){
        System.out.println("this is text present in myMethod :) ");
    }
    
    public static void main(String[] args){
        
        // Here we are creating an object of the class
        CreatingClassObjectMethod obj = new CreatingClassObjectMethod();

        // By using the object we are calling the methods present in that class
        obj.myMethod();

    }
}