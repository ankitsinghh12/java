package JavaIO_Assignment;

import java.io.FileWriter;

// FileWriter class is used to write character-oriented data to a file.
public class WriteUsingFileWriter {
    public static void main(String[] args) {

        String s = "This text is written using FileWriter.";

        try {
            // Creates a FileWriter
            //file path passed as parameter to the FileWriter constructor.
            FileWriter fw = new FileWriter("fw.txt");

            //provides method to write string directly.
            fw.write(s);
            //closing FileWriter
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
