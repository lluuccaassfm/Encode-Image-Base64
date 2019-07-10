import java.io.*;
import java.util.Base64;

public class Image {

    public static void main(String[] args) {

        encoder("../ImageTest/src/map.png");

    }

    private static String encoder(String filePath) {
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.getEncoder().encodeToString(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        System.out.println(base64File);
        return base64File;
    }
}
