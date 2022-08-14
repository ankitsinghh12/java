package JavaIO_Assignment;

import java.io.*;

//reading bytes is faster using BufferedInputStream
public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {

        try {
            // Creates a FileInputStream
            //file path passed as parameter to the FileInputStream constructor.
            FileInputStream fis = new FileInputStream("bos.txt");
            // Creates a BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            // while loop continues until a -1 value is read from the BufferedInputStream read() method
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            //closing Streams
            bis.close();
            fis.close();

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.getStackTrace();
        }
    }
}