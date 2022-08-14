package JavaIO_Assignment;

import java.io.FileInputStream;
import java.io.InputStream;

//FileInputStream class obtains input bytes from a file. It is used for reading byte-oriented data
public class ReadUsingInputStream {

    public static void main(String[] args) {

        try {
            // FileInputStream is a subclass of InputStream
            //file path passed as parameter to the FileInputStream constructor.
            InputStream fis = new FileInputStream("os.txt");
            int i;
            //If the read() method returns -1, there is no more data to read in the FileInputStream
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            // Closes the input stream
            fis.close();
        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.getStackTrace();
        }
    }
}
