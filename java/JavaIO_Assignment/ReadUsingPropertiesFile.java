package JavaIO_Assignment;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadUsingPropertiesFile {

    public static void main(String args[]) {
        Properties prop = readPropertiesFile("pf.txt");
        System.out.println("Name: " + prop.getProperty("Name"));
        System.out.println("E.no: " + prop.getProperty("E.no"));
        System.out.println("College: " + prop.getProperty("College"));
    }

    public static Properties readPropertiesFile(String fileName) {
        Properties prop = null;
        try {

            //Instantiating the FileInputStream for output file
            FileInputStream fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
            fis.close();

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
        return prop;
    }
}

