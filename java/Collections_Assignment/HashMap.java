package Collections_Assignment;

public class HashMap {
    public static void main(String[] args) {
        //storing key in Integer and value in String
        java.util.HashMap<Integer, String> jala = new java.util.HashMap<>();

        /* If you try to insert the duplicate key, it will
            replace the element of the corresponding key.  */
        //a. Inserting Student ID as Key & Name as value using put() method
        jala.put(1, "Sharan");
        jala.put(2, "Rohit");
        jala.put(3, "Leo");
        jala.put(4, "Keerthana");
        jala.put(5, "Aditya");
        jala.put(6, "Manoj");
        jala.put(7, "Mahideep");
        jala.put(8, "Prapul");
        jala.put(9, "Dheeraj");
        jala.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("jala = " + jala);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(jala.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap jala : ");
        System.out.println(jala.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(jala.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(jala.containsValue("Sharan"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(jala.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(jala.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(jala.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        jala.remove(2, "Rohit");
        System.out.println(jala);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the jala to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(jala);
        System.out.println("icfai = " + icfai);
    }
}