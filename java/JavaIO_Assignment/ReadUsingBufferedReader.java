package JavaIO_Assignment;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader class is used to read the text from a character-based input stream.
public class ReadUsingBufferedReader {
    public static void main(String args[]) {

        try {
            // Creates a FileReader
            //file path passed as parameter to the FileReader constructor.
            FileReader fr = new FileReader("bw.txt");
            // Creates a BufferedReader
            BufferedReader br = new BufferedReader(fr);

            int i;
            // If the read() method returns -1, there is no more data to read in the FileReader
            while ((i = br.read()) != -1) {
                //reads all characters one char at a time from the FileReader.
                System.out.print((char) i);
            }
            //closing FileWriter and BufferedWriter
            br.close();
            fr.close();
        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}