package Abstract_Class_Assignment;

abstract class Animal {
    //An abstract method doesn't have its body
    abstract void sound();

    //non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

//subclass for an abstract class
class Lion extends Animal {
    //provide implementation of abstract method
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Animal A = new Lion();
        //accessing the non-abstract methods
        A.eat();

        //instance for the child class
        Lion L = new Lion();
        //calling abstract methods
        L.sound();
        //calling non-abstract methods
        L.eat();
    }
}