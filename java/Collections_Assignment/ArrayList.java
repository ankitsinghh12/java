package Collections_Assignment;

import java.util.Arrays;
import java.util.Iterator;
/* Java ArrayList class uses a dynamic array for storing the elements.
   It is like an array, but there is no size limit. We can add or remove elements anytime. */
public class ArrayList {

    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        java.util.ArrayList<String> jala = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\njala = " + jala);

        //a. adding elements to the ArrayList using add method using add() method
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("jala = " + jala);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = jala.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        jala.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("jala = " + jala);

        //d. Removing an element at a specific index using remove() method
        jala.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("jala = " + jala);

        //e. Updating the element at a specific index using set() method
        jala.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("jala = " + jala);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(jala.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(jala.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(jala.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(jala.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        jala.clear();
        System.out.println("jala = " + jala);
    }
}