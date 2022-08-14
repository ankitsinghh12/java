package Collections_Assignment;

import java.util.Iterator;
//Java HashSet class is used to create a collection that uses a hash table for storage.
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> jala = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        jala.add("zero");
        jala.add("one");
        jala.add("two");
        jala.add("three");
        jala.add("four");
        jala.add("five");
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        jala.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        jala.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("jala = " + jala);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = jala.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(jala.clone());

        //c. Removing a specific element using remove() method
        jala.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("jala = " + jala);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(jala.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(jala.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(jala.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        jala.clear();
        System.out.println("jala = " + jala);
    }
}